package org.example.practice;

public class HotelMngt {
    int hotelid;
    String hotelname;
    String hotelDescription;
    String hotelFacilities;
    double rating;

    public HotelMngt(int hotelid, String hotelname, String hotelDescription, String hotelFacilities, double rating) {
        this.hotelid = hotelid;
        this.hotelname = hotelname;
        this.hotelDescription = hotelDescription;
        this.hotelFacilities = hotelFacilities;
        this.rating = rating;
    }

    public int getHotelid() {
        return hotelid;
    }

    public void setHotelid(int hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public String getHotelFacilities() {
        return hotelFacilities;
    }

    public void setHotelFacilities(String hotelFacilities) {
        this.hotelFacilities = hotelFacilities;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "hotel_mngt{" +
                "hotelid=" + hotelid +
                ", hotelname='" + hotelname + '\'' +
                ", hotelDescription='" + hotelDescription + '\'' +
                ", hotelFacilities='" + hotelFacilities + '\'' +
                ", rating=" + rating +
                '}';
    }
}
