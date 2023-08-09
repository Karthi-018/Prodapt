class Hotel {
    public int hotelID;
    public String hotelName;
    public String hotelDescription;
    public String hotelFacilities;
    public double rating;

    public Hotel(int hotelID, String hotelName, String hotelDescription, String hotelFacilities, double rating) {
        this.hotelID = hotelID;
        this.hotelName = hotelName;
        this.hotelDescription = hotelDescription;
        this.hotelFacilities = hotelFacilities;
        this.rating = rating;
    }

    public int getHotelID() {
        return hotelID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public String getHotelFacilities() {
        return hotelFacilities;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Hotel ID: " + hotelID + "\n"
             + "Hotel Name: " + hotelName + "\n"
             + "Description: " + hotelDescription + "\n"
             + "Facilities: " + hotelFacilities + "\n"
             + "Rating: " + rating + "\n";
    }
}
