create database constrains;
use constrains;

-- NOT NULL and UNIQUE

create table employees(
id integer,
name varchar(20) not null,
salary integer,
email varchar(20) unique
);

insert into employees values(1,'chandini',20000,'xyz@gmail.com');
insert into employees values(2,'sree',30000,'abc@gmail.com');
insert into employees values(3,'suma',40000,'abcd@gmail.com');
insert into employees(id,name,salary,email) values(4,'chandu',50000,'ijk@gmail.com');

Alter table employees modify column email varchar(20) not null;

select * from employees;


-- Primary Key, Check, Default

create table Voters(
Voter_id integer primary key,
name varchar(20),
age integer check(age>=18),
country varchar(10) default 'India'
);

insert into voters values(1,'chandini',19,'India');
insert into voters values(2,'kusuma',22,'India');
insert into voters values(3,'Ram',20,'India');
insert into voters values(4,'Krish',25,'India');
insert into voters values(5,'sai',24,'America');
insert into voters ( voter_id,name,age)values(6,'Bhanu',25);

select * from voters;


-- Auto Increment

create table orders(
order_id integer primary key auto_increment,
itemcount integer,
orderedby varchar(20)
);

insert into orders(itemcount,orderedby) values(2,'chandu');
insert into orders(itemcount,orderedby) values(5,'Raju');
insert into orders(itemcount,orderedby) values(10,'Sita');

delete from orders where order_id =4;
delete from orders where order_id =5;

insert into orders(itemcount,orderedby) values(6,'Lakshmi');
insert into orders(itemcount,orderedby) values(12,'Sree');

insert into orders values(8,3,'surya');
insert into orders(itemcount,orderedby) values(22,'chandini');

select * from orders;


-- Foreign Key

create table departments(
dept_id integer primary key auto_increment,
dept_name varchar(20)
);

create table emp(
emp_id integer primary key auto_increment,
emp_name varchar(25),
salary integer,
dept_id integer,
foreign key(dept_id) 
references departments(dept_id)
);

insert into departments (dept_name)values('Python');
insert into departments (dept_name)values('Java');
insert into departments (dept_name)values('AIML');
insert into departments (dept_name)values('AIDS');
insert into departments (dept_name)values('CSE');

select * from departments;

insert into emp values(1,'Bhavya',10000,1);
insert into emp values(2,'Nandu',15000,2);
insert into emp values(3,'Bindu',20000,2);
insert into emp values(4,'Varun',30000,3);
insert into emp values(5,'Chandu',40000,4);
insert into emp(emp_name,salary,dept_id) values('Ramya',35000,4);

select * from emp where dept_id = 1;
select * from emp where dept_id = 2;
select * from emp where dept_id = 4;

select * from emp;

Create table students(
stu_id integer primary key,
stu_name varchar(20),
marks integer,
dept_id integer,
foreign key(dept_id)
references departments(dept_id)
);

insert into students values(1,'Ram',80,1),(2,'Sri',90,2),(3,'Chandini',98,2);
insert into students values(4,'Ramya',85,3),(5,'chandana',91,4);
insert into students values(6,'Chandrika',92,5);

select * from students where dept_id = 4;
select * from students where dept_id = 2;
select stu_name as student_name,marks as student_marks from students where dept_id = 4;

select * from departments;
select * from emp;
select * from students;
