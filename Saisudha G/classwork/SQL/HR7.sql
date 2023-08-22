select employee_id,job_id
from employees
intersect
select employee_id,job_id
from job_history order by employee_id;

select employee_id,job_id,salary
from employees
union
select employee_id,job_id,0
from job_history order by employee_id;


select employee_id,job_id,last_name
from employees
union
select employee_id,job_id,to_char('null')
from job_history order by employee_id;

select employee_id,job_id,salary
from employees
union
select employee_id,job_id,0
from job_history order by salary;

select job_id,salary
from employees
minus
select job_id,0
from job_history order by salary;

select job_id
from employees
minus
select job_id
from job_history;





