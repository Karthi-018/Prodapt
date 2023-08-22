select employee_id,job_id
from employees
union all
select employee_id,job_id
from job_history order by employee_id;

select employee_id,department_id
from employees
intersect
select employee_id,department_id
from job_history order by department_id;

select employee_id,job_id
from employees
minus
select employee_id,job_id

from job_history order by employee_id;

------------------UPDATE----------------------------
update employees 
set salary=(select salary from employees where last_name='Abel')
where last_name='Taylor';

select salary,last_name from employees;

select*from employees;
ROLLBACK;
delete from employees where employee_id=100;
create table copyemp(employee_id NUMBER,first_name VARCHAR(25),last_name NUMBER(25));
insert into copyemp values(101,'legend',123);
drop table copyemp;
rollback;
create table copyemp(employee_id NUMBER,first_name VARCHAR(25),ph NUMBER(25));

select manager_id from employees where employee_id=100;
select*from departments;

create TABLE dept80
as
select employee_id,last_name,salary*12 annsal,hire_date
from employees
where department_id=80;
select*from dept80;

alter table employees read only;--read only

update employees 
set salary=(select salary from employees where last_name='Abel')
where last_name='Taylor';

alter table employees read write;--read write

update employees
set salary=10000 where last_name='Abel';
select*from employees;

rollback;



------------------------simple view------------------------

create view emp80
as select employee_id ,last_name ,salary 
from employees
where department_id=80;
describe emp80;
SELECT salary from emp80;


-----------------------------------------------------------

create or replace view emp80
(last_name,minsalary,maxsalary,avgsalary)
as select departments.departments_name,min(departments.salary),max(departments.salary),avg(departments.salary)
from employees 
join departments
on(employees.department_id=departments.department_id)
group by departments.departments_name;

---------------------------------------------

drop table job_grades;
select*from job_grades;
flashback table hr.job_grades to before drop;
-------------------------SEQUENCE-----------------------
create sequence dept_deptid_seq
increment by 10
start with 120
maxvalue 9999
nocache
nocycle;
select*from departments;

insert into departments values(dept_deptid_seq,'Training',null,null);
values
