--------------------------------------------------------------------------------
-----------------set operators--------------------------------------------------
select employee_id,job_id
from employees 
union 
select employee_id,job_id 
from job_history order by employee_id;

-----employee working in the same department------------------------------------
select employee_id,department_id
from employees 
Intersect
select employee_id,department_id
from job_history;

--------employee id should not have same job_id---------------------------------
select employee_id,job_id
from employees
minus
select employee_id,job_id
from job_history;

--------------------------------------------------------------------------------

select employee_id,job_id,salary
from employees
union
select employee_id,job_id,0
from job_history;

--------------------------------------------------------------------------------
select employee_id,first_name
from employees
union 
select employee_id,to_char(null)
from job_history;
--------------------------------------------------------------------------------
select employee_id,to_date(null)
from employees
union 
select employee_id,start_date
from job_history;
--------------------------------------------------------------------------------
