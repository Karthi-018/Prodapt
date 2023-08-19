---19-08-23---
-----------------------------SEQUENCE-------------------------------------------
create sequence dept_depid_seq 
                increment by 10
                start with 120
                maxvalue 9999
                nocache
                nocycle;
                
select * from departments;

insert into departments values (dept_depid_seq.next,'Training',null,null);

drop sequence dept_depid_seq;

create sequence dept_seq
                increment by 10
                start with 300
                nocycle
                nocache;
insert into departments values (dept_seq.nextval,'Training',null,null);

select * from departments;

select dept_seq.nextval,dept_seq.currval from dual;

delete from departments where department_id =310;


----------------------------Synonym---------------------------------------------
create synonym emp for employees;

select * from emp;

drop synonym emp;

-----------------------------DCL------------------------------------------------

create user userName identified by password;   
create user userA identified by Reset123;

--------------------------------------------------------------------------------

alter user hr
identified by hr;

select * from user_sys_privs;
--------------------------------------------------------------------------------
