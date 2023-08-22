-----------------------------------ANS 1---------------------------------------
select * from employees
--where to_char(hire_date,'YYYY') not in (1997);
where hire_date> to_date('31-12-1996','dd-MM-yyyy') and job_id='SA_CLERK' and job_id='ST_CLERK';

--------------------------------ANS 2-----------------------------------------

select last_name, job_id,salary,commission_pct
from employees
where commission_pct is not null;

-------------------------------ANS 3------------------------------------------
select 'The salary of '||first_name||' after 10% raise is '||round(salary*1.10,2) "Raised Salary" 
from employees
where commission_pct is null;
--------------------------ANS 4----------------------------------------
select last_name; 


----------------------------ANS 5------------------------------------------
select last_name from employees
where last_name like 'J%' 
or last_name like 'K%' 
or last_name like 'L%' 
or last_name like 'M%'
order by last_name; 
------------------------------ANS 6-------------------------------------------
select *
DECODE(commission_pct,commission_pct, 'YES'
            ,commission_pct,'NO')
from employees;
----------------------------ANS 7----------------------------------------------
select department_name,location_id,last_name,job_id,salary from employees
join departments
on(location_id =&location);
using(department_id)
where location_id=&location;
-------------------------------ANS 8--------------------------------------------
select last_name
from employees
where last_name like '%n';


select last_name
from employees
where substr(last_name,-1)='n';
------------------------------ANS 9--------------------------------------------
select department_id,department_name,loaction_id, count(employee_id)
from departments
join employees
using(department_id)
group by department_id,department_name,location_id;
----------------------------------ANS 10----------------------------------------
select job_id from employees
where department_id = 10 and department_id = 20;
----------------------------------ANS 11----------------------------------------
select job_id, count(job_id) frequency
from employees e
join departments d
on(e.department_id=d.department_id)
where d.department_name = 'Administration' and d.department_name='Executive'
group by e.job_id
order by frequency;
------------------------ans 12---------------------------------------------------
select first_name, last_name, hire_date
from employees
where to_char(hire_date, 'YYYY') not in ('')
--------------------------ans 13-------------------------------------------
select last_name, manager,salary


