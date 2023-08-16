select * from employees;

describe employees; -- to get only column names

select first_name,last_name,department_id dept from employees; -- alias

select employee_id, salary*12 as annual_salary from employees; -- creating expression

select first_name||' '||last_name name from employees; -- concatenation

select last_name || q'[ Employees's manager]' || manager_id from employees; -- q operator

select distinct department_id,job_id from employees; -- distinct to have unique values

-- where clause
select first_name||' '||last_name name from employees
where job_id = 'IT_PROG';

select first_name||' '||last_name name, department_id from employees
where department_id in(30,70,80); -- in operator

select first_name||' '||last_name name, department_id from employees
where department_id not in(20,30,40,50,60); -- not in operator

select first_name||' '||last_name name,salary from employees
where salary between 1000 and 5000; -- between operator

select first_name||' '||last_name name, salary from employees
where salary not between 1000 and 20000; -- not between

select first_name from employees where first_name like '%n'; -- like

select first_name from employees where first_name like '_ll__'; -- like 

select first_name,commission_pct from employees where commission_pct is null; -- is null

select first_name,commission_pct from employees where commission_pct is not null;-- is not null

select employee_id from employees where salary>1500 and job_id ='IT_PROG'; -- and operator

select job_id from employees where salary > 20000 or department_id in(10,20,30); --or operator 

select first_name,salary from employees where salary >8000 and (salary < 1500 or department_id = 80); -- or and nested 

select * from employees where rownum<10; -- to display no.of.rows

select rownum,rowid from employees; -- row id and row num

select rownum,rowid,e.* from employees e;
--date
select to_char(hire_date,'month') from employees; 

select to_char(hire_date,'day') from employees;

select to_char(hire_date,'dd-mm-yy hh:mi:ss') from employees;

select employee_id from employees where to_char(hire_date,'yyyy' )= '2005';

select first_name from employees where to_char(hire_date,'FMDay')='Monday'; -- return name of the day

select * from employees where to_char(hire_date,'D')='3'; -- d means day

select sysdate from dual; -- current date from dummy table

select systimestamp from dual; -- with seconds minutes

--order by
select first_name,job_id from employees 
order by job_id;


select * from employees 
order by 1; -- orders by 1st column

select first_name,salary,job_id from employees
order by job_id desc; -- multiple column sorting 

-- substitution 
select * from employees where &con;

select first_name,last_name,&&co
from employees 
order by &co;

SELECT   employee_id, last_name, job_id, &&column_name
FROM     employees
ORDER BY &column_name ;
-- In the example above, the user is asked to give the value for the variable, column_name, only once. The value that is supplied by the user (department_id) is used for both display and ordering of data. If you run the query again, you will not be prompted for the value of the variable.
-- define
DEFINE my_sal = 20000;
select * from employees where salary > &my_sal;
UNDEFINE my_sal;

-- VERIFY
Set verify on;
DEFINE my_sal = 20000;
select * from employees where salary > &my_sal;
UNDEFINE my_sal;
