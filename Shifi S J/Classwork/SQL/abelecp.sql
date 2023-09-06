set serveroutput ON;
declare
v_exp number;
begin
select months_between(sysdate,hire_date) into v_exp from employees 
where last_name='Abel';
dbms_output.put_line('Abel experience is '||v_exp|| ' months');
end;
