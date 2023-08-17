-- Natural Join
desc employees;
desc departments;

select employee_id, first_name, manager_id, department_id, location_id
from employees
natural join departments;

--------------------------------------------------
--Using clause
desc employees;
desc departments;

select employee_id, first_name, manager_id, departments.department_id
from employees
join departments 
using(manager_id);

---------------------------------------------------
--ON clause
select employee_id, first_name, departments.department_id, departments.manager_id
from employees
join departments 
on(employees.department_id = departments.department_id);

----------------------------------------------------
--left outer join
select employee_id, first_name, employees.department_id
from employees
left outer join departments
on(employees.department_id = departments.department_id);

-----------------------------------------------------
--right outer join
select employee_id, first_name, employees.department_id
from employees
right outer join departments
on(employees.department_id = departments.department_id);

-----------------------------------------------------
--full outer join
select employee_id, first_name, employees.department_id
from employees
full join departments
on(employees.department_id = departments.department_id);

-----------------------------------------------------
--cross join 
select employee_id, first_name, employees.department_id
from employees
cross join departments;

------------------------------------------------------
--join three tables/ three-way joins

desc locations;
select employee_id, last_name, job_id, salary, department_name, city
from employees
join departments
using (department_id)
join locations
using (location_id);

------------------------------------------------------
desc job_grades;
select employee_id, last_name, job_id, salary, grade
from employees 
join job_grades
on(employees.salary between job_grades.lowest_sal and job_grades.highest_sal);

------------------------------------------------------
--multi row subquery
select *  from employees where department_id IN 
(select department_id from employees where last_name ='King');

-------------------------------------------------------
--single row subquery
select * from employees;
select *  from employees where department_id = 
(select department_id from employees where employee_id =114);

--------------------------------------------------------

select * from employees where salary = 
(select salary from employees where last_name = 'Abel');

--------------------------------------------------------
select * from employees where salary >
(select salary from employees where employee_id = 100);

--------------------------------------------------------
select * from employees where department_id =
(select department_id from employees where last_name = 'Abel')
and salary > (select salary from employees where last_name = 'Abel');

--------------------------------------------------------

select * from employees where department_id in
(select department_id from employees where last_name = 'Taylor')
and salary > all(select salary from employees where last_name = 'Taylor');

--------------------------------------------------------
--multi row subquery
select * from employees where salary in 
(select min(salary) from employees 
group by department_id);

--------------------------------------------------------

