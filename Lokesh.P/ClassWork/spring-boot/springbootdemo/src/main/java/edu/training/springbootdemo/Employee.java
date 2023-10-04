package edu.training.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int eid;
	private String ename;
	private int salary;
	@Autowired
	private department department;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public department getDepartment() {
		return department;
	}
	public void setDepartment(department department) {
		this.department = department;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, int salary, edu.training.springbootdemo.department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}
	public void display()
	{
		System.out.println("Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department=" + department + "]");
		
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department=" + department + "]";
	}
	

}
