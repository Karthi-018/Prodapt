
//exception

class HotelNotFoundException extends Exception
{
HotelNotFoundException(String s)
{
System.out.println(s+"hotel is not found in the list");
}
}
