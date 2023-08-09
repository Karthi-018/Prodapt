package edu.prodaptEmployee.example;

public class EmployeePojo {
	private int eid;
	private String ename;
	private String edept;
	private double esal;
	public EmployeePojo(int eid, String ename, String edept, double esal) {
		
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.esal = esal;
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
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String toString() {
		return String.format("%-10d| %-12s| %-12s| %-10s",eid,ename,edept,esal);
	}

}
