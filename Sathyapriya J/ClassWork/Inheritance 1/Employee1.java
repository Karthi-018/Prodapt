import java.util.Scanner;

class Employee1
{
	int eid;
	String ename;
	int salary;
	
	Employee1(int eid,String ename,int salary)
	{
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	

	public void setEid(int eid)
	{
		this.eid = eid;
	}
	public int getEid()
	{
		return eid ;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public String getEname()
	{
		return ename;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}

	
	

}