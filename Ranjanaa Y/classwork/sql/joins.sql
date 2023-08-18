select employee_id,last_name,department_id,department_name
from employees
natural join departments;

select * from departments
order by manager_id;

select employee_id,last_name,employees.department_id,manager_id,department_name
from employees 
join departments
using(manager_id);

select employee_id, last_name,employees.department_id,department_name
from employees
join departments
on (employees.department_id=departments.department_id);

select employee_id,last_name,employees.manager_id,department_id,department_name
from employees 
join departments
using(department_id)
where employees.manager_id=100
order by employee_id;

select * from employees
where department_id IS NULL;

select employee_id, last_name,department_name,employees.department_id
from employees
right outer join departments
on(employees.department_id = departments.department_id);

select department_name,employee_id, last_name,employees.department_id
from employees
left outer join departments
on(employees.department_id = departments.department_id);

select employee_id, last_name,department_name,employees.department_id
from employees
full outer join departments
on(employees.department_id = departments.department_id);

select employee_id, last_name,department_name,employees.department_id
from employees
cross join departments;

select e.employee_id,e.last_name,e.manager_id,m.employee_id,m.last_name
from employees e
join employees m
on(e.manager_id = m.employee_id);


select employee_id,manager_id from employees; -- employee

select employee_id,manager_id from employees;  -- Manager

select employee_id,last_name,job_id,salary,department_name,city
from employees e
join departments d
on(e.department_id=d.department_id)
join locations l
on(d.location_id = l.location_id);

select employee_id,last_name,job_id,salary,department_name,city
from employees
join departments
using(department_id)
join locations
using(location_id);
