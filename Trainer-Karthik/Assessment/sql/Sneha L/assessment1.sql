---1)
select * from employees 
where hire_date >'31-12-1997' and job_id like '%CLERK';

---2)
select last_name,job_id,salary,commission_pct
from employees
where commission_pct is not null
order by salary desc;

---3)
select q'{ The salary if }'||first_name||''||last_name||q'{ after a 10% raise is  }'||round((salary+(salary*0.10)),0) as newsalary from employees
where commission_pct is null;
---4)
select last_name,round(months_between(sysdate,hire_date)/12) as year,round(mod(months_between(sysdate,hire_date),12)) as months from employees
order by year desc,months desc;

---5)
select last_name from employees
where last_name like 'J%' or last_name like 'K%' or last_name like 'L%' or last_name like 'M%';

--6)
select last_name,salary,decode(commission_pct,NULL,'NO','YES') as commission from employees;

--7)
select  department_name as "Department Name",location_id as "Location ID", last_name as "LastName", job_id as"Job Id", salary as "Salary" from employees
join departments
using(department_id)
join locations
using(location_id)
where location_id=&num;

--8)
select count(Last_name) as "Last Name count with letter n" from employees
where last_name like '%n';
-----------or-----------

select count(*) as "Last Name count with letter n" from employees where substr(last_name,'-1')='n';

--9)
select d.department_id as "Department id", d.department_name as "Department Name",d.location_id as "Location ID",count(e.employee_id) as "No of Emp" from departments d
join employees e
on(e.department_id=d.department_id)
group by d.department_id,d.department_name,d.location_id;


--10)
select job_id from employees
where department_id between 10 and 20;

--11)
select e.job_id ,count(e.employee_id)as frequency from employees e
join departments d
on e.department_id=d.department_id
where d.department_name in ('Administration','Executive')
group by e.job_id
order by frequency desc;

--12)
select last_name,hire_date from employees
where TO_NUMBER(TO_CHAR(hire_date,'DD'))<=15;

--13)
select last_name as "LastName",salary,salary/1000 as "Thousands" from employees;
--14)
select e.last_name as "Last Name",e.manager_id as "Manager ID",e.salary ,j.grade as "Grade Level" from employees e
join job_grades j
on(e.salary>j.lowest_sal and e.salary<j.highest_sal)
where salary>15000;
--15)
select  d.department_id as"Dept",d.department_name as "Dept Name",count(e.Employee_id) as "Employees",round(avg(e.salary)) as "Avg Salary",e.Last_name from departments d
left join employees e
on d.department_id=e.department_id
group by d.department_name,d.department_id,e.last_name
order by d.department_id,e.last_name;



