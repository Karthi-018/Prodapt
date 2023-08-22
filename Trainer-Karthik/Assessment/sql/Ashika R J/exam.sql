SELECT *
FROM employees
WHERE job_id IN
 ('PU_CLERK','SH_CLERK','ST_CLERK') 
  AND hire_date > TO_DATE('01-01-1997', 'DD-MM-YYYY');

----2----
select last_name,job_id,salary,commission_pct 
from employees 
where commission_pct is not null
order by salary desc;

----3----
SELECT EMPLOYEE_ID,FIRST_NAME,LAST_NAME,ROUND(SALARY*0.1,0) AS SALARY_C 
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;

-------4----



------5------
 select last_name from employees where last_name LIKE 'J%'
 OR last_name like 'K%'
 OR last_name like 'L%'
 OR last_name like 'M%';
 
 ------6-----
 SELECT last_name, salary,
DECODE(commission_pct,
        NULL, 'no',
        'yes'
    ) AS "Commission"
FROM employees;
 -----7-------
select d.department_name,d.location_id,e.last_name,e.job_id,e.salary
from employees e
join departments d
on(e.department_id=d.department_id)
and location_id = &location;
 
 -----8------
 select last_name,count(last_name) as name_count
 from employees 
 where last_name like '%n';
 
 
 --------9-----
select d.department_id,d.department_name,d.location_id,count(e.employee_id) as no_of_employees 
from departments d
join employees e 
on d.department_id=e.department_id;
 
 -------10-----
 select job_id from employees where department_id in(10,20);
 
 ---------13---
 select last_name,hire_date from employees 
 join hire_dates
 using;
 
 
 
 ------15------
 select d.department_id,d.department_name,count(e.employee_id) as empl_oyee, avg(salary) as "AVG Salary",e.last_name
 from departments e
 join employees d
 on d.department_id=e.employee_id;
