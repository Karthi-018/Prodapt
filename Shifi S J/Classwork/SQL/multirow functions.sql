select sum(salary)as sum_salary from employees;

select count(*)as total_count from employees;

select avg(salary) as average_salary from employees;

select min(salary) as minimum_salary from employees;

select min(hire_date) as first_hiring from employees;

select max(hire_date) as latest_hiring from employees;

select (sum(salary)/round(count(nvl(manager_id,0)),2)) from employees;

select count(department_id),sum(salary),round(avg(salary),0),max(salary),min(salary) 
from employees
group by department_id
order by department_id;

select department_id,job_id, sum(salary),round(avg(salary),0),max(salary),min(salary)
from employees
group by department_id,job_id
order by department_id;

select salary, count(department_id),department_id,job_id, sum(salary),round(avg(salary),0),max(salary),min(salary)
from employees
group by department_id,job_id,salary
order by department_id;

select salary from employees;

select department_id,job_id,salary, sum(salary),count(job_id)
from employees
group by department_id,job_id,salary
order by department_id;

select salary,sum(salary)
from employees
group by salary
order by salary;


select department_id, count(department_id),sum(salary)
from employees
where department_id<>110
group by department_id
having avg(salary)<10090;

