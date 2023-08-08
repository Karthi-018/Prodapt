package org.example.hotel;

public class Hotel
{
    private int hotel_id;
    private String hotel_name;
    private String hotel_desp;
    private String hotel_faci;
    private double hotel_rating;

    public Hotel(int hotel_id, String hotel_name, String hotel_desp, String hotel_faci, double hotel_rating) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_desp = hotel_desp;
        this.hotel_faci = hotel_faci;
        this.hotel_rating = hotel_rating;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_desp() {
        return hotel_desp;
    }

    public void setHotel_desp(String hotel_desp) {
        this.hotel_desp = hotel_desp;
    }

    public String getHotel_faci() {
        return hotel_faci;
    }

    public void setHotel_faci(String hotel_faci) {
        this.hotel_faci = hotel_faci;
    }

    public double getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_rating(double hotel_rating) {
        this.hotel_rating = hotel_rating;
    }

    @Override
    public String toString() {
        return hotel_id +" " + hotel_name +" " + hotel_desp +" " + hotel_faci + " " + hotel_rating ;
    }
}
