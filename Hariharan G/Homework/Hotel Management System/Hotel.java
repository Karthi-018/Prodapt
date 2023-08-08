package org.example;

public class Hotel
{
    private int hotelId;
    private String  hotelName;
    private String hotelDesc;
    private String hotelFacility;

    public Hotel() {
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", hotelDesc='" + hotelDesc + '\'' +
                ", hotelFacility='" + hotelFacility + '\'' +
                ", rating=" + rating +
                '}';
    }

    public Hotel(int hotelId, String hotelName, String hotelDesc, String hotelFacility, double rating) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelDesc = hotelDesc;
        this.hotelFacility = hotelFacility;
        this.rating = rating;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelDesc() {
        return hotelDesc;
    }

    public void setHotelDesc(String hotelDesc) {
        this.hotelDesc = hotelDesc;
    }

    public String getHotelFacility() {
        return hotelFacility;
    }

    public void setHotelFacility(String hotelFacility) {
        this.hotelFacility = hotelFacility;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    private double rating;

}
