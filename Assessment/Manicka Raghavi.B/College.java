package university;

import java.util.Date;

public class College 
{
private String name;

private String website;

private String mobile;

private String founder;

private int numberOfDept;

private String location;

private Date startingDate; 

College()
{
	
}

College(String name,String website,String mobile,String founder,int numberOfDept,String location,Date startingDate)
{
	this.name=name;
	this.website=website;
	this.mobile=mobile;
	this.founder=founder;
	this.numberOfDept=numberOfDept;
	this.location=location;
	this.startingDate=startingDate;
	
}

public String getName()
{
	return name;
} 

public void setName(String name)
{
	this.name=name;
}

public String getWebsite()
{
	return website;
}

public void setWebsite(String website)
{
	this.website=website;
}

public String getMobile()
{
	return mobile;
}

public void setMobile(String mobile)
{
	this.mobile=mobile;
}

public String getFounder()
{
	return founder;
}

public void setFounder(String founder)
{
	this.founder=founder;
}
public int getDept()
{
	return numberOfDept;
}

public void setDept(int numberOfDept)
{
	this.numberOfDept=numberOfDept;
}

public String getLocation()
{
	return location;
}

public void setLocation(String location)
{
	this.location=location;
}

public Date getDate()
{
	return startingDate;
}

public void setDate(Date startingDate)
{
	this.startingDate=startingDate;
}

}
