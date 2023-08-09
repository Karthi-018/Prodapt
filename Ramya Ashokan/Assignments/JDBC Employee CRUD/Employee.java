package com.employee;

public class Employee {
	private int eid;
	private String ename;
	private long salary;
	private String dep;
	Employee(){}
	Employee(int eid,String ename,long salary,String dep)
	{
	this.eid=eid;
	this.ename=ename;
	this.salary=salary;
	this.dep=dep;
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
	public void setDep(String dep)
	{
	this.dep=dep;
	}
	public String getDep()
	{
	return dep;
	}
}
