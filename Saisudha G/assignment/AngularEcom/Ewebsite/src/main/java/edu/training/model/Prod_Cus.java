package edu.training.model;

public class Prod_Cus {
	private String uname;
	private String pwd;
	private int Pid;
	private String Pname;
	private double Pprice;
	private int Pqty;
	public Prod_Cus() {}
	public Prod_Cus(String uname, String pwd, int pid, String pname, double pprice, int pqty) {
		super();
		this.uname = uname;
		this.pwd =pwd;
		Pid = pid;
		Pname = pname;
		Pprice = pprice;
		Pqty = pqty;
	}

	public String getName() {
		return uname;
	}

	public void setName(String uname) {
		this.uname = uname;
	}

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String pwd) {
		this.pwd= pwd;
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
