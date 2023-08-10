package edu.prodapt.crud;

public class Employee {
	
	private int eId;
	private String eName;
	private String salary;
	
	
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
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
	
	

}
