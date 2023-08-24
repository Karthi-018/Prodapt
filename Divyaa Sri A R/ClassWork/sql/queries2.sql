create table hire_dates(
id NUMBER(8),
hire_date date default SYSDATE);
insert into hire_date values(1,'12-08-2023');
insert into hire_dates(id) values(2);

 

select * from hire_dates;
insert into hire_dates(id) values(1234567890);

 

create table hire_date1(
id NUMBER(8),
hire_date1 date );
insert into hire_date1 values(1,'12-08-2023');
select * from hire_date1;

 

create table dept80
AS
    select employee_id,last_name,salary*12 "Annual",hire_date from employees
    where department_id=80;
   select*from dept80;
   -----------------read only file----------
alter table employees read only;
--------------------read and write=------------------
alter table employees read write;
update employees 
set salary=10002 where employee_id=200;
select *from employees;
------------read and write values from user-----
alter table employees read write;
insert into employees values(&employee_id,&first_name,&last_name,&email,&phone_number,&hire_date,&job_id,&salary,&commision_pct,&manager_id,&dept_id);

 

create view  empview1
AS
    select employee_id,last_name,salary,hire_date from employees
    where department_id=80;
   select*from empview1;
   select max(salary) from empview1;
   --delete from empview1 where salary=(select max(salary) from empview1);
   delete from empview1 where last_name='King';
   rollback;

 

create view  empview2
AS
    select employee_id,email,last_name,salary,salary*12 "Annual",hire_date from employees
    where department_id=80;
    insert into empview2(employee_id,email,last_name) VALUES(1,'DFSA','sally');
    select*from empview2;

create view  empview3
AS
    select employee_id,email,last_name,salary,salary*12 "Annual",hire_date from employees
    where department_id=80;
    insert into empview3(employee_id,email,last_name) VALUES(1,'DFSA','sally');
    select*from empview3;

    -----------------------sequence(start value 400 and increament by 10)--------------
create sequence dept_deptid_seq
    increment by 10
        start with 400
        maxvalue 9999
        nocache
        nocycle;
        select*from departments;
---select dept_deptid_seq.nextval from dual;
insert into departments values(dept_deptid_seq.nextval,'IIT',null,null);
select dept_deptid_seq.nextval,dept_deptid_seq.currval from dual;
drop sequence dept_deptid_seq;

 

create synonym  emp
for employees;
select*from emp;
drop synonym emp;

 

create user abc identified by y123;

 

grant privilege user,create session to hr;----------------to create user by grant-----

 

alter user hr
identified by 123;----------to change the password---------
select * from user_tab_privs_made;
select *from user_sys_privs;
