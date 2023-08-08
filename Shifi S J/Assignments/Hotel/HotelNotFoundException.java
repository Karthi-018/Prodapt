class HotelNotFoundException extends Exception
{
    HotelNotFoundException(String hotel)
{
    System.out.println(hotel + " not found");
}

}