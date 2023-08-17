package college;
import java.util.Date;
public class College {
private String name;
private String website;
private String mobile;
private String founder;
private int numberOfDept;
private String location;
private Date s_date;
College(){}
College(String name,String website,String mobile,String founder,int numberOfDept,String location,Date s_date)
{
	this.name=name;
	this.website=website;
	this.mobile=mobile;
	this.founder=founder;
	this.numberOfDept=numberOfDept;
	this.location=location;
	this.s_date=s_date;
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

public Date getS_date() {
    return s_date;
}

public void setS_date(Date s_date) {
    this.s_date = s_date;
}

public String toString() {
	System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",name,website,mobile,founder,numberOfDept,location,s_date);
    return "";
}
}


