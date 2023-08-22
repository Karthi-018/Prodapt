----1----

select * from employees where hire_date > '01-01-1997' order by hire_date;

----2----

select last_name,job_id,salary,commission_pct 
from employees
where commission_pct is not null
order by salary desc;

----3----

select 'the salary with '||last_name||' after a 10% raise is '||salary
from employees
where commission_pct is null;

----5----

select last_name
from employees
where last_name like 'J%' or last_name like 'K%' or last_name like 'L%' or last_name like 'M%';

----8----

select last_name as "last name count with letter n" from employees
where last_name like '%n';

----6----

select last_name,salary,
decode(commission_pct,null,'No'
            ,'yes') as commission from employees;
            
----4----

SELECT LAST_NAME,TRUNC(months_between(sysdate,hire_date)/12) as year,
TRUNC(((months_between(sysdate,hire_date)/12)-TRUNC(months_between(sysdate,hire_date)/12))*10) as months 
FROM employees order by year desc;
            
----7----


select department_name,location_id,last_name,job_id,salary
from employees e
join departments d
on(e.department_id=d.department_id)
where location_id=&location;


----10----

select job_id
from employees
where department_id=10 or department_id=20;

----9----

select de.department_id,de.department_name,de.location_id,count(e.employee_id) as "No of Emp"
from departments de
join employees e
on(e.department_id=de.department_id)
group by de.department_id,de.department_name,de.location_id;

-----13----

select last_name,salary,trunc(salary/1000) as Thousands
from employees;

-----15-----


select d.department_id,d.department_name,count(e.employee_id)as count,avg(salary),e.last_name
from employees e
join departments d
on(e.department_id=d.department_id)
group by d.department_id,d.department_name,e.last_name
order by d.department_id;

-----12---


select last_name,hire_date 
from employees 
where to_number(to_char(hire_date,'DD'))<16;


----11----

select job_id,count(e.employee_id) as Frequency
from employees e
where job_id like 'AD%'
group by job_id
order by frequency;

----14----



