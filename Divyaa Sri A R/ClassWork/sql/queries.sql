select first_name||last_name"Name"  from employees;
--desc employees;
select *from employees;
--select first_name,last_name,salary,salary*12 "Updated salary" from employees;
--select first_name ||'is a '||job_id"sentence"from employees;
--select last_name||q'[Names's , 123 are]'||first_name"updated name" from employees;
--select distinct first_name,salary from employees; 
--
--
--select*from employees where department_id=80;
--select*from employees where salary>8000;
--select *from employees where salary <>8000;
--select*from employees where salary in(8000,4000,1);
--select*from employees where salary not in(8000,4000,1);
--select*from employees where salary between 8000 and 12000;
--select*from employees where salary not between 8000 and 12000;
select *from employees where last_name like 'k%%i';
select *from employees where last_name like '__a%';
select*from employees where last_name like 'K __a%r';
--
--select*from employees where salary=&salary;
--select*from employees where salary between &con;
--
--select * from &table_name where &con;
--select * from &table_name where &&con;
--select &colname from &table_name where &con;
--select last_name,first_name,salary*12  "Salary" from &table_name order by Salary;
--
--select first_name,last_name,salary*12 "Salaryy" from employees order by first_name,last_name;
--select salary,job_id,first_name from employees order by 3;
--Define col=department_id;
--
--select * from &&table_name where &con;
--undefine table_name;
--select upper(first_name) from employees ;
select concat(first_name,last_name)"Names"from employees;
select last_name,instr(last_name,'a')from employees where last_name  like '%a%';
select REPLACE('JACK and JUE','J','BL')from employees;
select trim('J' from 'Jack') from employees;
select salary,round(salary,-3) from employees;
select salary,trunc(salary,-3) from employees;
select salary,mod(salary,107) from employees;
select to_DATE('21-04-08','DD-MM-YYYY')from employees;
select to_CHAR(TO_DATE('21-04-08'),'DAY-MON-YEAR')from employees;
select to_Number('3.142')from dual;
select to_char(24.3068,'999.999') from employees;
select max(hire_date)from employees;
select lower(last_name)from employees;
select initcap(first_name)from employees;
select sum(salary)from employees;
select max(salary)from employees;
select min(salary)from employees;
select sum(salary)total_salary,round(avg(salary))Average_Salary from employees;
select max(last_name)from employees;
select first_name,last_name,max(hire_date),min(hire_date) from employees;
select lpad(salary,8,'*')from employees;
select count (*)from employees;
select sum(salary)/count(*) from employees;
select sum(salary)/count(commission_pct) from employees;
select max(hire_date),min(hire_date),max(last_name) from employees;
select salary,salary*nvl(commission_pct,1) from employees;
select salary,salary*nvl2(commission_pct,2,0) from employees;
select salary,commission_pct,nullif(commission_pct,salary) from employees;
select salary,commission_pct,coalesce(commission_pct,salary) from employees;

 

 

set verify on;

 

define dept_id=30;

 

select * from employees where department_id=&dept_id;

 

--Select * From Employees Where Department_Id=10;
select*from employees;
select employee_id,last_name,job_id,salary,
decode( job_id , 'AD_PRES' , salary*0.10+salary
          ,'IT_PROG', salary*0.8+salary
          ,'ST_MAN',salary*0.5+salary
          ,'SA_REP', salary*0.1+salary
          ,salary
          )
           "Formatted Salary"
           from employees;


