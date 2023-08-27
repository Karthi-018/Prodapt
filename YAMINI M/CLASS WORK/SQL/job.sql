CREATE TABLE job_grades (
grade 		CHAR(1),
lowest_sal 	NUMBER(8,2) NOT NULL,
highest_sal	NUMBER(8,2) NOT NULL
);

ALTER TABLE job_grades
ADD CONSTRAINT jobgrades_grade_pk PRIMARY KEY (grade);

INSERT INTO job_grades VALUES ('A', 1000, 2999);
INSERT INTO job_grades VALUES ('B', 3000, 5999);
INSERT INTO job_grades VALUES ('C', 6000, 9999);
INSERT INTO job_grades VALUES ('D', 10000, 14999);
INSERT INTO job_grades VALUES ('E', 15000, 24999);
INSERT INTO job_grades VALUES ('F', 25000, 40000);


delete from job_grades where grade='G';

COMMIT;

savepoint s2;

ROLLBACK to s2;

desc employees;
desc jobs;
desc job_grades;


drop table job_grades;

ROLLBACK;

select * from employees;
select * from job_grades;

select employee_id,last_name,job_id,grade
from employees e
join jobs j
on(e.job_id=j.job_id)
join job_grades jg
on(j.grade=jg.grade);

select employee_id,last_name,job_id,grade
from employees 
join jobs 
using (job_id)
join job_grades 
on(salary between lowest_sal and highest_sal);

select*from employees
where salary=(select salary from employees where last_name='Abel');

select*from employees where salary > (select salary from employees where employee_id=100);

select*from employees
where salary > any(select salary from employees where department_id in(select department_id from employees where last_name='Abel'));

select*from employees
where department_id in (select department_id from employees where last_name='Taylor')
and salary> any(select salary from employees where last_name='Taylor');

