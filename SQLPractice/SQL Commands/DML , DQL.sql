use commands;

set sql_safe_updates=0;

-- DML

insert into employees values (1, 'Ramya', 10000," hyderabad");
insert into employees values (2, 'chandini', 20000,'chennai');
insert into employees (id, name, salary, location) values (3, 'chandu',25000,'Mumbai');
insert into employees values (4, 'sree', 30000,'Delhi');
insert into employees values (5, 'Ram', 15000,'vijayawada');


update employees set location = 'bangalore' where id = 3;
update employees set name = 'krishna' where salary=15000;

delete from employees where name = 'krishna';
delete from employees where id = 4;

-- DQL

select * from employees;
select * from employees where id =3;
select name from employees;
select salary from employees;
select name from employees where id = 2;
select name,salary from employees where id=3;
