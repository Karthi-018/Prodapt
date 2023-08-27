select* from employees;

 select sum(salary)/count(*)
 from employees;
 
 select sum(salary)/count(NVL(salary,'0'))
 from employees;
 
 select sum(salary)/count(NVL(salary,0))
 from employees;
 
 select round(sum(salary)/count(*),2),
 round(sum(salary)/count(manager_id),2),
 round(sum(salary)/count(NVL(manager_id,0)),2),
 round (avg(salary),2)
 from employees;
 
 select first_name,salary,employee_id
 from employees
 having Avg(salary)>15000
 group by employee_id,salary
 order by employee_id; //Error
 
 select first_name,salary,employee_id
 from employees
 having Avg(salary)>15000
 group by employee_id,salary,first_name
 order by employee_id; //Not selected average salary to display
 
 select first_name,salary,employee_id,Avg(salary)
 from employees
 having Avg(salary)>15000
 group by employee_id,salary,first_name
 order by employee_id;
 
  select first_name,salary,employee_id,Avg(salary)
 from employees
 group by employee_id,salary,first_name
 having Avg(salary)>15000
 order by employee_id; //correct order group by next having
 