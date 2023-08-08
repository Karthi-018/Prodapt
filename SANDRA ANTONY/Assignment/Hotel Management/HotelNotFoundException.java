public class HotelNotFoundException extends Throwable 
{
    HotelNotFoundException(String hName)
    {
        System.out.println("Hotel "+hName+" not found");
    }
}
