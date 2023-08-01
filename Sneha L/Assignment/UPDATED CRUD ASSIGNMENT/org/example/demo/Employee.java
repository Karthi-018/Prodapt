package org.example.demo;

public class Employee {
    private int empId;
    private String empName;
    private String empDept;
    private int empSal;

    public Employee(int empId, String empName, String empDept, int empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpdept(String empDept) {
        this.empDept = empDept;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }


    public String toString() {
        return "Employee Details\n id:" + empId + "\nEmployee Name:" + empName + "\nEmployee Department:" + empDept + "\nEmployee Salary:" + empSal ;
    }
}
