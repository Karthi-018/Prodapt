1----------------------------
select * from employees where  hire_date > '31:12:1997' and job_id like '%clerk';

2---------------------------
select last_name,job_id,salary,commission_pct from employees 
where commission_pct is not null
order by salary desc;


3------------------------------------------
select 'The salary if'||' '||last_name||' '||'after a 10% raise is'||' '||round((salary/10)+salary) "New salary"
from employees
where commission_pct is null;



5-----------------------
select last_name  from employees
where last_name like '%K' 
union 
select last_name  from employees
where last_name like '%J' ;


6_________________________
select last_name,salary,
decode( commission_pct 
, 0.1 , 'yes'
, 0.15 , 'yes'
, 0.25 , 'yes'
, 0.3 , 'yes'
, 0.2 , 'yes'
, 0.35 , 'yes'
, 0.4 , 'yes'
, 'no')commission
from employees;

8------------------
select count(last_name) from employees
where last_name like '%n';


7---------
select department_name,location_id,last_name,job_id,salary
from employees e
join departments d
on(e.department_id=d.department_id)
where location_id=&loc;

10----------
select job_id from (select job_id from employees where department_id in(10,20));


15----------------
select e.department_id,department_name,count(employee_id),avg(salary),last_name
from employees e
join departments d
on(e.department_id =d.department_id)
group by department_name;
