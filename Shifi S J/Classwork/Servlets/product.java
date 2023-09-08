package edu.training.model;

public class Product {
int pid;
String pname;
String pdesc;
double price;
int pquantity;

public Product() {
	super();
}
public Product(int pid, String pname, String pdesc, double price, int pquantity) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pdesc = pdesc;
	this.price = price;
	this.pquantity = pquantity;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPdesc() {
	return pdesc;
}
public void setPdesc(String pdesc) {
	this.pdesc = pdesc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getPquantity() {
	return pquantity;
}
public void setPquantity(int pquantity) {
	this.pquantity = pquantity;
}


@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", price=" + price + ", pquantity="
			+ pquantity + "]";
}
}
