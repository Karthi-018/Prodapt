import java.util.*;
class HotelNotFoundException extends Exception
{
	HotelNotFoundException(String s)
	{
	System.out.println("Hotel not found");
	}
}