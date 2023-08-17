package edu.prodapt.demo;
import java.util.*;
import java.util.Date;
import java.text.*;
public class College extends Exception {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDept;
	private String location;
	private Date startingDate;
	
	public College()
	{
		
	}
	public College(String name,String website,String mobile,String founder,Integer numberOfDept,String location,Date startingDate)
	{
		this.name=name;
		this.website=website;
		this.mobile=mobile;
		this.founder=founder;
		this.numberOfDept=numberOfDept;
		this.location=location;
		this.startingDate=startingDate;
	}
	
	public void setname(String Name)
	{
		name=Name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setwebsite(String Website)
	{
		website=Website;
	}
	public String getwebsite()
	{
		return website;
	}
	
	public void setmobile(String Mobile)
	{
		Mobile=mobile;
	}
	public String getmobile()
	{
		return mobile;
	}
	
	public void setfounder(String Founder)
	{
		founder=Founder;
	}
	public String getfounder()
	{
		return founder;
	}
	
	public void setnumberOfDept(Integer NumberOfDept)
	{
		numberOfDept=NumberOfDept;
	}
	public Integer getnumberOfDept()
	{
		return numberOfDept;
	}
	
	public void setlocation(String Location)
	{
		location=Location;
	}
	public String getlocation()
	{
		return location;
	}
	
	public void setstartingDate(Date StartingDate)
	{
		startingDate=StartingDate;
	}
	public Date getstartingDate()
	{
		return startingDate;
	}
	
	public String toString()
	{
		return "Name: " +name+ ",Website: "+website+"Mobile: "+mobile+",Founder: "+founder+", Number of Department: "
	           +numberOfDept+",Location: "+location+",StartingDate: "+startingDate;
	}
	
	static College createCollege(String line) throws Exception 
	{
	String[]details=new String[6];
	details=line.split(",");
	String name=details[0];
	String website=details[1];
	String mobile=details[2];
	String founder=details[3];
	Integer numberOfDept=details[4];
	String location=details[5];
	DateFormat df=new SimpleDateFormat("DD:MM:YYYY");
	Date startingDate=df.parse(details[6]);
	return new College(name,website,mobile,founder,numberOfDept,location,startingDate);
	}

}
