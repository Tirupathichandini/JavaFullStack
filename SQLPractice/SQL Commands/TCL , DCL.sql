use commands;

-- TCL

create table Junk_food(
id integer,
name varchar(20),
cost integer
);


insert into junk_food values(1,'Bingo', 10);
insert into junk_food values(2,'noodles', 60);
insert into junk_food values(3,'Boom Boom', 20);
insert into junk_food values(4,'Lays', 5);

set autocommit=0;
commit;

insert into junk_food values(5,'chips', 30);

select * from Junk_food;

commit;
rollback;

delete from junk_food;

insert into junk_food values(6,'panipuri', 50);

insert into Junk_food values(7, 'kurkure', 20);
commit;

insert into Junk_food values(8, 'cookies', 60);
savepoint insert1;

insert into Junk_food values(9, 'snacks', 20);
savepoint insert2;

rollback;
rollback to insert1;
rollback to insert2;
select * from Junk_food;


-- DCL

create user 'testuser'@'localhost' identified by 'test';

Grant select on Junk_food to 'testuser'@'localhost';

Grant insert,update on Junk_food to 'testuser'@'Localhost';

revoke select on Junk_food from 'testuser'@'localhost';








