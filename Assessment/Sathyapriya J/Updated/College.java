package test1;

import java.util.Date;
import java.text.*;

public class College 
{
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private int numberOfDept;
	private String location;
	private java.util.Date startingDate;
	
	College()
	{
		
	}

	public College(String name, String website, String mobile, String founder, int numberOfDept, String location,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.numberOfDept = numberOfDept;
		this.location = location;
		this.startingDate = startingDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public int getNumberOfDept() {
		return numberOfDept;
	}

	public void setNumberOfDept(int numberOfDept) {
		this.numberOfDept = numberOfDept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public java.util.Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(java.util.Date startingDate) {
		this.startingDate = startingDate;
	}
	
	@Override
	public String toString() {
		return "CollegeBO [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public static College inputCol(String college) throws ParseException 
	{
		String i[] =college.split(",");
		String name = i[0];
		String website = i[1];
		String mobile = i[2];
		String founder = i[3];
		int numberOfDept = Integer.parseInt(i[4]);
		String location = i[5];
		DateFormat df = new SimpleDateFormat("dd-MM-yy");
		java.util.Date utilDate = df.parse(i[6]);
		java.sql.Date  startingDate = new java.sql.Date(utilDate.getTime());
		return new College(name,website,mobile,founder,numberOfDept,location,startingDate);
		
	}
	
		
	
}
