package org.example.service;

import org.example.demo.Employee;

public class EmployeeService {
    Employee[] empArr = new Employee[10];

    public void initEmployeeArr() {

        for (int i = 0; i < 10; i++) {
            empArr[i] = null;
        }
    }

    public Employee findEmployee(int eid) {

        for (Employee emp:empArr) {
            if (emp!= null && emp.getEmpId() == eid) {
                return emp;
            }
        }

        return null;
    }

    public Employee[] createEmployee(Employee employee) {
        Employee emp = findEmployee(employee.getEmpId());
        if (emp == null) {
            for (int i=0;i<empArr.length;i++)
            {
                if (empArr[i]==null)
                {
                    empArr[i]=employee;
                    break;
                }
            }
        }
        else {
            System.out.println("Employee Already Exist");
        }
        return empArr;
    }

    public Employee updateDetails(int eid, String ename, String dept, int salary) {
        Employee emp = findEmployee(eid);
        if (emp != null) {
            emp.setEmpName(ename);
            emp.setEmpdept(dept);
            emp.setEmpSal(salary);
        } else {
            System.out.println(" Employee doesn't Exist");
        }
        return emp;
    }



    public Employee[] empArr() {
        return empArr;
    }

    public void deteleDetails(int deleteId) {
        boolean found = false;
        Employee[] newEmpArry = new Employee[empArr.length];
        int index = 0;
        for (Employee i : empArr) {
            if (i != null && i.getEmpId() == deleteId) {
                found = true;
            } else {
                newEmpArry[index] = i;
                index+=1;
            }
        }
        if (found) {
            System.out.println("Employee details deleted successfully");

        } else {
            System.out.println("Employee not found cannot be deleted");
        }
            empArr= newEmpArry;

    }
}
