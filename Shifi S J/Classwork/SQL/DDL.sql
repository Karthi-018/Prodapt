create table hire_dates (id number(8),hiredate Date default sysdate);
insert into hire_dates values(1,'02-05-2022');
insert into hire_dates(id) values(2);
select * from hire_dates;



create table hire_dates1 (id number(8),hiredate Date)
insert into hire_dates1 values(2,'03-06-2023');
insert into hire_dates1(id) values(123456789);//error- because max 8 characters only mentioned
insert into hire_dates1(id,hiredate) values(4,sysdate);
select * from hire_dates1;
