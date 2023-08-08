package org.example.hotel;

public class Hotel {
    int hId;
    String hName;
    String hDesc;
    String hFac;
    double rating;

    public Hotel(int hId, String hName, String hDesc, String hFac, double rating) {
        this.hId = hId;
        this.hName = hName;
        this.hDesc = hDesc;
        this.hFac = hFac;
        this.rating = rating;
    }

    public int getHId() {
        return hId;
    }

    public void setHId(int hId) {
        this.hId = hId;
    }

    public String getHName() {
        return hName;
    }

    public void setHName(String hName) {
        this.hName = hName;
    }

    public String getHDesc() {
        return hDesc;
    }

    public void setHDesc(String hDesc) {
        this.hDesc = hDesc;
    }

    public String getHFac() {
        return hFac;
    }

    public void setHFac(String hFac) {
        this.hFac = hFac;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel:" +
                " Id=" + hId +
                " Name=" + hName  +
                " Description=" + hDesc +
                " Facilities=" + hFac +
                " Rating=" + rating+"\n" ;
    }
}
