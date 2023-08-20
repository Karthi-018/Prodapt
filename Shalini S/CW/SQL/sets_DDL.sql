-----------------------------------UNION----------------------------------------
select employee_id,job_id
from employees
union
select employee_id,job_id
from job_history;
-------------------------------UNION ALL----------------------------------------
select employee_id,job_id
from employees
union all
select employee_id,job_id
from job_history
order by employee_id;
-----------------------------INTERSECTION---------------------------------------
select employee_id,department_id
from employees
intersect
select employee_id,department_id
from job_history;
-----------------------------------MINUS----------------------------------------
select employee_id,job_id
from employees
minus
select employee_id,job_id
from job_history;
-----------------------------------------DDL----------------------------------------------------
select employee_id,job_id,salary
from employees
union
select employee_id,job_id,0
from job_history;

---------------------------DML CREATE,INSERT,DELETE-----------------------------
create table hire_dates(id number(8),
hire_date date default sysdate);

insert into hire_dates values(1,'18-07-2023');
