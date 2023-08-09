package org.example.hotel_management_system;

public class HotelNotFoundException extends Exception{
    HotelNotFoundException(String name){
        System.out.println(name+" not found");
    }
}
