package hotelmanagement;

public class HotelNotFoundException extends Exception
{
    String hotelName;
    public HotelNotFoundException(String s)
    {
       this.hotelName=s;
    }
    public String toString()
    {
        return "The hotel "+hotelName+" not found in the data";
    }
}
