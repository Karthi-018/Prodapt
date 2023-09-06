create view empvu80
as select employee_id,last_name
from employees
where department_id=80;     //simple view



delete from empvu80 where last_name='King';

rollback;

select * from employees;



CREATE OR REPLACE VIEW DEPT_SUM_VU(name,minsal,maxsal,avgsal) 
as select d.department_name,min(e.salary),max(e.salary),avg(e.salary)
from employees e
join departments d
on(e.department_id=d.department_id)
group by d.department_name;        //complex view



drop TABLE JOB_GRADES;

SELECT * FROM JOB_GRADES;

FLASHBACK TABLE hr.JOB_GRADES to BEFORE DROP;

