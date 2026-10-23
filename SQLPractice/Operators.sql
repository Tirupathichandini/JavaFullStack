use commands;

alter table students add column department varchar(20);

insert into students values (1, 'Chandu', 99, 'IT');
insert into students values (2, 'Ramya',98, 'CSE');
insert into students values (3, 'chandini',95, 'civil');
insert into students values (4, 'surya',90, 'MECH');
insert into students values (5, 'Sunil',93, 'EEE');
insert into students values (6, 'Sri',91, 'ECE');

select * from students;

-- IN Operator
select * from students where id IN (1,2,3);
select * from students where id IN (1,4,6);
select department from students where name In ('Chandini','chandu');
select department,marks from students where department IN ('ECE','CIVIL');


-- NOT IN Operator
select * from students where id NOT IN (1,2,3);
select * from students where id not IN (2,3);


-- BETWEEN Operator
select * from students where id Between 2 and 4;
select * from students where id Between 1 and 4;
select department from students;
select id,department from students where id between 1 and 5;
select * from students;


-- NOT BETWEEN Operator
select * from students where id not Between 1 and 3;
select name from students where id not Between 2 and 4;
select department,marks from students where department Not IN ('ECE','CIVIL');


-- LIKE Operator
select * from students where department like 'c%';
select * from students where department like '%c%';
select * from students where department like '%T';
select * from students where department like '%e';
select * from students where department like '%E%';
select * from students where department like 'M_ch';
select * from students where department like '___';
select * from students where department like '____';
select * from students where department like '__';
select * from students where department like '__E';
select * from students where department like '_i%';
select * from students where department like '%E__';
select * from students where department like 'E_E';

-- NOT Like Operator
select * from students where department not like '%c%';
select * from students where department not like '____';
select * from students where department not like 'E_E';
select * from students where department not like '%E';
select * from students where department not like 'C%';
select * from students where department not like '__';

select * from students;

