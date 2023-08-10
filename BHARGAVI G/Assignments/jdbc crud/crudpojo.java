package edu.prodapt.demos;
public class crudpojo {
	private int eid;
	private String ename;
	private String edept;
	private double esal;
	public crudpojo(int eid, String ename, String edept, double esal) {
		
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
	

}