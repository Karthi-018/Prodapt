package edu.prodapt.crud;

public class Employee {
	
	private int eId;
	private String eName;
	private String salary;
	
	public Employee() {
		
	}
	
	
	public Employee(int eId, String eName, String salary) {
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}
	
	public int geteId() {
		return eId;
	}
	
	public void seteId(int eId) {
		this.eId = eId;
	}
	
	public String geteName() {
		return eName;
	}
	
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "**EMPLOYEE DETAILS**\n"
				+ "Employee Id\t: "+eId+
				"\nEmployee Name\t: "+eName+
				"\nEmpoyee Salary\t: "+salary;
	}
	
	
	

}
