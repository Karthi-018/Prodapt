public class Employee
{
    private int eid;
    private String ename;
    private String edes;
    private double esal;

    Employee(int eid,String ename,String edes,double esal)
    {
        this.eid = eid;
        this.ename = ename;
        this.edes = edes;
        this.esal = esal;
    }

    public void setEid(int eid)
    {
        this.eid = eid;
    }
    public int getEid()
    {
        return eid;
    }
    public void setEname(String ename)
    {
        this.ename = ename;
    }
    public String getEname()
    {
        return ename;
    }
    public void setEdes(String edes)
    {
        this.edes = edes;
    }
    public String getEdes()
    {
        return edes;
    }
    public void setEsal(double esal)
    {
        this.esal = esal;
    }
    public double getEsal()
    {
        return esal;
    }

    public String toString()
    {
        return "Employee ID : "+eid+" Employee Name : "+ename+" Employee Designation : "+edes+" Employee Salary : "+esal;
    }
    
}