package feature;

import java.util.Date;

public class College {
	String name;
	String website;
	String mobile;
	String founder;
	int numberOfDept;
	String location;
	Date startingDate;
	
	College(){
		
	}
	College(String name,String website,String mobile, String founder, int numberOfDept, String location, Date startingDate){
		this.name=name;
		this.website=website;
		this.mobile=mobile;
		this.founder=founder;
		this.numberOfDept=numberOfDept;
		this.location=location;
		this.startingDate=startingDate;
	}
	
	
	@Override
	public String toString() {
		return String.format("%.15s %.20s %.15s %.15s %d %s %s",name,website,mobile,founder,numberOfDept,location,startingDate.toString() );
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
		this.startingDate = startingDate;
	}
	
	

}
