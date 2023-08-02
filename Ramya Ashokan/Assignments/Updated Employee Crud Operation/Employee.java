class Employee
{
private int eid;
private String ename;
private long salary;
Employee(){}
Employee(int eid,String ename,long salary)
{
this.eid=eid;
this.ename=ename;
this.salary=salary;
}

public void setEid(int eid)
{
this.eid=eid;
}
public int getEid()
{
return eid;
}

public void setEname(String ename)
{
this.ename=ename;
}
public String getEname()
{
return ename;
}

public void setSalary(long salary)
{
this.salary=salary;
}
public long getSalary()
{
return salary;
}
public String toString()
{
return "E-id: "+eid+" Name: "+ename+" Salary: "+salary; 
}
}