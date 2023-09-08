package edu.training.mavenDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String eName;
	private int salary;
	
	public Employee(String eName, int salary) {
		this.eName=eName;
		this.salary=salary;
	}
	
	public Employee(int eid, String eName, int salary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
	}


	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", salary=" + salary + "]";
	}
	

}
