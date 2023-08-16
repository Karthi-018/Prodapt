package crudconnection;

public class Employee 
{
	int empid;
	String empname;
	int empsal;
	String empdes;
	
	public Employee()
	{
		
	}
	
	public Employee(int empid, String empname, int empsal, String empdes) 
	{
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empdes = empdes;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public String getEmpdes() {
		return empdes;
	}

	public void setEmpdes(String empdes) {
		this.empdes = empdes;
	}
	
}
