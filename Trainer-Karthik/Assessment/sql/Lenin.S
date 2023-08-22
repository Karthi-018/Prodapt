--1.

select * from employees where job_id = 'clerk' and hire_date > to_date('01-01-1997');

--2.

 
 select first_name ||' '||last_name as Name, salary from  employees where commission_pct is not null order by salary desc;
 
--3.

 --select first_name ||' '||last_name as Name, salary from  employees where commission_pct is  null  
 --and salary = salary + ROUND(salary * 0.1, 2);

     select q'[The salary if ]' ||first_name|| q'[ after 10% raise raise is ]'||round(salary* 0.1,0) updated_salary 
     from employees
     where commission_pct is null;


--4. 

select last_name,
trunc(months_between(sysdate,hire_date)/12) as year,
trunc(((months_between(sysdate,hire_date)/12)- trunc(months_between(sysdate,hire_date)/12))*10) months 
from employees order by year desc;


--5. 

select last_name from employees
where last_name like '%K' or 
last_name like '%J' or 
last_name like '%M' or 
last_name like '%L' ; 

--6.

select last_name, salary 
decode(commission_pct, null, 'yes' ,'no' ) commission 
from employees;

--7.



--8.

select count(last_name) "last name count with letter n" from employees 
where last_name like '%n'; 

--or

--select count(last_name) from employees
--where last_name like '%A' to '%M' and '%O' to 'Z'; 

--9.

select e.department_id,d.department_name,d.location_id,count(e.employee_id) 
from employees e
join departments d
on(e.department_id=d.department_id)
group by e.department_id,d.location_id,d.department_name;

--10.

select job_id from employees where department_id between 10 and 20;

--12.

select * from employees where to_char(employees.hire_date, 'dd') < = 15;


 --13.
 
 select last_name,salary,round(salary/1000)
 as Thousands from employees;

--14.

select last_name, manager_name, salary, gradelevel from employees joins job_grades;


--15.





 
