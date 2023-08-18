update employees
set salary = (select salary from employees where last_name = 'Abel')
where last_name = 'Taylor';

select * from employees;
rollback;

-----------------------------------------------------------------------------
create table copyemp(employee_id NUMBER, fisrt_name VARCHAR(50), last_name VARCHAR(50));

desc copyemp;

insert into copyemp(select employee_id, first_name, last_name from employees);
select * from copyemp;

-----------------------------------------------------------------------------
create table copyemp1(employee_id NUMBER, employee_name VARCHAR(50));
desc copyemp1;

insert into copyemp(select employee_id, first_name from employees);
select * from copyemp;

------------------------------------------------------------------------------
create table hire_dates
(id number(8),
hire_date date default sysdate);

insert into hire_dates values(1, '01-08-23');
insert into hire_dates (id) values(2);

select * from hire_dates;

------------------------------------------------------------------------------

create table hire_dates1
(id number(8));

insert into hire_dates1 values(1, '01-08-23');
insert into hire_dates (id) values(2);

select * from hire_dates;
drop table hire_dates1;

create table hire_dates1(id number(8),hire_date1 date);
insert into hire_dates1 values(1, '02-08-23');
insert into hire_dates1 (id) values(2);

select * from hire_dates1;

----------------------------------------------------------------------------

delete from employees where employee_id = 100;
rollback;
select employee_id from employees where employee_id = 107;
select manager_id from employees where employee_id = 107;

delete from employees where employee_id = 107;

---------------------------------------------------------------------------

create table dep80
as
select employee_id, last_name,
salary*12 annualsalary, 
hire_date
from employees
where department_id = 80;

select * from dep80;

---------------------------------------------------------------------------

alter table employees read only;

update employees set salary = 20000 where last_name = 'Abel';

alter table employees read write;

rollback;

---------------------------------------------------------------------------

create view empv80
as select employee_id, last_name, salary
from employees
where department_id = 80;

select * from empv80;

---------------------------------------------------------------------------

create or replace view dept_sum_vu
(name, minsal, maxsal, avdsal)
as select d.department_name. min(e.salary),
          max(e.salary), avg(e.salary)
from employees e join departments d
on (e.department_id = d.department_id)
group by d.department_name;

----------------------------------------------------------------------------

drop table job_grades;
select * from job_grades;
flashback table hr.job_grades to before drop;

---------------------------------------------------------------------------

create sequence dept_deptid_seq
increment by 10
start with 120
maxvalue 9999
nocache
nocycle;

---------------------------------------------------------------------------
select * from departments;

insert into departments values(dept_deptid_seq.nextval, 'Training', null, null);

----------------------------------------------------------------------------







