
-------------------------SINGLE ROW FUNCTION------------------------------------
select first_name||' '||last_name from employees;
select concat(first_name,last_name) Name from employees;---concat

 select upper(first_name),lower(last_name)from employees;--upper & lower
 
 select last_name,salary*12 "annual salary" from employees
 order by salary;
 
 select initcap(first_name||' '||last_name) from employees;--Initcap
 
 select substr(first_name,1,3),substr(last_name,-2)
 from employees;--substring
 
 select instr('saisudha','a',3,1) from dual;--instring
 select instr('saiisudhaai','ai',1,2) from dual;
 select instr('how are you','are',8,1) from dual;
 
 select lpad('sai',5,'*') from dual;--l&r pad
 select rpad('sai',5,'*') from dual;
 
 select rpad('sai',5) from dual;
 
 select trim('s' from 'saisudha') from dual;--trim
 select (trim((substr('sudha',1,1)) from 'sudha')) from dual;
 
 select replace('saisudha','a','i') from dual;--replace
 
 select floor(445.545) from dual;
 select to_char(to_date('11-08-2023','dd-mm-yy'),'Month') from dual;
 select to_char(to_date('11-08-2023','dd-mm-yy'),'FMDDTH MONTH, YEAR') from dual;
 
 select to_char(to_date(hire_date,'YYYY-MM-DD'),'month dd,YYYY')from employees;
 -----------------------------------Joins---------------------------------------
 
 desc employees;
 desc departments;
 
 select last_name,department_name
 from  employees
 natural join departments;
 
 select last_name,department_name
 from  employees
 natural join departments
 where department_name='Sales';--euqi natural or inner joins
 
 select d.department_name,count(e.employee_id)
from  departments d
left join  employees e
on(d.department_id=e.department_id)
group by d.department_name;
 
define coln=employee_id
 select &&coln
 from employees
 where &coln=103 ;
 undefine coln;
----
--From the following tables, write a SQL query to find full name (first and last name), job title, start and end date of last jobs of employees who did not receive commissions
 desc employees;
 desc jobs;
 desc job_history;
 
 select concat(first_name,last_name) name,job_title,start_date,end_date
 from employees
 join jobs
 using(job_id)
 join job_history
 using(job_id)
 where commission_pct is null;
 
 SELECT CONCAT(e.first_name, ' ', e.last_name) AS Employee_name,
       j.job_title,
       h.*
FROM employees e
JOIN
  (SELECT MAX(start_date),
          MAX(end_date),
          employee_id
   FROM job_history
   GROUP BY employee_id) h ON (e.employee_id=h.employee_id)
JOIN jobs j ON (j.job_id=e.job_id)
WHERE e.commission_pct = 0;