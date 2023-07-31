package example.service;

import java.util.Scanner;

public class EmployeeService {


    Employee employees[] = new Employee[11];

    public void initEmployeeList() {
        for (int i = 0; i < 10; i++) {
            employees[i] = new Employee((100 + (i + 1)), "Employee" + (i + 1), 100000 + (i + 1));

        }
    }

    public Employee findEmployee(int eid) {
        Employee emp = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getId() == eid) {
                    emp = employees[i];
                }
            }
        }
        return emp;
    }

    public Employee[] createEmployee(Employee employee) {
        Employee emp = findEmployee(employee.getId());
        if (emp == null) {
            employees[employees.length - 1] = employee;
        } else {
            System.out.println("Already Employee exist");
        }
        return employees;
    }

    public Employee updateEmployee(int eid, String eName, int salary)
    {
        Employee emp = findEmployee(eid);
        if (emp != null) {
            emp.setName(eName);
            emp.setSalary(salary);

        } else {
            System.out.println("Employee Record Not exist");
        }
    return emp;

    }

    public Employee[] employees()
    {
        return employees;
    }
    public Employee deleteEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter employee id : ");
        int id = sc.nextInt();
        Employee employee = findEmployee(id);
        int index = 0;
        if(employee!=null){
            int noOfEmployees=10;
            Employee[] newEmployeeList = new Employee[10];
            for(Employee e : employees){
                if(e!=null && e.getId()!=id) newEmployeeList[index++] = e;
            }
            noOfEmployees--;
            employees = newEmployeeList;
            System.out.println("\nDeleted employee");
        }
        else{
            System.out.print("\nNo employee with id : "+id);
        }
        return employee;
    }


}
