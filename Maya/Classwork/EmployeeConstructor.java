import java.util.*;
public class EmployeeConstructor
{
    public static void main(String[] args) {
        EmployeeConstructor obj = new EmployeeConstructor();
        obj.setEid(123);
        obj.setEname("ram");
        System.out.println("Employee id : "+obj.getEid()+" and Name : "+obj.getEname());
        EmployeeConstructor obj1= new EmployeeConstructor(134,"raja");
        System.out.println("Employee id : "+obj1.getEid()+" and Name : "+obj1.getEname());

    }
    int eid;
    String ename;

    public EmployeeConstructor() {
    }

    public EmployeeConstructor(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

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
}
