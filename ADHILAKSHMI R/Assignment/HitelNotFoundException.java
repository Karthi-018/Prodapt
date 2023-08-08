package org.example;

public class HitelNotFoundException extends Exception{

    public HitelNotFoundException(String hotelName)
    {
        System.out.println(hotelName+" not found in the List");
    }
}
