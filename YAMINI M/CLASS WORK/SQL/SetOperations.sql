create table hire_dates
(id number(8),
Hire_date Date default sysdate);


insert into hire_dates values(1,'01-07-2043');
select * from hire_dates;

insert into hire_dates values(1,'01-07-2043');
insert into hire_dates (id) values(2);
select * from hire_dates;

insert into hire_dates values(1,'01-07-2043');
insert into hire_dates (id) values(1234);
select * from hire_dates;

insert into hire_dates values(1,'01-07-2043');
insert into hire_dates (id) values(3);
insert into hire_dates (Hire_date) values('23-06-2004');
select * from hire_dates;

insert into hire_dates values(1,'01-07-2043');
insert into hire_dates (id,Hire_date) values(12,'08-12-2008');
select * from hire_dates;

select * from employees;
delete from employees where salary=9000;


Alter Table employees READ ONLY;
Alter Table employees READ WRITE;

update employees 
set Salary=24000
where employee_id=100;
SELECT * FROM employees;


CREATE VIEW empview80   ------View is faster than table
AS Select employee_id,last_name,salary
From employees
where department_id=80;

DESCRIBE empview80;
SELECT * from empview80;

create or replace view empv
(name,minsal,maxsal,avgsal)  -----------Alias name
as select d.department_name,Min(e.salary),Max(e.salary),Avg(e.salary)
from employees e
join departments d
on(e.department_id=d.department_id)
group by department_name;
select * from empv;

Drop table job_grades;
describe job_grades;

flashback table hr.job_grades to before drop;  
describe job_grades;

Select * from job_grades;

create sequence department_seq
increment by 10
start with 120
maxvalue 9999
nocache
nocycle;

drop sequence department_seq;

create sequence dep_seq
increment by 10
start with 300
Nocycle
Nocache;

select dep_seq.nextval,dep_seq.currval
from dual;

create synonym emp
for employees;

select * from emp;

drop synonym emp;

create user yamini identified by Yami23; --- To create user

---grant privileges----
grant create user,create session to hr;

grant create session to hr;

revoke create user from hr;

select * from user_tab_privs_made;

Select * from user_sys_privs;





