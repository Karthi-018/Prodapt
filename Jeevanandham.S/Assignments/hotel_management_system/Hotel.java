package org.example.hotel_management_system;

public class Hotel {
    private int hId;
    private String hName;
    private String hDes;
    private String hFacilities;
    private double rating;

    public Hotel(int hId, String hName, String hDes, String hFacilities, Double rating) {
        this.hId = hId;
        this.hName = hName;
        this.hDes = hDes;
        this.hFacilities = hFacilities;
        this.rating = rating;
    }

    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String gethDes() {
        return hDes;
    }

    public void sethDes(String hDes) {
        this.hDes = hDes;
    }

    public String gethFacilities() {
        return hFacilities;
    }

    public void sethFacilities(String hFacilities) {
        this.hFacilities = hFacilities;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hId=" + hId +
                ", hName='" + hName + '\'' +
                ", hDes='" + hDes + '\'' +
                ", hFacilities='" + hFacilities + '\'' +
                ", rating=" + rating +
                '}';
    }
}
