 
 --------------------------------19-08-23---------------------------------------
 
 
 ----------------------------------- seqquence ---------------------------------
 
 drop sequence Dept_deptid_seq;
 
 create sequence dep_seq
    increment by 10
    start with 300
    nocycle
    nocache;
    
insert into departments values(dep_seq.nextval,'training',null,null);
insert into departments values(dep_seq.nextval,'department',null,null);


select dep_seq.nextval,DEP_SEq.currval from dual;

------------------------------synonyms------------------------------------------

create synonym emp 
for employees;

select * from emp;

create user userA  identified by reset123;


------ to change hr password 
alter user hr
identified by hr;


select * from user_tab_privs_made;

select * from user_sys_privs;


--------------------------------------------------------------------------------------------------------------------------------------
