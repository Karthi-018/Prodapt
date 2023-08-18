-- employees who promoted as diff department
select employee_id , job_id
from employees
union
select employee_id,job_id
from job_history;

select employee_id , employees.department_id
from employees
intersect
select employee_id, job_history.department_id
from job_history;

-- to check prev and current employee id are not same
select employee_id, job_id
from employees
minus
select employee_id,job_id
from job_history;

select employee_id , job_id,salary,last_name
from employees
union  
select employee_id, job_id,0,to_char(null)
from job_history;
