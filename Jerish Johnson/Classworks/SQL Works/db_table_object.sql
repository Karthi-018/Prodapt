--------------------------------------------------------------------------------
----------------------database objects------------------------------------------
------------------------------TABLE OBJECTS-------------------------------------
create table hire_dates
(id Number(8),                  --if we give id number (8,2) we can give upto 2 decimal places
hire_date Date default sysdate);

insert into hire_dates(id) values(2);
select * from hire_dates;

create table hire_dates1
(id number(8),
hire_date date);
insert into hire_dates1(id) values(1);--only specified vakue of 8 digits can be given
select * from hire_dates1;

delete from  employees where department_id=80;
desc employees;
--------------------------------------------------------------------------------
create table Dept80 as select employee_id,last_name,salary*12 annsal,hire_date
from employees
where department_id=80;

select * from dept80;
----------------------------ALTER-----------------------------------------------

alter table hire_dates read write;
insert into hire_dates(id) values(7);
select * from hire_dates;

-------------------------------------------------------------------------------
