--qn1
select * from employees where hire_date>'31-12-1997' and job_id like'%CLERK';


--qn2
select last_name,job_id,salary,commission_pct from employees
where commission_pct is not null
order by commission_pct desc;

--qn3
select 'The salary if '||first_name||' after a 10% raise is '||round((salary+(0.10)*salary),0) as "New salary"
from employees where commission_pct is null;

--qn4
select last_name,round(MONTHS_BETWEEN(sysdate,hire_date)/12,0) as "YEAR",round(MONTHS_BETWEEN(sysdate,hire_date),0) as "MONTHS"
from employees
order by round(MONTHS_BETWEEN(sysdate,hire_date)/12,0) desc,round(MONTHS_BETWEEN(sysdate,hire_date),0) desc;

--qn5
select last_name from employees
where last_name like'J%' or last_name like'K%' or last_name like'L%' or last_name like'M%';

--qn6
select last_name,salary,nvl2(commission_pct,'NO','YES') as "Commission"
from employees;

--qn7
--select * from employees;
--select * from departments;
--select * from locations;
select d.department_name,e.last_name,e.job_id,e.salary,location_id
from employees e
join departments d
using(department_id)
join locations
using(location_id)
where location_id=&location;

--qn8
--query 1
select count(last_name) as "Last Name count with letter n"
from employees
where last_name like'%n';
--query2
select last_name as "Last Name count with letter n"
from employees where last_name not like'%[a..m]' and last_name not like'%[o..z]' ;
--where charat(length(last_name)-1)='n';
--where length()



--qn9
select department_id,department_name,location_id,count(employee_id)as "No of Emp"
from employees
join departments
using(department_id)
join locations
using(location_id)
group by department_id,department_name,location_id;

--qn10
select job_id from employees
where department_id in(10,20);

--qn11
select * from jobs;
select job_id,count(employee_id)as"Frequency" from employees where job_id in('AD_VP','AD_PRES','AD_ASST')
group by job_id
order by count(employee_id)desc;

--qn12

select last_name,hire_date from employees
where extract(DAY FROM HIRE_DATE)<=15;

--qn13
select last_name,salary,floor((salary/1000)) as"Thousands"
from employees;

--qn14
select* from job_grades;
select e.last_name,m.last_name,m.salary,j.grade
from employees e
join employees m
on(e.manager_id=m.employee_id)
join job_grades j
on(m.salary>j.lowest_sal and m.salary<j.highest_sal);

--qn15
select department_id,department_name,count(employee_id)as"Employees",round(avg(salary),0)as "AVG Salary",last_name
from employees
join departments
using(department_id)
group by department_id,department_name,last_name
order by department_id,last_name;
--select last_name from employees where last_name='Hartstein';