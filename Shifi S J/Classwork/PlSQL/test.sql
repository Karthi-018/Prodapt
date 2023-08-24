SELECT
    employee_id,
    last_name,
    first_name,
    email,
    phone_number,
    hire_date,
    job_id,
    salary,
    commission_pct,
    manager_id,
    department_id
FROM
    employees
WHERE
    hire_date >= to_date(
        1997, 'yyyy') and job_id like '%CLERK';
    

-------------------------------------------


SELECT
    last_name,
    job_id,
    salary,
    commission_pct
FROM
    employees
WHERE
    commission_pct IS NOT NULL
ORDER BY
    salary DESC
---------------------------------------------------------------

SELECT
    'The salary of '
    || last_name
    || ' after a 10% raise is '
    || ( salary + ( salary * 0.1 ) ) AS "New salary"
FROM
    employees
WHERE
    commission_pct IS NULL;
 ----------------------------------------------------   
 
 
SELECT last_name,trunc((months_between(SYSDATE,hire_date))/12) AS "YEARS",
trunc(months_between(SYSDATE,hire_date)- TRUNC(months_between(SYSDATE,hire_date)/12)*12) AS "MONTHS" 
from employees;

-----------------------------------------------------

select last_name from employees 
where last_name like 'J%' or last_name like 'K%' or last_name like 'L%' or last_name like 'M%';

----------------------------------------------------------------------------------------------------

select last_name,salary,
decode(commission_pct,to_number(null),'No','Yes')
As Commission from employees;

--------------------------------------------------------------------------------------

select department_name,location_id,last_name,job_id,salary
from employees e
join departments d
on(e.department_id=d.department_id)
where location_id=&location;


------------------------------------------------------------------------------------------------------------
select count(last_name)"Last Name count with letter n" from employees where last_name like'%n';
                         ----------------------------
select count(*) as "Last Name count with letter n"
from employees
where substr(last_name,length(last_name)) = 'n';

-----------------------------------------------------------------------------------------------

select d.department_id,d.department_name,d.location_id,count(e.employee_id) "No of Emp"
from departments d
left join employees e on d.department_id = e.department_id 
group by d.department_id,d.department_name,d.location_id;

----------------------------------------------------------------------------------------------------

select job_id 
from employees
where department_id between 10 and 20;

---------------------------------------------------------------

select job_id,count(employee_id) frequency
from employees
where job_id like 'AD%'
group by job_id
order by count(employee_id) desc;

--------------------------------------------------------------


select last_name,hire_date from employees where to_number(to_char(hire_date,'DD'))<16;

------------------------------------------------------

select last_name,salary,trunc(salary/1000) Thousands
from employees;

---------------------------------------------------

select a.last_name,b.last_name as manager,b.salary ,g.grade
from employees a,employees b,job_grades g
where b.salary > 15000 and b.salary between g.lowest_sal and g.highest_sal;

--------------------------------------------------------
select e.department_id,d.department_name,count(e.department_id) Employees,avg(e.salary) avg_sal,e.last_name
from employees e 
join departments d
on (e.department_id = d.department_id)
group by e.department_id,d.department_name,e.last_name,e.salary,e.job_id;

---------------------------------------------------------------------------------


