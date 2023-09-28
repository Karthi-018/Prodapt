package edu.training.model;

public class Product {
	
	private int Pid;
	private String Pname;
	private String Pdes;
	private double Pprice;
	private int Pqty;
	
	
	public Product() {}
	
	public Product(int pid, String pname, String pdes, double pprice, int pqty) {
		super();
		Pid = pid;
		Pname = pname;
		Pdes = pdes;
		Pprice = pprice;
		Pqty = pqty;
		
	}
	
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPdes() {
		return Pdes;
	}
	public void setPdes(String pdes) {
		Pdes = pdes;
	}
	public double getPprice() {
		return Pprice;
	}
	public void setPprice(double pprice) {
		Pprice = pprice;
	}
	public int getPqty() {
		return Pqty;
	}
	public void setPqty(int pqty) {
		Pqty = pqty;
	}

	
	
	
	
	

}
