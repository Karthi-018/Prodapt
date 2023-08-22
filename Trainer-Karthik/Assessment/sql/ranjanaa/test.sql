--1 
select * from employees where job_id='ST_CLERK' and hire_date > TO_DATE('2005', 'YYYY')  ;

select * from employees;
select * from departments;
--2
select last_name,job_id,salary,commission_pct from employees where commission_pct is not null
order by salary desc;

--3
Select 'The salary if '||last_name||' after a 10% raise is '||salary*0.10  "New Salary"
from employees where commission_pct is null;

--4

select last_name,round(months_between(sysdate,hire_date)/12)years , round(mod(months_between(sysdate,hire_date),12))months
from employees;


--5
select last_name from employees where last_name like 'J%' or last_name like 'K%'or last_name like 'L%'or last_name like 'M%';

--6
select last_name,salary, 
decode(commission_pct,null,'No','Yes') 
from employees;

--7
select d.department_name,d.location_id,e.last_name,e.job_id,e.salary
from employees e
join departments d
on(e.department_id=d.department_id)
and location_id = &val; -- on val give 1800

--8
select count(last_name)
from employees 
where last_name like '%n';


--9
select d.department_id, d.department_name,d.location_id,count(e.employee_id) No_Of_Employees
from employees e
join departments d
on(e.department_id = d.department_id)
group by(d.department_id, d.department_name,location_id);

--10
select job_id from employees where department_id in (10,20) ; 

--11
select e.job_id, count(employee_id)  "frequency"
from employees e
join departments d 
on e.department_id = d.department_id
where d.department_name in ('Administration', 'Executive')
group by e.job_id
order by "frequency" desc;

--12 
select last_name ,hire_date from employees
where month(hire_date) < 7 and day(hire_date)<16;

--13 
select last_name,salary,floor(salary/1000) Thousands
from employees;

--14


--15
select d.DEPARTMENT_ID,d.DEPARTMENT_NAME,COUNT(e.EMPLOYEE_ID),AVG(e.SALARY),
e.LAST_NAME 
from departments d
join employees e 
on d.DEPARTMENT_ID =e.DEPARTMENT_ID 
group by d.DEPARTMENT_ID,d.DEPARTMENT_NAME,e.LAST_NAME ;
