public class Hotel {
    private int HotelId;
    private String HotelName;
    private  String HotelDescription;
    private String HotelFacilities;
    private int rating;

    public Hotel(int hotelId, String hotelName, String hotelDescription, String hotelFacilities, int rating) {
        HotelId = hotelId;
        HotelName = hotelName;
        HotelDescription = hotelDescription;
        HotelFacilities = hotelFacilities;
        this.rating = rating;
    }

    public int getHotelId() {
        return HotelId;
    }

    public void setHotelId(int hotelId) {
        HotelId = hotelId;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getHotelDescription() {
        return HotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        HotelDescription = hotelDescription;
    }

    public String getHotelFacilities() {
        return HotelFacilities;
    }

    public void setHotelFacilities(String hotelFacilities) {
        HotelFacilities = hotelFacilities;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "HotelId=" + HotelId +
                ", HotelName='" + HotelName + '\'' +
                ", HotelDescription='" + HotelDescription + '\'' +
                ", HotelFacilities='" + HotelFacilities + '\'' +
                ", rating=" + rating +
                '}';
    }
}
