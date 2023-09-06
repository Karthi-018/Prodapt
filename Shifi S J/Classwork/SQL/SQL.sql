CREATE TABLE job_grades (
grade CHAR(1),
lowest_sal NUMBER(8,2) NOT NULL,
highest_sal NUMBER(8,2) NOT NULL
);

ALTER TABLE job_grades
ADD CONSTRAINT jobgrades_grade_pk PRIMARY KEY (grade);

INSERT INTO job_grades VALUES ('A', 1000, 2999);
INSERT INTO job_grades VALUES ('B', 3000, 5999);
INSERT INTO job_grades VALUES ('C', 6000, 9999);
INSERT INTO job_grades VALUES ('D', 10000, 14999);
INSERT INTO job_grades VALUES ('E', 15000, 24999);
INSERT INTO job_grades VALUES ('F', 25000, 40000);

COMMIT;



desc employees;



select employee_id,last_name,department_id,department_name,manager_id
from employees
natural join departments;



select manager_id,department_name
from employees
join departments
using (manager_id);


select department_name,employee_id,last_name,employees.department_id
from departments
left outer join employees
on(departments.department_id=employees.department_id);


select department_name,employee_id,last_name,employees.department_id
from departments
full outer join employees
on(departments.department_id=employees.department_id);


select department_name,employee_id,last_name,employees.department_id
from departments
right outer join employees
on(departments.department_id=employees.department_id);








select e.employee_id,e.last_name,e.first_name,e.manager_id,m.employee_id,m.last_name,m.first_name
from employees e
join employees m
on(e.manager_id=m.employee_id);




select employees.employee_id,employees.last_name,employees.job_id,employees.salary,employees.department_name,departments.location_id
from employees
inner join departments;


select * from employees;
select * from job_grades;




select department_name,employee_id,last_name,e.department_id
from departments d
cross join employees e;



select employee_id,last_name,employees.department_id,department_name,employees.Manager_id
from employees
join departments
on(employees.departmenmanager_idt_id=departments.department_id);


select employee_id,last_name,departments.department_id,department_name,employees.Manager_id
from employees
join departments
on(employees.department_id=departments.department_id);
--where employees.Manager_id=1234;   //should not be used


select * from employees where last_name='King';
select * from departments;
select * from employees;
select * from job_grades; 


select employee_id,last_name,employees.job_id,employees.salary,departments.department_name,city
from employees
join departments
on(employees.department_id=departments.department_id)
--using(department_id)
join locations
on(departments.location_id=locations.location_id);
--using(location_id)


select employee_id,last_name,employees.job_id,salary,grade
from employees
join job_grades
on(salary between lowest_sal and highest_sal);




select * from employees
where department_id in
(select department_id from employees
where last_name='King');  //King's collegues i.e having same dept id





select department_id,salary,last_name from employees
where department_id in
(select department_id from employees where last_name='Abel')and salary >(select salary from employees where last_name='Abel')


select department_id,salary,last_name from employees
where department_id in
(select department_id from employees where last_name='Taylor') and 
salary > any (select salary from employees where last_name='Taylor');   //multirow subquery //last_name Taylor same dept
_id and salary > him //multirow because two Taylors.


select * from employees where salary = any (select min(salary) from employees group by department_id);



select * from employees
where department_id in
(select department_id from employees where last_name='Abel');





select * from job_history;



create table hire_dates (id number(8),hiredate Date default sysdate);
insert into hire_dates values(1,'02-05-2022');
insert into hire_dates(id) values(2);
select * from hire_dates;



create table hire_dates1 (id number(8),hiredate Date)
insert into hire_dates1 values(2,'03-06-2023');
insert into hire_dates1(id) values(123456789);//error- because max 8 characters only mentioned
insert into hire_dates1(id,hiredate) values(4,sysdate);
select * from hire_dates1;




alter table employees add
salary Number(8,2)
constraint emp_salary_ck CHECK (salary>0);


select email from employees;


update employees set salary=24000 where employee_id=176;


select employee_id from employees where last_name='Taylor';

alter table employees Read only;

alter table employees read write;



FLASHBACK table hr.employees to TIMESTAMP TO_TIMESTAMP('2023-08-18 01:05:59','YYYY-MM-DD HH:MM:SS');



drop sequence DEPT_DEPTID_SEQ;


create sequence dep_seq
increment by 10
start with 300
nocycle
nocache;



insert into departments values(dep_seq.nextval,'Training',null,null);

select * from departments order by department_id;


select dep_seq.nextval,dep_seq.currval from dual;



create sequence dept_seque
increment by 10
start with 310
nocycle
nocache;


insert into departments values(dep_seq.nextval,'Training',null,null);

select dep_seq.nextval,dep_seq.currval from dual;

update departments set department_id=320 where department_id=340;




create synonym emp for employees;


select * from emp;   //employees also accessible



create user shifi identified by 123;


create user identified by 123;

alter user hr
identified by hr;


select * from user_tab_privs_made;


select * from user_sys_privs;


















CREATE TABLE job_grades (
grade CHAR(1),
lowest_sal NUMBER(8,2) NOT NULL,
highest_sal NUMBER(8,2) NOT NULL
);

ALTER TABLE job_grades
ADD CONSTRAINT jobgrades_grade_pk PRIMARY KEY (grade);

INSERT INTO job_grades VALUES ('A', 1000, 2999);
INSERT INTO job_grades VALUES ('B', 3000, 5999);
INSERT INTO job_grades VALUES ('C', 6000, 9999);
commit;

INSERT INTO job_grades VALUES ('D', 10000, 14999);
savepoint s1;
rollback s1;    //deleted this row

select * from job_grades;

INSERT INTO job_grades VALUES ('E', 15000, 24999);
INSERT INTO job_grades VALUES ('F', 25000, 40000);
savepoint s2;
rollback s2;   //deleted these two rows,displays only commited insertions

INSERT INTO job_grades VALUES ('G', 29900, 28888);

SAVEPOINT s3;
select * from job_grades; //gives 4rows A,B,C,G
rollback s3; //gives three only

INSERT INTO job_grades VALUES ('I', 293838, 337373);
commit;
rollback;
select * from job_grades;//gives 4 rows(A,B,C,I)




select * from employees;














