---------------------function with parameters---------------

CREATE FUNCTION check_sal (
    id employees.employee_id%TYPE
) RETURN BOOLEAN IS

 

    v_dept_id    employees.department_id%TYPE;
    v_salary     employees.salary%TYPE;
    v_avg_salary employees.salary%TYPE;
BEGIN
    SELECT
        salary,
        department_id
    INTO
        v_salary,
        v_dept_id
    FROM
        employees
    WHERE
        employee_id = id;

 

    SELECT
        AVG(salary)
    INTO v_avg_salary
    FROM
        employees
    WHERE
        department_id = v_dept_id;

 

    IF v_salary > v_avg_salary THEN
        RETURN true;
    ELSIF v_salary < v_avg_salary THEN
        RETURN false;
    ELSE
        RETURN NULL;
    END IF;

END;
/
----function call-------
declare
v_bool boolean := check_sal(&&eid);
begin
if(v_bool = null) then
dbms_output.put_line('No record found');
elsif(v_bool) then
dbms_output.put_line(&eid||' '||'Salary is greater than avg salary ');
else
dbms_output.put_line(&eid||' '||'Salary is lesser than avg salary');
end if;
end;
/