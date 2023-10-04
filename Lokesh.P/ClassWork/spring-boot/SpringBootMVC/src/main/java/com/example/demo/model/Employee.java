package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int eid;
	private String ename;
	private int salary;
	private String dept;
	
	public Employee(int eid, String ename, int salary, String dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}
	

}
