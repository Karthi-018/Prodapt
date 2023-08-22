--1.
select * from employees where job_id like '%K' and hire_date> to_date('31-12-97');

--2.
select last_name,job_id,salary,commission_pct from employees where commission_pct is not null order by salary desc;

--3.
select q'[The salary if ]'||first_name||q'[ after 10% raise raise is ]'||round(salary*.10,0) "New salary" from employees where commission_pct is null;

--4.
select last_name,trunc(months_between(sysdate,hire_date)/12) year,
trunc(((months_between(sysdate,hire_date)/12)-trunc(months_between(sysdate,hire_date)/12))*10) months from employees order by year desc;

--5.
select last_name from employees where last_name like 'K%'or last_name like'J%' or last_name like 'L%' or last_name like'M%';

--6.
select last_name,salary, decode(commission_pct, null, 'Yes' ,'No') commission from employees;

--7.
select d.department_name,l.location_id,e.last_name,e.job_id,e.salary from employees e
join departments d 
on(e.department_id=d.department_id)
join locations l
on(d.location_id=l.location_id)
where l.location_id=&Loc_Id;

--8.
select count(last_name) "Last Name count with letter n" from employees where last_name like '%n';

--9.
select e.department_id,d.department_name,d.location_id,count(e.employee_id) 
from employees e
join departments d
on(e.department_id=d.department_id)
group by e.department_id,d.location_id,d.department_name;

--10.
select job_id from employees where department_id between 10 and 20;

--11.
select job_id ,count(employee_id) frequency from employees where job_id like 'AD%'or job_id like 'EX%' group by job_id order by frequency desc; 

--12.
select last_name,hire_date from  employees  where  to_number(to_char(hire_date, 'DD')) <= 15;

--13.
select last_name,salary, trunc(salary/1000) Thousands from employees;
