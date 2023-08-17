-------------------         NATURAL JOIN         -------------------------------
select employee_id,last_name,department_id,Department_name
from employees
Natural join departments;
----------------------------   ON CLAUSE ---------------------------------------
select employee_id,last_name,employees.department_id,Department_name
from employees
join departments
On(employees.department_id=departments.department_id and employees.manager_id=departments.manager_id);

select employee_id,last_name,departments.department_id,Department_name
from employees
join departments
on(employees.department_id=departments.department_id);
------------------------------ USING CLAUSE ------------------------------------
select employee_id,last_name,manager_id,Department_name,departments.department_id
from employees
join departments
using(department_id);
select employee_id, first_name, manager_id, employees.department_id
from employees
join departments 
using(manager_id);
---------------------------- USING WITH WHERE ----------------------------------
select employee_id,last_name,manager_id,Department_name
from employees
join departments
using(manager_id)
where employees.manager_id=124;-----error:column part of USING clause cannot have qualifier(WHERE)
---------------------- LEFT JOIN------------------------------------------------
select *from employees WHERE department_id IS NULL;
SELECT employee_id, last_name, department_name, e.department_id
FROM employees e
left outer join departments d
on(e.department_id=d.department_id);
---------------------- RIGHT JOIN-----------------------------------------------
select *from employees WHERE department_id IS NULL;
SELECT employee_id, last_name, department_name, e.department_id
FROM employees e
right outer join departments d
on(e.department_id=d.department_id);
---------------------- FULL JOIN------------------------------------------------
select *from employees WHERE department_id IS NULL;
SELECT employee_id, last_name, department_name, e.department_id
FROM employees e
full outer join departments d
on(e.department_id=d.department_id);
select *from employees WHERE department_id IS NULL;
---------------------- CROSS JOIN-----------------------------------------------
SELECT employee_id, last_name, department_name, e.department_id
FROM employees e
cross join departments d;
---------------------- SELF JOIN------------------------------------------------
SELECT e.employee_id, e.last_name, e.manager_id,m.employee_id,m.last_name
FROM employees e
join employees m
on(e.manager_id=m.employee_id);
---------------------------THREE WAY JOIN---------------------------------------
select* from departments;
select employee_id,last_name,job_id,salary,department_name,city
from employees 
join departments 
using(department_id) 
join locations 
using(location_id);
