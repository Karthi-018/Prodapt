public class HotelNotFoundException extends Exception
{
    HotelNotFoundException(String name)
    {
        System.out.println(name + " is not found");
    }

}

