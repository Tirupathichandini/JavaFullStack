use commands;

-- COUNT
select count(*) from students;
select count(name) from Students;

-- We use Alias name means temporary name
select count(name) as Student_name from Students;
select count(marks) from Students;
select count(marks) from Students where id=4;
select count(*) as total_count from Students;
select count(*) from Students where id=3;


-- SUM
select sum(marks) from students;
select sum(marks) from students where id=3;
select sum(id) from students;


-- AVERAGE
select avg(marks) from Students;
select avg(marks) from students where department = 'CIVIL';
select * from students;


-- MAX
select max(marks) from students;
select max(marks) as Total_marks from students;
select max(id) from students;


-- MIN
select min(marks) from students;
select min(id) from students;
select min(id) as student_id from students;

