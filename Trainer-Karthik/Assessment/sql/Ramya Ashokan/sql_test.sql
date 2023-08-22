--1.
select employee_id,last_name,first_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id from employees
where job_id like '%CLERK'and to_char(hire_date,'YYYY')>'1997';

--2.
select last_name,job_id,salary,commission_pct 
from employees 
where employees.commission_pct IS NOT NULL order by  salary desc;

--3.
select 'The salary if '||last_name ||q'[ after a 10% raise is ]'|| round((salary * .1 )+salary) 
from employees  
join departments 
on employees.department_id=departments.department_id 
where employees.commission_pct IS  NULL;

--select * from employees;
--4.
select last_name,count(months_between(to_char(sys_date,hire_date))) from employees 
order by count(months_between(to_char(sys_date,hire_date)));
--5.
select last_name from employees  where  regexp_like(last_name,('^[JKLM]'));

--6.
select last_name,salary
decode(commission_pct when is null then 'NO')
else 'yes'
from employees;
--7.
select * from departments;
select d.depatment_name ,l.location_name,j.job_title,e.salary from locations l join departments d on d.location_id=l.location_id join employees;
--8.
select count(employee_id) as "last name count with letter n"  from employees where last_name like '%n';
select count(*) as "last name count with letter n"  from employees where last_name like '%n';

--9.
select  last
--10.
select job_id from employees where department_id=10 or department_id=20;
11.
--12.
select last_name , hire_date from employees where hire_date=to_date(round(hire_date,Month));
--13.


