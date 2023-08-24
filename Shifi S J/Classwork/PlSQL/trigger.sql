select * from job_history where employee_id=(select employee_id from employees where last_name='Abel');

update employees set job_id='IT_PROG',department_id='60' where last_name='Abel';

select job_id from employees where last_name='Abel';

-------------------------------------------

CREATE OR REPLACE TRIGGER display_salary_changes BEFORE

    DELETE OR INSERT OR UPDATE ON employees

    FOR EACH ROW

    WHEN (new.employee_id > 0 )

DECLARE

    sal_diff NUMBER;

BEGIN

    sal_diff := :new.salary - :old.salary;

    dbms_output.put_line('Old salary: ' || :old.salary);

    dbms_output.put_line('New salary: ' || :new.salary);

    dbms_output.put_line('Salary Difference: ' || sal_diff);

END;

/


update employees set salary=25000 where last_name = 'Abel';