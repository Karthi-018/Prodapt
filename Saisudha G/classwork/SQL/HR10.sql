drop SEQUENCE dept_deptid_seq;

create sequence dept_deptid_seq
increment by 10
start with 300
--maxvalue 9999
nocache
nocycle;

insert into departments values(dept_deptid_seq.nextval,'Training',null,null);
select*from departments;
select dept_deptid_seq.nextval from dual;
select dept_deptid_seq.currval from dual;
-------------synonyms-------------------
create synonym emp for employees;
select*from emp;
select*from employees;
drop synonym emp;
-----------------dcl------------------

create user user1 identified by reset123;

alter user hr identified by hr1;
alter user hr identified by hr;
-------------to view privilages-----------
select * from user_tab_privs_made;
select * from user_sys_privs;



