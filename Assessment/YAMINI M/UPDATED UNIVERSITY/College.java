package CollegeUniversity;

import java.util.*;
import java.text.*;
import java.util.Date;

public class College{
    private String name;
    private String website;
    private String mobile;
    private String founder;
    private int numberOfDept;
    private String location;
    private Date  startingDate;

    public College()
    {
    }
    public College(String name, String website, String mobile, String founder, int numberOfDept, String location, Date startingDate) {
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

    public Date getStartingDate() {
        return startingDate;
    }

   /* public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }
    static College add(String line)throws Exception
    {
    	String s[]=line.split(",");
    	College o=new College();
    	o.setName(s[0]);
    	o.setWebsite(s[1]);
    	o.setMobile(s[2]);
    	o.setFounder(s[3]);
    	o.setNumberOfDept(Integer.parseInt(s[4]));
    	o.setLocation(s[5]);
    	DateFormat df=new SimpleDateFormat("DD-MM-YY");
		Date d=df.parse(s[6]);
		o.setStartingDate(d);
		return College(o.getName(),o.getWebsite(),o.getMobile(),o.getFounder(),o.getNumberOfDept(),o.getLocation(),o.getStartingDate());	
    }*/
  
	public String toString() {
        return "College{" + "name='" + name + '\'' + ", website='" + website + '\'' + ", mobile='" + mobile + '\'' + ", founder='" + founder + '\'' + ", numberOfDept=" + numberOfDept +  ", location='" + location + '\'' + ", startingDate=" + startingDate + '}';
    }
}

