package org.example;

public class HotelNotFoundException extends Exception{
    HotelNotFoundException(String hotelname)
    {
        System.out.println(hotelname+" not in the list");
    }
}
