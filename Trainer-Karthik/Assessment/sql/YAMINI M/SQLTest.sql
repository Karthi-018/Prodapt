
-----1-----
Select * from employees;

Select * from employees 
--where job_id='SA_CLERK' and hire_date > '1997';
where job_id='ST_CLERK' and hire_date > '31-DEC-1997';

-----2-----
select last_name,job_id,salary,commission_pct from employees
where commission_pct is NOT NULL
order by salary desc;

-----3-----
Select 'The Salary if ' || last_name || 'after a 10% raise is ' || ROUND(salary*1.10,0)as "NewSalary"
from employees
where commission_pct IS NULL;

-----4-----
SELECT last_name, Trunc(months_between(sysdate,hire_date)/12)Years,
Trunc(Mod(months_between(sysdate,hire_date),12))Months from employees
order by years desc;

-----5-----
select last_name from employees
--where last_name like 'J%' or last_name like 'K%' or last_name like 'L%' or last_name 'M%';
where SUBSTR(last_name,1,1) in ('J','K','L','M');

-----6-----
Select last_name,salary,decode(commission_pct,NULL,'NO','Yes')Commission from employees;
-----7-----
select * from departments;

select d.department_name,d.location_id,e.last_name,e.job_id,e.salary
from employees e,departments d
/*join departments d
using (d.department_id)*/
where e.department_id = d.department_id and d.location_id=&location;

-----8-----
select count (*)"Last name count with letter n" from employees
where last_name like '%n';

select count (*)"Last name count with letter n" from employees
where SUBSTR(last_name,-1)='n';

-----9-----
select e.last_name,d.location_id,count(e.employee_id)
from employees e
join departments d
on e.department_id = d.department_id
group by d.department_id,d.department_name,d.location_id;

-----10-----
select DISTINCT job_id 
from employees
where department_id between 10 and 20;

select DISTINCT job_id 
from employees
where department_id in (10,20);

-----11-----
select e.job_id,count(e.job_id)HighestEmployee
from employees e
join departments d
on d.department_name in ('Administration','Executive')
group by e.job_id
order by HighestEmployee desc;

-----12-----
select last_name,hire_date
from employees
where to_char(hire_date,'DD')<16;

-----13-----
select last_name,salary,Trunc(salary)/1000 INTHOUSANDS
from employees;

-----14------
