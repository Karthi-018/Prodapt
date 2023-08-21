create table hire_date
(id number(8), hire_date DATE default sysdate);

insert into hire_date values(1,'18-08-2021');
insert into hire_date(id) values(2);
insert into hire_date(id) values(123456789);

select * from hire_date;

create table hire_date1
(id number(8), hire_date DATE );

create table dept80
as select employee_id, last_name, salary*12 sal , hire_date
FROM employees
where department_id = 80;  

select * from dept80;

alter TABLE dept80 read only;

create view empview80
as select employee_id, last_name, salary FROM employees
where department_id=80;

select * from empview80;

create view dept_sum_view
(name,minsal,maxsal,avgsal)
as SELECT d.department_name,min(e.salary),max(e.salary),avg(e.salary)
from employees e join departments d
on (e.department_id = d.department_id)
group by d.department_name;

select EMPLOYEE_ID ,LAST_NAME ,SALARY  from empview80
delete from empview80
where last_name = 'King';
--
create sequence dept_deptid_seq
increment by 10
start with 300
nocache
nocycle;

insert into departments
VALUES(dept_deptid_seq.nextval,'training',null,null);
  
select dept_deptid_seq.currval
from dual;  

select dept_deptid_seq.currval,dept_deptid_seq.nextval
from dual;

drop sequence dept_deptid_seq;

-- synonym
create synonym emp for employees;
select * from emp;
select * from employees;
