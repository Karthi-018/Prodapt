select EMPLOYEE_ID ,
START_DATE ,
END_DATE ,
JOB_ID ,
DEPARTMENT_ID  from job_history;



select employee_id,job_id from employees
union
select employee_id,job_id from job_history;    //all employees without duplicates from previous and current




select employee_id,job_id from employees
union All
select employee_id,job_id from job_history;    //all employees



select employee_id,department_id from employees
INTERSECT
select employee_id,department_id from job_history;    //same dept id for both tables



select job_id,employee_id from employees
minus
select job_id,employee_id from job_history;    //not same id fror previous and current



select employee_id,job_id,salary from employees
union
select employee_id,job_id,0 from job_history;    //current and previous job details with salary  
//salary not present in job_history so match with datatype




select employee_id,job_id,last_name from employees
union
select employee_id,job_id,to_char(null) from job_history;    //last_name not present in job_history so match with datatype










