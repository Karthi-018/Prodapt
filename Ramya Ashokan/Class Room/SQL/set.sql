select table_name from user_tables;
select * from job_history order by start_date;
select * from employees order by job_id,employee_id;
select * from departments;
--to know the employees previuos and current role
select employee_id,job_id 
from employees
union
select employee_id,job_id 
from job_history order by employee_id ,job_id;


select employee_id,department_id
from employees
intersect
select employee_id,department_id 
from job_history order by employee_id ,department_id;

--prevoius jobid current jobid not same?
select employee_id,job_id 
from employees
minus
select employee_id,job_id 
from job_history order by employee_id ,job_id;

--current and previous job id,employee id along with salary /if column not available match  with data type give default values in to_char(null),to_date(null)
select employee_id,job_id,salary
from employees
union
select employee_id,job_id ,0
from job_history order by employee_id ,job_id;

select employee_id,job_id,department_id
from employees
union
select employee_id,job_id ,department_id
from job_history order by employee_id ,job_id;

--update the salary of taylor same as abel
update employees  set salary=(select salary from employees where last_name='Abel') where last_name='Taylor';
select salary ,last_name from employees where salary=11000;