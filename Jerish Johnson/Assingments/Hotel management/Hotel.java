package org.example;

public class Hotel {
    private int hid;
    private String hname;
    private String des;
    private String facilities;
    private double rating;

    public Hotel(int hid, String hname, String des, String facilities, double rating) {
        this.hid = hid;
        this.hname = hname;
        this.des = des;
        this.facilities = facilities;
        this.rating = rating;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString (){
        return hid+" "+hname+" "+des+" "+facilities+" "+rating;
    }
}
