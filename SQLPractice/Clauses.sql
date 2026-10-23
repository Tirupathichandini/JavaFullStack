create database clauses;

use clauses;

create table departments(
dept_id integer primary key auto_increment,
dept_name varchar(20)
);

insert into departments(dept_name) values('CSE');
insert into departments(dept_id,dept_name) values(2,'IT'),(3,'EEE');
insert into departments(dept_name) values('AI');

select * from departments;


Create table students(
stu_id integer primary key,
stu_name varchar(20),
marks integer,
dept_id integer,
foreign key(dept_id)
references departments(dept_id)
);

insert into students values(1,'Surya', 100, 1);
insert into students values(2,'Sai', 85, 2);
insert into students values(3,'Ganesh',80, 4);
insert into students values(4,'Ramu', 95, 3);
insert into students values(5,'chandu', 98, 2);

select * from students;

-- --------------------------------
-- order by
-- --------------------------------

select * from students order by marks; -- by deafult it takes AESC
select * from students order by marks desc;
select * from students order by stu_name;
select * from students order by Stu_name desc;


-- ----------------------------
-- Limit
-- ----------------------------

select * from students limit 2; -- gives 2 rows
select * from students limit 3;
select * from students order by marks limit 3; -- gives 3 least marks and by default Aesc
select * from students order by marks limit 1; 
select * from students order by marks desc limit 3; 

-- Query to find Third Highest Marks
select marks from students order by marks desc limit 2,1; 


-- Query to find second Highest marks
select marks from students order by marks desc limit 1,1; 

select * from students order by marks desc limit 2,1; 
select * from students order by marks desc limit 2,2; 
select * from students order by marks desc limit 3,2; 
select * from students order by marks desc limit 1,3; 
select * from students order by marks desc limit 3,1; 


-- --------------------------
-- Group By
-- --------------------------

-- Query to find no.of students from each department
select dept_id,count(*) from Students group by dept_id;


-- Query to find total marks from each department
select dept_id,sum(marks) from Students group by dept_id;


-- Query to find Average marks from each department
select dept_id,Avg(marks) from Students group by dept_id;

select dept_id,sum(marks) from Students group by dept_id limit 2,1;
select dept_id,count(*) from Students where dept_id = 2;
select dept_id,count(*) from Students where dept_id = 3;
select dept_id,sum(marks) from Students where dept_id = 2;


-- ------------------------
-- Having
-- ------------------------

-- print departments count in which departments have more than 1 student.
select dept_id,count(*) from students group by dept_id having count(*) > 1;


-- print departments and sum of marks but sum of marks greater than 100.
select dept_id,sum(marks) from students group by dept_id having sum(marks)>100;
select dept_id,sum(marks) from students group by dept_id having sum(marks)>=100;


-- print departments and sum of marks but sum of marks less than 100.
select dept_id,sum(marks) from students group by dept_id having sum(marks)<100;


-- where works with actual table / Having works after we built Group by.

-- ------------------------
-- Where              
-- ------------------------

-- Print count of students from each department 
-- such that pick only students who scored above 80 marks 
-- and departments where students count is atleast greater than 1.
select dept_id,count(*) 
from students 
where marks > 80 
group by dept_id 
having count(*) > 1;


-- Print maximum marks of each department but consider only marks below 98
-- such that max marks of department is above 95.
select dept_id, max(marks) 
from students 
where marks < 98 
group by dept_id 
having max(marks) > 95;


insert into students values(6,'Dasu',97,4);
insert into students values(7,'Mohan',96,3);

select * from students;
select * from departments;
