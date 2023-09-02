package edu.training.model;

import java.sql.Date;
import java.util.*;

public class Customer {
	
	private String name;
	private Date dob;
	private String email;
	private String phno;
	private String add;
	private String pwd;
	public Customer(String name, Date dob, String email, String phno, String add, String pwd) {
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.phno = phno;
		this.add = add;
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
