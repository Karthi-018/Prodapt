package edu.prodapt.demos;
import java.util.Scanner;
class EmployeeDetalis
{
    int eid;
    String ename;
    int salary;

    EmployeeDetalis(){}
    public void setId(int eid) {
        this.eid = eid;
    }
    public void setName(String ename) {
        this.ename = ename;
    }
    public void setMark(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return eid;
    }

    public String getName() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }
    public EmployeeDetalis(int eid, String ename, int salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    public String toString()
    {
        return eid+" \t"+ename+" \t"+salary;
    }
    
}

