package college;

import java.util.Date;

public class College 
{
	
private String name;
private String website;
private String mobile;
private String founder;
private int numberofDept;
private String location;
private Date startingDate;

public College(Comparable<String> name2, String website2, String mobile2, String founder2, int numberofDept2, String location2, Date startingDate2)
{
	
}

public College(String name, String website, String mobile, String founder, int numberofDept, String location, java.sql.Date date)
{
	this.name = name;
	this.website = website;
	this.mobile = mobile;
	this.founder = founder;
	this.numberofDept = numberofDept;
	this.location = location;
	this.startingDate = startingDate;
}

public void setName(String name)
{
	this.name = name; 
}
public String getName()
{
	return name;
}


public void setWebsite(String website)
{
	this.website = website; 
}
public String getWebsite()
{
	return website;
}


public void setMobile(String mobile)
{
	this.mobile = mobile;
}
public String getMobile()
{
	return mobile;
}


public void setFounder(String founder)
{
	this.founder = founder;
}
public String getFounder()
{
	return founder;
} 


public void setnumberofDept(int numberofDept)
{
	this.numberofDept = numberofDept;
}
public int getnumberofDept()
{
	return numberofDept;
} 

public void setLocation(String location)
{
	this.location = location;
}
public String getlocation()
{
	return location;
} 
public Date getStartingDate() {
    return startingDate;
}

public void setStartingDate(Date startingDate) {
    this.startingDate = startingDate;
}

@Override
public String toString() {
    return "college{" +
            "name='" + name + '\'' +
            ", website='" + website + '\'' +
            ", mobile='" + mobile + '\'' +
            ", founder='" + founder + '\'' +
            ", numberofDept=" + numberofDept +
            ", location='" + location + '\'' +
            ", startingDate=" + startingDate +
            '}';

}
}
