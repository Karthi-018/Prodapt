create sequence dep_seq
increment by 10
start with 300
nocycle
nocache;



insert into departments values(dep_seq.nextval,'Training',null,null);

select * from departments order by department_id;


select dep_seq.nextval,dep_seq.currval from dual;
