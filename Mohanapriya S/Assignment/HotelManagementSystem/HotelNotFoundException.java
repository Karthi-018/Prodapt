package org.example;

public class HotelNotFoundException extends Exception 
{
    HotelNotFoundException(String name)
    {
        System.out.println("Hotel Not Found");
    }
}