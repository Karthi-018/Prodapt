import java.util.*;

public class HMS {
    public static void main(String[] args) {
        List<Hotel> l = new ArrayList<>();
        l.add(new Hotel(101,"HOTELA","LUXURY","GYM,SWIMMING POOL",4));
        l.add(new Hotel(102,"HOTELD","BUDGET","FOOD,WIFI,WASHING MACHINE",3));
        l.add(new Hotel(103,"HOTELC","RESORT NEAR BEACH","SPORTS,GAMES",5));
        l.add(new Hotel(104,"HOTELB","NORMAL BUDGET","GYM,SWIMMING POOL",4));
        l.add(new Hotel(105,"HOTELF","MIN BUDGET","FOOD,WIFI,WASHING MACHINE",3));
        l.add(new Hotel(106,"HOTELE","RESORT","SPORTS,GAMES",2));
        l.add(new Hotel(107,"HOTELI","COSTLY","GYM,SWIMMING POOL",3));
        l.add(new Hotel(108,"HOTELJ","HIGH","FOOD,WIFI,WASHING MACHINE",3));
        l.add(new Hotel(109,"HOTELK","NEAR BEACH","SPORTS,GAMES",4));
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("CHOICES");
            System.out.println("1.SORT BY HOTEL NAME");
            System.out.println("2.SORT HOTEL BY RATING in Descending order");
            System.out.println("3.SEARCH HOTEL BY NAME");
            System.out.println("4.EXIT");
            System.out.println("ENTER CHOICE");
            choice=s.nextInt();
            switch (choice)
            {
                case 1:
                    Collections.sort(l, Comparator.comparing(Hotel::getHotelName));
                    l.forEach(System.out::println);
                    break;
                case 2:
                    Collections.sort(l,Comparator.comparingInt(Hotel::getRating).reversed());
                    l.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Enter hotel name to search");
                    String searchName=s.next();
                    try
                    {
                        Hotel foundHotel=searchHotelByName(l,searchName);
                        System.out.println("HOTEL FOUND");
                        System.out.println(foundHotel);
                    }
                    catch(HotelNotFoundException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid");
        }
    }while(choice!=4);
        s.close();

    }
    private static Hotel searchHotelByName(List<Hotel> l,String name) throws HotelNotFoundException
    {
        for(Hotel hotel:l)
        {
            if(hotel.getHotelName().equalsIgnoreCase(name))
            {
                return hotel;
            }
        }
        throw new HotelNotFoundException("Hotel with name"+ name + "Not FoUND");
    }

}

