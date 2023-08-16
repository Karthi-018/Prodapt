select table_name from user_tables;
describe jobs;
desc locations;--show the structure of the table
select * from employees;--don't give * and coulumn name simultaneously;
select first_name,last_name,salary,salary*12  as "Annual_Income" from employees;--don't give space in column name
select  first_name||' '||last_name as Name from employees;--||concat two columns
select  first_name||' is a '||job_id  as "Employee_Details" from employees;--||concat two columns
select  first_name||q'& "Employees Manager is "&' ||manager_id  as "Employee_Details" from employees;--use queue q ->for printing special character like '' "" in string use delimiter[not in numbers and alphabet]
select distinct First_name from employees;
select  first_name||' '|| last_name as Name from employees;

--Restricting and Sorting
select * from employees where salary not in(4800,17000);
select *from employees;
select * from employees where first_name like '%ll%';--?
select * from employees where salary between 4800 and 17000 order by first_name desc;
--select &calName from employees where  salary between &con;--dynamic query using &
--select &&calName from &tabName where &con order by &calName;
--select &&calName1,&calName2 from &tabName where &con order by &calName1;
--undefine calName1;
set verify on;
select &&calName1,&calName2 from &tabName where &con order by &calName1;--?
undefine calName1;
select * from employees order by first_name;
select last_name, lower(last_name) as uppercase from employees where last_name='Austin' ;--case function

select concat(first_name,last_name) from employees ;
select last_name,instr(last_name,'t') from employees where last_name='Austin' ;
select substr(last_name,3,2) from employees where last_name='Austin' ;
select trim('A' from last_name) from employees where last_name='Austin' ;
select last_name ,replace(last_name,'A','a') from employees where last_name='Austin' ;
select length(lpad(last_name,10,'*')) from employees  ;
select length(last_name) from employees  ;
--number function
select salary,commission_pct,trunc(commission_pct) from employees  ;
select &&colname,upper(&colname) from employees where &con;

undefine colname;
select * from jobs;

--coalesce
select employee_id,last_name,commission_pct,manager_id, coalesce(commission_pct,manager_id,0) from employees;
--case
select employee_id,last_name,salary,
case job_id when 'AD_PRES' then salary*0.30+salary
            when 'FI_MGR' then salary*0.20+salary 
            else salary
end        
from employees;
--Decode
select employee_id,last_name,salary,
decode (job_id, 'AD_PRES', salary*0.30+salary
            ,'FI_MGR', salary*0.20+salary 
            , salary
)        
from employees;

--Multiple line function aggregate
select count(*) from employees;
select sum(salary) from employees;--number
select round(avg(salary),2) from employees;--number
select max(hire_date) from employees;-- character and number and date
select min(salary) from employees;
select min(last_name) from employees;

select round(sum(salary)/count(*),2),
round(sum(salary)/count(manager_id),2),
round(sum(salary)/nvl(count(manager_id),0),2),
round((sum(salary)/avg),2) from employees;
select * from employees;
--group by
select department_id,job_id,salary, count(department_id),count(job_id),count(salary),sum(salary),round(avg(salary),0),max(salary),min(salary)
from employees
group by department_id,job_id,salary
order by department_id;
--, where having
select department_id,job_id,salary, count(department_id),count(job_id),count(salary),sum(salary),round(avg(salary),0) as aveg,max(salary),min(salary)
from employees 
where job_id='AD_VP' 
having round(avg(salary),0) >15000
group by department_id,job_id,salary
order by department_id;