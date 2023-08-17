package University;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class College {
    private String name;
    private String website;
    private String mobile;
    private String founder;
    private int numberofDept;
    private String location;
    private Date startingDate;

    public College(String name, String website, String mobile, String founder, int numberofDept, String location, Date startingDate) {
        this.name = name;
        this.website = website;
        this.mobile = mobile;
        this.founder = founder;
        this.numberofDept = numberofDept;
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

    public int getNumberofDept() {
        return numberofDept;
    }

    public void setNumberofDept(int numberofDept) {
        this.numberofDept = numberofDept;
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
        return "College{" +
                "name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", mobile='" + mobile + '\'' +
                ", founder='" + founder + '\'' +
                ", numberofDept=" + numberofDept +
                ", location='" + location + '\'' +
                ", startingDate=" + startingDate +
                '}';
    }

    public static College createCollege(String line) throws Exception
    {
        String[] s=line.split(",");
        String name=s[0];
        String website=s[1];
        String mobile=s[2];
        String founder=s[3];
        int numberofDept=Integer.parseInt(s[4]);
        String location=s[5];
        DateFormat df=new SimpleDateFormat("DD:MM:YY");
        Date startingDate=df.parse(s[6]);
        return new College(name,website,mobile,founder,numberofDept,location,startingDate);
    }



}
