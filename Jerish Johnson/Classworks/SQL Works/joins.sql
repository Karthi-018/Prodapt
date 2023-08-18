--natural join
--taking out the common values of the same common columns in both of the tables-
select employee_id,last_name,department_id,department_name
from employees
natural join departments;

--ON clause

select employee_id,last_name,employees.department_id,department_name
from employees
join departments
on (employees.department_id=departments.department_id and employees.manager_id=departments.manager_id);

--Using clause
select employee_id,last_name,manager_id,department_name,e.department_id
from employees e
join departments d
using(manager_id);
--------------------------------------------------------------------------------
select department_id from employees;
select department_id from departments;
select count(manager_id) from departments;
select count(department_id )from departments;

select departments.department_id, departments.manager_id ,employees.department_id,employees.manager_id 
from employees  join departments
on (employees.department_id=departments.department_id and employees.manager_id=departments.manager_id);

select employees.department_id,manager_id,last_name from employees join departments using(manager_id);

--------------------------------------------------------------------------------
select * from employees where department_id is null;

-----------------left outer join----------------as also same as right outee join
select employee_id,last_name,department_name,e.department_id
from employees e
left outer join departments d
on(e.department_id=d.department_id);

-------------------------full outer join----------------------------------------
select employee_id,last_name,department_name,e.department_id
from employees e
full outer join departments d
on(e.department_id=d.department_id);

-----------------------cross join departments-----------------------------------
select employee_id,last_name,e.department_id,department_name
from employees e
cross join departments d;

--------------------------------------------------------------------------------
--same manager id matches with same employee id it is done by separting the same table as two tables
select manager_id,employee_id from employees;

select e.employee_id,e.last_name,e.manager_id,m.employee_id,m.last_name
from employees e
join employees m
on(e.manager_id=m.employee_id);

----------------------------3 way joins-----------------------------------------
select e.employee_id,e.last_name,e.job_id,e.salary,d.department_name,l.city
from employees e
join departments d
using (department_id)
join locations l
using (location_id);

------------------------------using on------------------------------------------

select e.employee_id,e.last_name,e.job_id,e.salary,d.department_name,l.city
from employees e
join departments d
on(e.department_id =d.department_id)
join locations l
on(d.location_id =l.location_id);

--------------------------------------------------------------------------------
--job grades based on the salary
select employee_id,last_name,job_id,salary,grade
from employees e
join job_grades j
on(e.salary between j.lowest_sal and j.highest_sal);

select * from job_grades;
