package org.example;
import java.util.Date;

public class College {
    private String name;
    private String website;
    private String mobile;
    private String founder;
    private String numberOfDept;
    private String location;
    private java.util.Date StringDate;

    public College() {
    }

    public College(String name, String website, String mobile, String founder, String numberOfDept, String location, Date stringDate) {
        this.name = name;
        this.website = website;
        this.mobile = mobile;
        this.founder = founder;
        this.numberOfDept = numberOfDept;
        this.location = location;
        StringDate = stringDate;
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

    public String getNumberOfDept() {
        return numberOfDept;
    }

    public void setNumberOfDept(String numberOfDept) {
        this.numberOfDept = numberOfDept;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStringDate() {
        return StringDate;
    }

    public void setStringDate(Date stringDate) {
        StringDate = stringDate;
    }
}
