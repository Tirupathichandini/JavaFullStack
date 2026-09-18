create database commands;

use commands;

show databases;

-- DDL commands

create table Employees(
emp_id integer,
name varchar(20),
salary integer
);

Alter table employees add column location varchar(20);
alter table employees modify name varchar(10);
alter table employees rename column emp_id to id;

alter table employees drop column location;

Alter table employees add column location varchar(20) first;
Alter table employees add column location varchar(20) after name;
Alter table employees add column location varchar(20);

rename table employees to emp;

drop table emp;
drop database commands;

create table students(
id integer,
Name varchar(20),
Marks integer
);

select * from students;

insert into students values(1,'suma', 90);
insert into students values(2,'madhu', 85);
insert into students values(3,'srinu', 70);

truncate students;
