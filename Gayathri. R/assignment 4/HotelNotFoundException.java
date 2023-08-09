class HotelNotFoundException extends Exception
{
HotelNotFoundException(String s)
{
System.out.println(s+"hotel not found in the list");
}
}