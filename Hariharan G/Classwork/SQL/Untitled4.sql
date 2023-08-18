create table hire_dates
(id number(8),hire_date date default sysdate);

insert into hire_dates values(100,'18-08-23');
select * from hire_dates;
insert into hire_dates (id)values(1);


create table hire_dates1
(id number(8,2),hire_date date); -- 8 digit values can be stored and upto 2 decimal points ...values with more than 2 decimal points ..ERROR varum!
insert into hire_dates1 values(101,'27-01-2002');
select * from hire_dates1;
insert into hire_dates1 (id)values(102); --hire_date value is null
insert into hire_date1(id) values(123456789);



delete from employees where employee_id=100;


alter table employees read only;
alter table employees read write;
alter table hire_dates1 read only;
--alter table hire_dates1 write;


create table dept80 
as
(select employee_id,last_name,salary*12 ANNSAL,hire_date
from employees
where department_id=80);

desc dept80;
commit;
drop table dept80;

--views!!!
--simple view
create view empvu80
as 
select employee_id,last_name,salary
from employees
where department_id=80;

select * from empvu80;
select sum(salary) from empvu80;
delete from empvu80 where salary=(select max(salary)from empvu80);

--
create or replace view dept_sum_vu
(name,minsal,maxsal,avgsal)
as(select d.department_name,min(e.salary),max(e.salary),avg(e.salary)
from employees e join departments d
on(e.department_id=d.department_id)
group by d.department_name);

drop table job_grades; --table in recycle bin
select * from job_grades;
flashback table hr.job_grades to before drop;


--sequence
create sequence dept_deptid_seq
increment by 10
start with 120
maxvalue 9999
nocache
nocycle;

select * from departments;
insert into departments values(dept_deptid_seq.nextval,'Hari',null,null);


