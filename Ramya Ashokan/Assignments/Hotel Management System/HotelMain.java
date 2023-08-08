package org.example.hotel;
import org.example.hotel.HotelNotFoundException;
import java.util.*;
public class HotelMain {

    public static void main(String args[])throws Exception {

        Scanner sc = new Scanner(System.in);
        List<Hotel> list = new ArrayList<>();
        Hotel h1 = new Hotel(1, "ITC_Chola", "It's a great choice for a comfortable and enjoyable stay", "spa,freeDinning and fitness facilities,", 4.5);
        Hotel h2 = new Hotel(2, "The_Leela_palace", "It ensure lavish and memorable stay", "Luxurious Accomadation,fine Dining Experience", 4.2);
        Hotel h3 = new Hotel(3, "The_park_chennai", "Comfortable stay", "Stylish Accomodation ,modern amentiesand divese Dinning ", 4.3);
        Hotel h4 = new Hotel(4, "Zone", "Plesant stay", "Comfortable Rooms", 4.1);
        Hotel h5 = new Hotel(5, "Taj_Coramental", "It's a popular choice for travelers seeking a high-end stay with a touch of luxury.", "luxurious rooms, exceptional dining experiences, and attentive service", 4.6);
        Hotel h6 = new Hotel(6, "Hotel_Green_park", "Comfortable and convenient stay experience", "offers a pleasant stay with facilities such as dining, fitness, and comfortable rooms.", 4.7);
        Hotel h7 = new Hotel(7, "Crownie_Plazza", "", "", 4.6);
        Hotel h8 = new Hotel(8, "Hilton", "Luxury Accommodation", "Upscale hotel chain offering comfortable rooms, dining, business facilities, and fitness centers for travelers.", 4.0);
        Hotel h9 = new Hotel(9, "Park_Hyatt", "It's a top choice for a sophisticated stay experience.", "offering elegant accommodations, dining options, and facilities", 4.3);
        Hotel h10 = new Hotel(10, "Le_Royal_Meridian", "It's a prime destination for a luxurious and memorable stay.", "lavish accommodations, upscale dining choices, and top-notch amenities", 4.8);
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
        list.add(h6);
        list.add(h7);
        list.add(h8);
        list.add(h9);
        list.add(h10);


        int choice;
       do {
           System.out.println("1.Sort by HotelName\n2.Sort by Hotel Rating\n3.Search by Hotel Name\n4.Exit\nEnter your choice");
           choice = sc.nextInt();

           switch (choice) {
               case 1:
                   Collections.sort(list, (t1, t2) -> (t1.getHName().compareTo(t2.getHName())));
                   System.out.println(list);
                   break;
               case 2:
                   Collections.sort(list, (t1, t2) -> (t1.getRating() < t2.getRating()) ? -1 : (t1.getRating() > t2.getRating()) ? 1 : 0);
                   System.out.println(list);
                   break;
               case 3:
                   boolean b = false;
                   System.out.println("Enter the hotel name to search");
                   String search = sc.next();
                   //sc.nextLine();
                   System.out.println(search);

                   try {

                       for (Hotel l : list) {
                           if (l.getHName().equals(search)) {
                               System.out.print(l);
                               b = true;
                               break;
                           }
                       }
                       if (b == false) {
                           throw new HotelNotFoundException(search);
                       }
                   } catch (HotelNotFoundException e) {
                       System.out.println(e.getMessage());
                       e.printStackTrace();

                   }
                   break;
               case 4:
                   System.exit(0);
           }

       }while (choice < 5) ;
    }


}
