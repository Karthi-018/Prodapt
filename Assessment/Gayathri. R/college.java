package edu.prodapt.jdbc;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class college {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private int numberOfDept;
	private String location;
	private Date StartingDate;
	
	college(String name,String website,String mobile,String founder,int numberOfDept,String location,Date StartingDate)
	{
		this.name=name;
		this.website=website;
		this.mobile=mobile;
		this.founder=founder;
		this.numberOfDept=numberOfDept;
		this.location=location;
		this.StartingDate=StartingDate;
	}
	college()
	{
		
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

	    public Integer getNumberOfDept() {
	        return numberOfDept;
	    }

	    public void setNumberOfDept(Integer numberOfDept) {
	        this.numberOfDept = numberOfDept;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public Date getStartingDate() {
	        return StartingDate;
	    }

	    public void setStartingDate(Date startingDate) {
	        StartingDate = startingDate;
	    }
	    static college  adddata(String line) throws Exception
		{
			
			String s[]=line.split(",");
			college o=new college();
			String name=s[0];
			String Website=s[1];
			String Mobile=(s[2]);
			String Founder=(s[3]);
			int NumberOfDept=(Integer.parseInt(s[4]));
			String Location=(s[5]);
			
			DateFormat df=new SimpleDateFormat("DD-MM-YY");
			Date d=df.parse(s[6]);
			Date StartingDate=(d);
			return new college(name,Website,Mobile,Founder,NumberOfDept,Location,StartingDate);
			
			
		}
	    public String toString() {
	        return "college{" +
	                "name='" + name + '\'' +
	                ", website='" + website + '\'' +
	                ", mobile='" + mobile + '\'' +
	                ", founder='" + founder + '\'' +
	                ", numberOfDept=" + numberOfDept +
	                ", location='" + location + '\'' +
	                ", StartingDate=" + StartingDate +
	                '}';
	    
	    }
}
