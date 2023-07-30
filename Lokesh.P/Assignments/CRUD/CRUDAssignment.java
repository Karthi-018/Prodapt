public class CRUDAssignment {
    private int EmpId;
    private String EmpName;
    private long EmpSalary;

    CRUDAssignment(int EmpId,String EmpName, long EmpSalary)
    {
    }

    CRUDAssignment(int EmpId,long EmpSalary,String EmpName)
    {
        this.EmpId=EmpId;
        this.EmpName=EmpName;
        this.EmpSalary=EmpSalary;
    }

    public void setId(int Emp_id)
    {
        this.EmpId=EmpId;
    }
    public void setName(String Emp_name)
    {
        this.EmpName=EmpName;
    }
    public void setSalary(long Emp_salary)
    {
        this.EmpSalary=EmpSalary;
    }

    public int getId()
    {
        return EmpId;
    }
    public String getName()
    {
        return EmpName;
    }
    public long getSalary()
    {
        return EmpSalary;
    }

    public String toString()
    {
        return EmpId+" "+EmpName+" "+EmpSalary;
    }

}