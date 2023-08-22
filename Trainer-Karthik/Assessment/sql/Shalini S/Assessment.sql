--1
select * from employees 
where (job_id='SA_CLERK' or job_id='AT_CLERK')and hire_date >'31-12-1997';


2--
select last_name,job_id,salary,commission_pct
from employees
where commission_pct is not null
order by salary;

3--
select 'The salary of '||first_name||' '||last_name||'after 10% raise is '||round(salary*0.10,0)
from employees
where commission_pct is null;
4--
select last_name,round(months_between(sysdate,hire_date)/12) as year ,round(mod(months_between(sysdate,hire_date),12)) as months
from employees 
order by year desc,months desc;
5--
select last_name from employees
where last_name like'J%' or
last_name like'K%' or
last_name like 'L%' or
last_name like 'M%';

6--
select last_name,salary,
decode (commission_pct,null ,'No'
        ,'Yes'
)as "Commission"
from employees;

7--
select job_id,location_id,last_name,job_id,salary
from employees
join location
using
where location_id=&location;

8--
select count(last_name) from employees
where last_name like '%n';

9------
select employees.department_id,department_name,location_id,count(department_name)
from departments
join employees
on(employees.department_id=departments.department_id)
group by employees.department_id,department_name,location_id;

10---
select job_id from employees
where department_id=10 or department_id=20;

11---
select job_id ,count(employee_id)
from employees
join departments
on(departments.department_id=employees.department_id)
where department_name in ('Administration','Executive')
group by job_id;

12---
select last_name,to_char(hire_date,'DD-MON-RR')
from employees
where to_char(hire_date,'MON') in('JAN','FEB','MAR','APR','MAY','JUN');

13--
select last_name,salary,round(salary/1000,0)
from employees;

14---
select employees.last_name,mp.last_name,mp.salary,job_grades.grade 
from employees join employees mp on(emp.manager_id=mp.employee_id)
join job_grades on(mp.salary>job_grades.lowest_sal and mp.salary<job_grades.highest_sal);
