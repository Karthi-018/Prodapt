package org.example.hotel;
import org.example.hotel.HotelNotFoundException;
import java.util.*;

public class HotelMain {
    public static void main(String args[]) throws Exception {

        ArrayList<org.example.hotel.Hotel> HotelDetails = new ArrayList<>();

        HotelDetails.add(new org.example.hotel.Hotel(101, "ITC", "Travelers seeking a high-end stay", "Non Ac", 3.9));
        HotelDetails.add(new Hotel(102, "Hablis", "Comfortable Rooms", "Food", 5.0));
        HotelDetails.add(new Hotel(103, "Leela Palace", "Comfortable and convenient stay experience", "Water", 4.8));
        HotelDetails.add(new Hotel(104, "Taj Coramental", "It's a top choice for a sophisticated stay experience", "swimming", 3.7));
        HotelDetails.add(new Hotel(105, "Green park", "Destination for luxurious and memorable stay", "tennis court", 4.2));
        HotelDetails.add(new Hotel(106, "Hyatt", "Comfortable stay", "conference rooms", 4.5));
        HotelDetails.add(new Hotel(107, "Holiday Inn", "comfortable and enjoyable stay", "TV", 4.1));
        HotelDetails.add(new Hotel(108, "Fairfield Marriot", "Pleasant stay", "Fan", 3.8));
        HotelDetails.add(new Hotel(109, "Hilton", "lavish and memorable stay", "Gym", 4.3));

        Scanner sc = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("1 -> Sort the Hotel data based on Hotel Name");
        System.out.println("2 -> Sort the Hotel data based on Hotel Rating");
        System.out.println("3 -> Search the Hotel by Hotel Name");
        System.out.println("Enter your choice");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Collections.sort(HotelDetails, (t1, t2) -> (t1.getHotName().compareTo(t2.getHotName())));
                System.out.println(HotelDetails);
                break;
            case 2:
                Collections.sort(HotelDetails, (t1, t2) -> (t1.getHotRating() < t2.getHotRating()) ? -1 : (t1.getHotRating() > t2.getHotRating()) ? 1 : 0);
                System.out.println(HotelDetails);
                break;
            case 3:
                boolean b = false;
                System.out.println("Enter the Hotel name to search:");
                String hotelname = sc.next();
                System.out.println(hotelname);

                try {

                    for (Hotel h : HotelDetails) {
                        if (h.getHotName().equals(hotelname)) {
                            System.out.print(h);
                            b = true;
                            break;
                        }
                    }
                    if (b == false) {
                        throw new HotelNotFoundException(hotelname);
                    }
                } catch (HotelNotFoundException e) {
                    System.out.println(e);
                    /*System.out.println(e.getHotMessage());
                    e.printStackTrace();*/
                }
        }
    }

}


