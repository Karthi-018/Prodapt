package edu.traing.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	
	public int eid;
	public String eName;
	public int Salary;
	@Autowired
	public Department department;
	
	
	public Employee ()
	{
		
	}
	
	
	public Employee(int eid, String eName, int salary, Department department) {
		super();
		this.eid = eid;
		this.eName = eName;
		Salary = salary;
		this.department = department;
	}

	
	
	public int getEid() 
	
	{
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String geteName() 
	{
		return eName;
	}



	public void seteName(String eName) 
	{
		this.eName = eName;
	}



	public int getSalary() 
	{
		return Salary;
	}



	public void setSalary(int salary) 
	
	{
		Salary = salary;
	}



	public Department getDepartment() 
	{
		return department;
	}



	public void setDepartment(Department department) 
	{
		this.department = department;
	}

	

	public String displayDetails()
	{
		return "Employee [eid=" + eid + ", eName=" + eName + ", Salary=" + Salary + ", department=" + department + "]";
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", Salary=" + Salary + ", department=" + department + "]";
	}

	

	

}
