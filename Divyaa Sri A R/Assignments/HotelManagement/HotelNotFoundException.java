package org.example.practice;

public class HotelNotFoundException extends Exception {
    HotelNotFoundException(String searchName){
        System.out.println(searchName+"is not in the list");
    }
}
