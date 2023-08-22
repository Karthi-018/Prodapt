--1.SELECT * FROM employees WHERE hire_date>'31-12-1996';
--2.SELECT last_name,job_id,salary,commission_pct FROM employees WHERE commission_pct is not null order by salary desc;
--3.SELECT ('The salary if '||last_name||'after 10% raise is '||round(salary+(salary/10))) as newsalary from employees where commission_pct is not null;
--4.select last_name,round(months_between(sysdate,hire_date)/12) as year,round(mod(months_between(sysdate,hire_date),12)) as months from employees order by year desc,months desc;
--5.SELECT last_name from employees where last_name like 'J%' or last_name like 'K%' or last_name like 'L%' or last_name like 'M%';
--6.SELECT last_name,salary,DECODE(commission_pct ,null,'NO','YES') as Commission from employees;
--7.select department_name,location_id,last_name,job_id,salary  from employees join departments using(department_id) where location_id=&n;
--8.a)SELECT COUNT(*) as "Last name count with letter n" FROM employees where last_name like '%n';
--8.b)SELECT COUNT(*) as "Last name count with letter n" FROM employees where last_name like '%_n';
--9.SELECT employees.department_id,departments.department_name,departments.location_id,count(employees.department_id) from employees join departments on(employees.department_id = departments.department_id) group by employees.department_id,departments.department_name,departments.location_id;
--10.select job_id from employees where department_id=10 or department_id=20;
--11.SELECT job_id,count(job_id) from employees where job_id like 'AD_%' group by job_id order by count(job_id) desc;
--12.select last_name,hire_date from employees where extract(DAY FROM HIRE_DATE)<=15;
--13.SELECT last_name,salary,round(salary/1000) as Thousands from employees;
--14.select emp.last_name,mp.last_name,mp.salary,jp.grade from employees emp join employees mp on(emp.manager_id=mp.employee_id) join job_grades jp on(mp.salary>jp.lowest_sal and mp.salary<jp.highest_sal);

--15.select employees.department_id,departments.department_name from employees join departments on(employees.department_id = departments.department_id) order by department_id;

