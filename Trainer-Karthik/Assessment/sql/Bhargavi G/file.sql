1-------------
SELECT * FROM employees WHERE hire_date>'01-01-1997';

2----------
select last_name,job_id,salary,commission_pct from employees
where commission_pct is not null
order by salary desc;

3----------
select 'the salary if' || first_name||''||after a 10% raise is ||''|| round((salary/10)+salary) "new salary" 
from employees 
where commission_pct is null;


4-----------
select last_name,round(months_between(sysdate,hire_date)/12)
as year,round(mod(months_between(sysdate,hire_date),12))
as months from employees 
order by year desc;


5-------------
select last_name from employees
where last_name like 'J%' or last_name like 'K%' or last_name like'L%' or last_name like 'M%';

6--------------
select last_name,salary,commission_pct,
decode (commission_pct,null,'yes','no')
as "formatted"
from employees;

7-------------
desc employees;
desc departments;
select * from departments;
select department_name,location_id,last_name,job_id,salary from employees
join departments using(department_id)
where location_id=&location;


8-----------
select count(last_name) from employees
where last_name like '%n';



9---------------
select employees.department_id,



10-----------------
select job_id from employees
where department_id=10 or department_id=20;

11------------
select job_id,count(employee_id)"counted" from employees
join departments  d
on(d.department_id=employees.department_id)
group by job_id;

12--------------
select last_name,hire_date from employees 
where extract(Day From hire_date)<=15;


13----------
select last_name,salary,round(salary/1000) "thounsands" 
from employees;

14--------------
