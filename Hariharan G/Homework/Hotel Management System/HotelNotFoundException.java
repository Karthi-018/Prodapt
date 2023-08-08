package org.example;

public class HotelNotFoundException extends Exception {
    HotelNotFoundException()
    {
        System.out.println("Hotel not found in database!");
    }

}
