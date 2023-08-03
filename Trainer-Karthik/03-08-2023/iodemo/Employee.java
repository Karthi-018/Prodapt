package edu.prodapt.demos.iodemo;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int eid;
	private String ename;
	private int salary;
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	

}
