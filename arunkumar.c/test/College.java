package test;

import java.util.Date;

public class College {
    private String name;
    private String website;
    private  String mobile;
    private String founder;
    private Integer noOfDept;
    private String location;
    private Date startingDate;
    public College(){

    }
    public College(String name, String website, String mobile, String founder, Integer noOfDept, String location, Date startingDate) {
        this.name = name;
        this.website = website;
        this.mobile = mobile;
        this.founder = founder;
        this.noOfDept = noOfDept;
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

    public Integer getNoOfDept() {
        return noOfDept;
    }

    public void setNoOfDept(Integer noOfDept) {
        this.noOfDept = noOfDept;
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

    @Override
    public String toString() {
        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",name,website,mobile,founder,noOfDept,location,startingDate);
        return "";
    }

}
