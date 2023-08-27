create table hire_dates(id number(8),hiredate date  default SYSDATE); 
alter table hire_dates modify (id null);
delete from hire_dates where id=4;
insert into hire_dates values(1,'09-05-23');
insert into hire_dates (id)values(2);
insert into hire_dates values(4,'08-08-23');
select * from hire_dates;
 --create table using subquery
 create table dept80 
 as
 select employee_id,last_name,salary*12 annual,hire_date from employees where department_id=80;
 ---read write ?????deletion of pt 
 alter table hire_dates read only;
 insert into hire_dates values(4,'08-08-23');
alter table hire_dates read write;
  
  select * from dept80;
  
  -- simple view :view faster than table
  create view empvu80
  as select employee_id,last_name,salary
  from employees
  where department_id=80;
  delete from empvu80 where salary =(select max(salary) from empvu80);
  describe empvu80;
  select * from  empvu80;
   create view hirevu(id) as select id from hire_dates;
   insert into hirevu values(5);
   select * from hirevu;
   delete from hirevu where id=5;
   
  
  --complex veiw
  create or replace view dept_sum_vu
  (name,minsal,maxsal,avgsal)
  as select d.department_name,MIN(e.salary),max(e.salary),avg(e.salary)
  from employees e join departments d
  on e.department_id=d.department_id group by department_name;
  select * from  dept_sum_vu;
  
  --sequence
  create sequence dept_deptid_sq
  increment by 10
  start with 120
  maxvalue 9999
  nocache
  nocycle;
  
  insert into departments(department_id,department_name,location_id)
  values(dept_deptid_sq,'IT',12);
  --drop and create sequence
  drop sequence dept_deptid_sq;
  create sequence dep_seq increment by 10 start with 300 nocycle nocache;
  insert into  departments values(dep_seq.nextval,'training',null,null);
  select * from departments where department_name='training';
  select dep_seq.nextval,dep_seq.currval from dual;--dual is dynamic dummy table
  select * from dep_seq;--?
  
  ---synonym---
  create synonym emp for  employees;
  select * from emp;
  drop synonym  emp;
  
  ------****create user****------
  create user ramya identified by Ramya123;
  ---****grant and revoke the previlege to hr to create user*****---
  grant create user,create session to hr;
  grant create session to hr;
  revoke create user from hr;
  ---
  alter user hr identified by rr;
  select * from user_tab_privs_made;--no table previleges given 
  select  * from user_sys_privs;
  
  