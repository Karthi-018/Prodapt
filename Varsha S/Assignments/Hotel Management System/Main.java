import java.util.*;
import java.util.Scanner;

class Main
{

    public static void main(String args[])
    {

        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(new Hotel(123, "Holiday Inn", "Good", "AC", 9.2));
        hotelList.add(new Hotel(456, "Lemon Tree", "Best", "Non AC", 6.8));
        hotelList.add(new Hotel(678, "Ibis", "Good", "Cafeteria", 8.9));
        hotelList.add(new Hotel(987, "Hablis", "Neat", "Pool", 4.6));
        hotelList.add(new Hotel(964, "ITC Grand Chola", "Neat", "Indoor Games",4.9));
        hotelList.add(new Hotel(643, "Novotel", "Best", "Campfire", 6.2));
        hotelList.add(new Hotel(432, "Taj", "Good", "Outdoor Games", 9.8));
        hotelList.add(new Hotel(908, "Accord", "Better", "Adventure Activities", 3.5));
        hotelList.add(new Hotel(541, "Leela Palace", "Neat", "Spa", 5.1));
        hotelList.add(new Hotel(209, "Radisson", "Better", "Trekking", 7.3));

        System.out.println("-----HOTEL MANAGEMENT SYSTEM-----");
        System.out.println("Helloo!! Welcome!!");
        System.out.println("Enter choice");
        System.out.println("1. Sort based on Hotel Name");
        System.out.println("2. Sort based on Hotel Rating");
        System.out.println("3. Search Hotel");

        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();

        switch (select)
        {

            case 1: //to sort based on the hotel name

            {
                hotelList.sort((t1, t2) -> (t1.getHotel_Name().compareTo(t2.getHotel_Name())));
                hotelList.forEach(System.out::println);
                break;
            }

            case 2: //to sort based on the hotel rating

            {
                hotelList.sort((h1, h2) -> {
                            if (h1.getHotel_Rating() > h2.getHotel_Rating()) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                );
                hotelList.forEach(System.out::println);
                break;
            }

            case 3: //to search hotel
            {
                System.out.println("Enter hotel: ");
                int flag = 0;
                String search_hotel = sc.next();

                for (Hotel s1 : hotelList)
                {
                    if (search_hotel.equals(s1.getHotel_Name()))
                    {
                        System.out.println(s1);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                {
                    try
                    {
                        throw new HotelNotFoundException(search_hotel);
                    }
                    catch (HotelNotFoundException e)
                    {
                        System.out.println(e);
                    }
                }
                break;
            }
        }
        System.out.println("Tataa!! Take Care!!");

    }
}