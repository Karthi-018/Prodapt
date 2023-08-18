desc job_history;

--union   display emplooye's current and previous jobrole without duplicate
select employee_id, job_id 
from employees
union
select employee_id, job_id
from job_history;

----------------------------------------------------------
--unionall  display emplooye's current and previous jobrole with duplicate
select employee_id, job_id 
from employees
union all
select employee_id, job_id
from job_history order by employee_id;

-----------------------------------------------------------
--intersect previous and current job is same
select employee_id, job_id 
from employees
intersect
select employee_id, job_id
from job_history 
order by employee_id;

-----------------------------------------------------------
--minus previous and current job is same
select employee_id, job_id 
from employees
minus
select employee_id, job_id
from job_history 
order by employee_id;

------------------------------------------------------------
--display previous and current jobid with salary

select employee_id, job_id, salary
from employees
union
select employee_id, job_id, 0
from job_history
order by employee_id;

------------------------------------------------------------
--display previous and current jobid with name

select employee_id, job_id, first_name
from employees
union
select employee_id, job_id, to_char(null)
from job_history
order by employee_id;

------------------------------------------------------------



