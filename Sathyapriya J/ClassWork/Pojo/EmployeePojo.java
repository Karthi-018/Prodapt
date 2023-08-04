package PracticePackage.PojoDemo;

import java.util.*;


public class EmployeePojo{
	private int eid;
	private String ename;
	private int salary;
	
	EmployeePojo(int id,String name,int sal)
	{
		eid = id ;
		ename = name ;
		salary = sal;
	}

	public void setEid(int id)
	{
		eid = id;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEname(String name)
	{
		ename = name;
	}
	
	public String getEname()
	{
		return ename;
	}

	public void setSalary(int sal)
	{
		salary = sal;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	
	public String toString()
	{
		return eid+" "+ename+" "+salary;
	}
	



}
	