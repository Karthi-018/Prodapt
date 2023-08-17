package college;

import java.util.Date;

public class college {
	private String name;
    private String website;
    private  String mobile;
    private String founder;
    private Integer numberOfDept;
    private String location;
    private Date startingDate;

    public college()    //default constructor
    
    {

    }
    college(String name,String website,String mobile,String founder,Integer numberOfDept,String location,Date startingDate)     //parametrized constructor
    {
        this.name=name;
        this.website=website;
        this.mobile=mobile;
        this.founder=founder;
        this.numberOfDept=numberOfDept;
        this.location=location;
        this.startingDate=startingDate;
        
    }


    public static String getName() {
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
    
    public Date startingDate() {
        return startingDate;
    }

    public void setstartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }
    
    
    
    public String toString()
    {
        return "college [name = " + name + ", website = " + website + ", mobile = " + mobile + ", founder = " + founder +", numberOfDept = " + numberOfDept +",location = "+ location +",startingDate = "+startingDate+"  ]";
    }



	


	
	
}
