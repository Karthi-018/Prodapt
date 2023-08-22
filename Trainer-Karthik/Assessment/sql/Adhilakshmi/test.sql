
1.select*from employees where job_id in('SA_CLERK',  'SH_CLERK')and (hire_date>to_date('1997-01-01','YYYY-MM-DD')) ;
------------------------------------------------------------------------------------------------------------
2.select last_name,job_id,salary,commission_pct from employees where commission_pct is not null order by salary;
----------------------------------------------------------------------------------------------------------------
3.select salary*0.10+salary "New Salary" from employees where commission_pct is null ;
-------------------------------------------------------------------------------------------------------
5.select last_name
from employees
where last_name like 'J%'or last_name like 'K%'or last_name like'L%'or last_name like 'M%';
------------------------------------------------------------------------------------
6.select last_name,salary,
   DECODE(commission_pct,Null,'  No','  Yes')As Commission
   from employees;
---------------------------------------------------------------------------------------
7.select * from departments;
select department_name,location_id,last_name,job_id,salary from employees
join departments using(department_id)
where location_id=&location;
-------------------------------------------------------------------

8.select count(*) as "Last Name Count with letter n"
from employees
where substr(last_name,-1)='n';

select count(*)as "Last Name Count with letter n"
from employees
where last_name Like '%n';
-------------------------------------------------
9.select department_id,department_name,location_id,count(employee_id)from departments
   join employees using(department_id)
   group by(department_name,location_id,department_id);
-----------------------------------------------------------------
10.select job_id
from employees
where department_id in(10,20);
------------------------------------------------
11.select j.job_id,count(*)as Frequency
from employees e
select jobs j on e.job_id=j.job_id
join departments d on e.department_id=d.department_id
where d.department_name in ('Administration','Executive')
group by j.job_id;
order by Frequency desc;
-------------------------------
12.select last_name,hire_date
from employees
where extract(DAY FROM hire_date)<16;
----------------------------------------------
13.select last_name,salary,Round(salary/1000)as "Thousands"
from employees;
------------------------------------------
14.
select e.last_name as "Last Name",
m.last_name as "Manager",
m.salary as "Manager Salary"
from employees e
join employees m on e.manager_id=m.employee_id
where m.salary>15000;

------------------------------------------------
15.select d.department_id as "Dept",
d.department_name as "Dept Name",
count (e.employee_id)as "Employees",
avg(e.salary)as "AVG Salary",
e.last_name as "Last_name"
from departments d
join employees e on d.department_id=e.department_id
group by d.department_id,d.department_name,e.last_name;
----------------------------------------------------------
