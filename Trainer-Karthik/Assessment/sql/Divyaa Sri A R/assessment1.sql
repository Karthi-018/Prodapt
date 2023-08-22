select * from employees;
--question 1
select * from employees where job_id in ('SH_CLERK','ST_CLERK')and hire_date>to_date('1997-01-01','YYYY-MM-DD');

-------------2222222222222222222---------------------------------------------------------------------------------------

select last_name,job_id,salary,commission_pct from employees where commission_pct is not null order by salary desc;

---------------3333333333333333333333333-------------------------------------------------------------------------

select salary*0.10+salary "New Salary" from employees where commission_pct is null ;
---------------444444444444444444444444--------------------------------------------------------------------------------

select last_name,floor(MONTHS_BETWEEN(SYSDATE, hire_date) / 12) years,
floor(mod(MONTHS_BETWEEN(SYSDATE, hire_date), 12)) months
from employees order by hire_date;
------------555555555555555555-------------------------------------------
select last_name from employees where last_name like 'J%'or last_name like 'K%' or last_name like 'L%' or last_name like 'M%';
----------------6666666666666666666666-----------------------------------------------------------------------------------------------
select last_name,salary,  
decode (commission_pct , null ,  'Yes'
            , 'No'
)as "Commission"
from employees;
-------------7777777777777777777777777------------------------------------------

desc employees;
desc departments;
select * from departments;
select department_name,location_id,last_name,job_id,salary from employees
join departments using(department_id)
where location_id=&location;
-----------888888888888--------------------------------------------------
select count(employee_id) from employees where last_name like '%n';
select * from employees where last_name like '%n';
-------------999999999999999--------------------------------
select department_id,department_name,location_id,count(employee_id)from departments
join employees using(department_id)
group by(department_id,department_name,location_id);
---------------10101010-------------------------
select job_id from employees where department_id between 10 and 20;
-------------------1111111-------------------
select e.job_id, count(*) frequency
from employees e
join departments d on (e.department_id = d.department_id)
where d.department_name in ('Administration', 'Executive')
group by e.job_id order by frequency DESC;
------------------121212--------------
select last_name,hire_date from employees where hire_date<to_date('2023-08-16','YYYY-MM-DD');
------------------1313131313-------------
select last_name,salary,floor(salary/1000) "Thousands" from employees;
-------------------1414141414-------------
select e.last_name,e.lastname manager,salary where manager

------------------151515----------------
select department_id,department_name,count(employee_id) "Employees",avg(salary),last_name
from departments
join employees using(department_id)
group by(department_id,department_name,last_name);
-------------------------------
