select * from employees;
select * from locations;
select * from departments;

--1
select * from (select * from employees where job_id in('ST_CLERK', 'SH_CLERK')) 
where hire_date > '31-12-97';

--2
select last_name, job_id, salary, commission_pct from employees where commission_pct > 0
order by salary desc;

--3
select 'The salary of ' || last_name || ' after a 10% raise is ' || round(salary * 0.10) as "New Salary" 
from employees
where commission_pct is null;

--4

--5
select last_name from employees 
where last_name like 'J%' 
or last_name like 'K%'
or last_name like 'L%' 
or last_name like 'M%';

--6
select last_name, salary,
decode( commission_pct , null, 'no', 'yes') 
as commission
from employees;

--7 
--desc locations;
select department_name, location_id, last_name, job_id, salary
from employees
join departments
on(employees.department_id = departments.department_id)
where location_id = &location;

--8
select count(last_name) as "Last name count with letter n" 
from employees 
where last_name like '%n';

--9
select department_id, department_name, location_id, count(employee_id) as "No of emp"
from departments
join employees
using(department_id)
group by department_id, department_name, location_id;

--10
select job_id from employees 
join departments 
on(departments.department_id = employees.department_id)
where departments.department_id in(10,20);

--11
select job_id, count(employee_id) as "Frequency"
from employees
where job_id in('AD_VP', 'AD_PRES', 'AD_ASST')
group by(job_id);

--12
select last_name, hire_date from employees where to_number(to_char(hire_date, 'DD')) < 16;

--13
select last_name, salary, round(salary/1000) as "Thousands" from employees;

--14


--15
