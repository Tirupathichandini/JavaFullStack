import cv2
import time
import csv
import math
from ultralytics import YOLO

# Excel Report Libraries
from datetime import datetime
from openpyxl import Workbook
from openpyxl.styles import Font, Alignment

# -----------------------------
# 1. Load YOLO Segmentation Model
# -----------------------------
model = YOLO("yolov8s-seg.pt")

# -----------------------------
# 2. Allowed Classes
# -----------------------------
allowed_classes = {"person"}

# -----------------------------
# 3. Filters
# -----------------------------
CONF_THRES = 0.55
MIN_FRAMES_TO_CONFIRM = 4
LOST_TIMEOUT = 12

FRAME_SKIP_DRAW = 4
SAVE_VIDEO = True
DISPLAY_FPS = 20

# -----------------------------
# 4. Tracking + Counting Data
# -----------------------------
track_history = {}
unique_objects = {cls: [] for cls in allowed_classes}
DIST_THRES = 50

# -----------------------------
# 5. CSV Setup
# -----------------------------
csv_file = open("tracking_report.csv", mode="w", newline="")
csv_writer = csv.writer(csv_file)

csv_writer.writerow([
    "Timestamp", "Frame", "Track_ID", "Label",
    "Confidence", "Time_Seen(sec)", "Center_X", "Center_Y"
])

# -----------------------------
# 6. Webcam
# -----------------------------
cap = cv2.VideoCapture(0)
cap.set(cv2.CAP_PROP_FRAME_WIDTH, 640)
cap.set(cv2.CAP_PROP_FRAME_HEIGHT, 480)

if not cap.isOpened():
    print("Camera not accessible")
    exit()

# -----------------------------
# 7. Video Save Setup
# -----------------------------
fourcc = cv2.VideoWriter_fourcc(*"mp4v")
out = None

prev_time = time.time()
frame_count = 0
fps = 0

print("Running... Press Q to Quit")

# -----------------------------
# 8. Loop
# -----------------------------
while True:
    ret, frame = cap.read()
    if not ret:
        break

    frame_count += 1

    # ✅ REAL FPS CALCULATION (NEW)
    curr_time = time.time()
    current_fps = 1 / (curr_time - prev_time)
    fps = 0.9 * fps + 0.1 * current_fps
    prev_time = curr_time

    # ✅ Initialize VideoWriter with REAL FPS (FIX)
    if out is None and SAVE_VIDEO:
        h, w, _ = frame.shape
        out = cv2.VideoWriter("output.mp4", fourcc, max(5, int(fps)), (w, h))

    try:
        results = model.track(frame, persist=True, tracker="botsort.yaml")
    except Exception as e:
        print("Tracking error:", e)
        continue

    active_ids = set()
    annotated_frame = frame.copy()

    for r in results:

        if r.masks is None or r.boxes is None or r.boxes.id is None:
            continue

        masks = r.masks.data.cpu().numpy()

        for i, mask in enumerate(masks):

            cls_id = int(r.boxes.cls[i])
            label = model.names[cls_id]

            if label not in allowed_classes:
                continue

            track_id = int(r.boxes.id[i])
            conf = float(r.boxes.conf[i])
            x1, y1, x2, y2 = map(int, r.boxes.xyxy[i])

            if conf < CONF_THRES:
                continue

            active_ids.add(track_id)

            # Center
            cx = (x1 + x2) // 2
            cy = (y1 + y2) // 2

            # Unique counting
            is_new = True
            for px, py in unique_objects[label]:
                if math.hypot(cx - px, cy - py) < DIST_THRES:
                    is_new = False
                    break

            if is_new:
                unique_objects[label].append((cx, cy))

            # Time
            time_sec = 0
            if track_id in track_history:
                frames_seen = track_history[track_id]["frames"]
                time_sec = frames_seen / DISPLAY_FPS

            # CSV logging
            csv_writer.writerow([
                datetime.now().strftime("%Y-%m-%d %H:%M:%S"),
                frame_count,
                track_id,
                label,
                round(conf, 2),
                round(time_sec, 2),
                cx,
                cy
            ])

            # Draw mask
            mask_crop = mask[y1:y2, x1:x2]
            if mask_crop.size == 0:
                continue

            color = (0, 255, 0)
            overlay = annotated_frame.copy()
            region = overlay[y1:y2, x1:x2]
            region[mask_crop > 0.5] = color
            annotated_frame = cv2.addWeighted(annotated_frame, 0.7, overlay, 0.3, 0)

            # Label
            cv2.putText(
                annotated_frame,
                f"ID-{track_id} | {time_sec:.1f}s",
                (x1, y1 - 10),
                cv2.FONT_HERSHEY_SIMPLEX,
                0.6,
                color,
                2
            )

            # Track history
            if track_id not in track_history:
                track_history[track_id] = {
                    "label": label,
                    "frames": 1,
                    "last_seen": frame_count
                }
            else:
                track_history[track_id]["frames"] += 1
                track_history[track_id]["last_seen"] = frame_count

    # Remove lost IDs
    to_delete = []
    for tid, info in track_history.items():
        if frame_count - info["last_seen"] > LOST_TIMEOUT:
            to_delete.append(tid)

    for tid in to_delete:
        del track_history[tid]

    # Person count
    person_count = 0
    for tid, info in track_history.items():
        if info["frames"] >= MIN_FRAMES_TO_CONFIRM:
            person_count += 1

    # UI Drawing
    if frame_count % FRAME_SKIP_DRAW == 0:

        cv2.putText(
            annotated_frame,
            f"Persons: {person_count}",
            (10, 30),
            cv2.FONT_HERSHEY_SIMPLEX,
            0.9,
            (0, 0, 255),
            3
        )

        cv2.putText(
            annotated_frame,
            f"FPS: {fps:.2f}",
            (10, 65),
            cv2.FONT_HERSHEY_SIMPLEX,
            0.7,
            (0, 255, 255),
            2
        )

        if SAVE_VIDEO and out:
            out.write(annotated_frame)

        cv2.imshow("OUTPUT", annotated_frame)

    if cv2.waitKey(1) & 0xFF == ord("q"):
        break

# -----------------------------
# 9. Excel Report
# -----------------------------
wb = Workbook()
ws = wb.active
ws.title = "Summary"

headers = ["Track ID", "Label", "Frames", "Duration(sec)"]
ws.append(headers)

for col in ws[1]:
    col.font = Font(bold=True)
    col.alignment = Alignment(horizontal="center")

for tid, info in track_history.items():
    duration = info["frames"] / DISPLAY_FPS
    ws.append([tid, info["label"], info["frames"], round(duration, 2)])

wb.save("tracking_summary.xlsx")

# Cleanup
cap.release()
if out:
    out.release()
csv_file.close()
cv2.destroyAllWindows()

print("\nDone. Reports saved.")