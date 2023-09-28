package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Employee 
{
	@Id
	public int eid;
	public String ename;
	public int salary;
	public String dept;
	
	
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public int getSalary() 
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	public String getDept() 
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	@Override
	public String toString() 
	{
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
}
