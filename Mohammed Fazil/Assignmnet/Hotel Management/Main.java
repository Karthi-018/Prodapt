package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;
class MainClass
{
    public static void main(String[] args)
    {
        // Create a list of 10 hotels
        Scanner sc = new Scanner(System.in);
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(1, "The Ritz-Carlton", "five-star rating", "Spa, pool, restaurant", 5));
        hotels.add(new Hotel(2, "The Westin", "four-star rating", "Gym, pool, bar", 4));
        hotels.add(new Hotel(3, "The Holiday Inn", "three-star rating", "Free breakfast, fitness center", 3));
        hotels.add(new Hotel(4, "The Motel 6", "two-star rating", "Free Wi-Fi, continental breakfast", 2));
        hotels.add(new Hotel(5, "The Super 8", "one-star rating", "Free parking, basic amenities", 1));
        // Sort the hotels by name

        Collections.sort(hotels, new Comparator<Hotel>()
        {
            @Override
            public int compare(Hotel hotel1, Hotel hotel2)
            {
                return hotel1.getName().compareTo(hotel2.getName());
            }
        });
        // Sort the hotels by rating
        Collections.sort(hotels, new Comparator<Hotel>()
        {
            @Override
            public int compare(Hotel hotel1, Hotel hotel2)
            {
                if(hotel1.getRating()>hotel2.getRating()) return 1;
                else return -1;
            }
        });
        // Search for a hotel by name
        System.out.println("Enter the name of the hotel you are looking for:");
        String hotelName = sc.nextLine();
        Hotel hotel = findHotelByName(hotels, hotelName);
        System.out.println(hotels);
        if (hotel != null) {
            System.out.println("Hotel found:");
            System.out.println(hotel);
        } else {
            System.out.println("Hotel not found.");
        }
    }


    private static Hotel findHotelByName(List<Hotel> hotels, String hotelName) {

        for (Hotel hotel : hotels) {
            if (hotel.getName().equals(hotelName)) {
                return hotel;
            }
        }
        return null;
    }
}