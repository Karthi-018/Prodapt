public class Hotel
{
    private int Hotel_ID;
    private String Hotel_Name;
    private String Hotel_Description;
    private String Hotel_Facilities;
    private Double Hotel_Rating;

    public Hotel(int hotel_ID, String hotel_Name, String hotel_Description, String hotel_Facilities, Double hotel_Rating) {
        Hotel_ID = hotel_ID;
        Hotel_Name = hotel_Name;
        Hotel_Description = hotel_Description;
        Hotel_Facilities = hotel_Facilities;
        Hotel_Rating = hotel_Rating;
    }

    public int getHotel_ID() {
        return Hotel_ID;
    }

    public void setHotel_ID(int hotel_ID) {
        Hotel_ID = hotel_ID;
    }

    public String getHotel_Name() {
        return Hotel_Name;
    }

    public void setHotel_Name(String hotel_Name) {
        Hotel_Name = hotel_Name;
    }

    public String getHotel_Description() {
        return Hotel_Description;
    }

    public void setHotel_Description(String hotel_Description) {
        Hotel_Description = hotel_Description;
    }

    public String getHotel_Facilities() {
        return Hotel_Facilities;
    }

    public void setHotel_Facilities(String hotel_Facilities) {
        Hotel_Facilities = hotel_Facilities;
    }

    public Double getHotel_Rating() {
        return Hotel_Rating;
    }

    public void setHotel_Rating(Double hotel_Rating) {
        Hotel_Rating = hotel_Rating;
    }

    @Override
    public String toString() {
        return "\nHotel ID : " + Hotel_ID + "\tHotel Name : " + Hotel_Name + "\tHotel Description : " + Hotel_Description
                + "\tHotel Facilities : " + Hotel_Facilities + "\tHotel Rating : " + Hotel_Rating;
    }
}