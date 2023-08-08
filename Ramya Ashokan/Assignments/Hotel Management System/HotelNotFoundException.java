package org.example.hotel;
import org.example.hotel.*;
public class HotelNotFoundException extends Exception{
    HotelNotFoundException(String message)
    {
        super(message+" not in the list");
    }
}
