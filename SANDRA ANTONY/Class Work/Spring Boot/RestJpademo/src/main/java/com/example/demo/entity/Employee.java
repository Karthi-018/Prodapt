package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee
{
	@Id
	private int eid;
	private String name;
	private int salary;
	private String dept;
	public int getEid() 
	
	{
		return eid;
	}
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
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
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", Salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
}
