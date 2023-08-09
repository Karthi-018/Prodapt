package hotelmanagement;

import java.util.Arrays;

public class HotelPojo
{
    private int hotelId;
    private String hotelName;
    private String hotelDescription;
    private String[] hotelFacilities;
    private double hotelRating;

    public HotelPojo(int hotelId, String hotelName, String hotelDescription, String[] hotelFacilities, double hotelRating)
    {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelDescription = hotelDescription;
        this.hotelFacilities = hotelFacilities;
        this.hotelRating = hotelRating;
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

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public String[] getHotelFacilities() {
        return hotelFacilities;
    }

    public void setHotelFacilities(String[] hotelFacilities) {
        this.hotelFacilities = hotelFacilities;
    }

    public double getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(double hotelRating) {
        this.hotelRating = hotelRating;
    }

    @Override
    public String toString() {
        return "HotelPojo{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", hotelDescription='" + hotelDescription + '\'' +
                ", hotelFacilities=" + Arrays.toString(hotelFacilities) +
                ", hotelRating=" + hotelRating +
                '}';
    }
}
