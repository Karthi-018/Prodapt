import java.util.Scanner;

public class Server {
    private int  eid;
    private String ename;
    private Double esalary;


    private String dept;


    public Server(int eid, String ename, String dept, double esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
        this.dept=dept;
    }

    //private String ename;





    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public Double getEsalary() {
        return esalary;
    }

    public void setEsalary(Double esalary) {
        this.esalary = esalary;
    }

    @Override
    public String toString() {
        return "Employee \n   ID : " + eid +"\n   Name : " +   ename +"\n   Salary : " + esalary + "\n Department : " +dept ;
    }




}
