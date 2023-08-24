SELECT
    d.department_id,
    d.manager_id,
    COUNT(e.employee_id) AS count
FROM
    departments d
    JOIN employees e ON ( e.department_id = d.department_id )
GROUP BY
    d.department_id,
    d.manager_id;