package org.example.hotel;

public class HotelNotFoundException extends Exception {
    public HotelNotFoundException(String name)
    {
        System.out.println(name +" not found");
    }
}
