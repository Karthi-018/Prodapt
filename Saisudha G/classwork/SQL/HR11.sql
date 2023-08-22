update employees set salary=18000 where last_name='King';

select first_name||' '|| q'[employee's]'||' '|| last_name from employees;

select sum(salary)from employees
group by department_id
ORDER BY department_id;
select last_name from employees
GROUP by last_name;

define col=last_name;
select &&col from employees
where &col='Abel';
undefine col;

select &coln,&n from employees
where &&coln=10000;
undefine coln;
select to_char(to_date('20-08-2023'),'ddspth month,yyyysp') from dual;
select to_number('123',999) from dual;
select to_char(123.41) from dual;

select nvl2(commission_pct,2,10) from employees;