--1
select employee_id,last_name,first_name,email,hire_date,job_id,salary,commission_pct,manager_id,department_id
from employees where hire_date>to_date('1997','yyyy');

--2
select last_name,job_id,salary,commission_pct from employees where commission_pct is not null
order by salary desc;

--3
select 'The salary if '||first_name||' after a 10% raise is '||(salary+(salary*0.1)) "New Salary" from employees where commission_pct is null;
--4
select last_name,round((months_between(sysdate,hire_date))/12,0) Year,round(mod(months_between(sysdate,hire_date),12),0) months from employees
order by Year desc;
--5

select last_name from employees where last_name like  'J%' 
or last_name like 'K%' 
or last_name like 'L%'
or last_name like 'M%';
--6
select last_name,salary,
decode( commission_pct 
, to_number(null) , 'NO'
, 'YES'
) commission
from employees
;
--7
select d.department_name,d.location_id,e.last_name,e.job_id,e.salary
from departments d
join employees e
on (d.department_id = e.department_id)
where location_id = &loc;

--8
--8a
select count(last_name)"Last Name Count with letter n" from employees where last_name like '%n';
--8b
select count(last_name)"Last Name Count with letter n" from employees where last_name in 
(select last_name from employees where last_name like '%n') ;
--9
select d.department_id,d.department_name,d.location_id,count(e.employee_id)"No of Emp"
from departments d
join employees e
on(e.department_id = d.department_id)
group by d.department_id,d.department_name,d.location_id;

--10
select job_id from employees where department_id in (10,20);
--11
select job_id,count(employee_id) frequency from employees where department_id in
(select department_id from departments where department_name = 'Administration' or department_name ='Executive' )
group by job_id
order by frequency desc;
--12
select last_name,hire_date from employees where hire_date <to_date('16','dd');
--13
select last_name,salary,trunc(salary/1000) Thousands from employees;
--14
select e.last_name,e.salary from employees e
join employees m
on(e.employee_id = m.employee_id)
where e.employee_id = m.manager_id and e.salary>15000;
--15
select d.department_id,d.department_name,count(e.employee_id)Employees,avg(e.salary)"AVG Salary",e.last_name
from departments d
join employees e
on(e.department_id = d.department_id)
group by d.department_id,d.department_name,e.last_name;

