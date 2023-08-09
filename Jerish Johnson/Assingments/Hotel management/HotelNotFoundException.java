package org.example;

public class HotelNotFoundException extends Throwable {
    HotelNotFoundException(String name){
        System.out.println("Hotel not found");
    }
}
