
package university_req;

import java.util.Date;
import java.io.*;
import java.text.*;
public class College {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private int numberOfDept; 
	private String location;
	private Date startingDate;
	public College(String name, String website, String mobile, String founder, int numberOfDept, String location,Date startingDate) {
        this.name = name;
        this.website = website;
        this.mobile = mobile;
        this.founder = founder;
        this.numberOfDept = numberOfDept;
        this.location = location;
        this.startingDate=startingDate;
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
    
    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
    	this.startingDate=startingDate;
    }

    College values(String s)throws Exception {
		String arr[]=s.split(",");
		String name=arr[0];
		String website=arr[1];
		String mobile=arr[2];
		String founder=arr[3];
		int numberOfDept=Integer.parseInt(arr[4]);
		String location=arr[5];
		
		DateFormat df=new SimpleDateFormat("mm:ss");
		Date startingDate=df.parse(arr[6]);
		return new College(name,website,mobile,founder,numberOfDept,location,startingDate);
	}
}
