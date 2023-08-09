package hotelmanagement;
import java.util.*;

public class HotelMain
{
static ArrayList<HotelPojo> hotelList=new ArrayList<>();
static Scanner sc=new Scanner(System.in);

     static void createData()
    {
      hotelList.add(new HotelPojo(101,"ABC","Luxury resort with lush landscape",new String[]{"Spa","Pool","Fitness"},3));
      hotelList.add(new HotelPojo(102,"XYZ","Coastal Tranquility with ocean views ",new String[]{"Private beach","Water Sports","Seafood Dining"},5));
      hotelList.add(new HotelPojo(103,"MCD","Rustic charm in the mountains",new String[]{"Hiking","Campfires"},4.8));
      hotelList.add(new HotelPojo(104,"BSR","First Class City Center Suites",new String[]{"Indoor Games","Business Center","Fitness"},4.5));
      hotelList.add(new HotelPojo(105,"NSV","Magical forest escape",new String[]{"Wildlife","Outdoor yoga","Treehouse Stays"},3.8));
      hotelList.add(new HotelPojo(106,"SBN","Tranquil escape surrounded by nature",new String[]{"Spa","Nature Trails","Organic Dining"},3.5));
      hotelList.add(new HotelPojo(107,"RMB","Elevated luxury with panoramic view",new String[]{"Spa","Sky lounge","Events Venue"},4.9));
      hotelList.add(new HotelPojo(108,"MRB","Secluded paradise by the sea",new String[]{"Spa","Water Rides","Beach"},4.1));
      hotelList.add(new HotelPojo(109,"EPS","Regal elegance in heart of city",new String[]{"Royal Suite","Fine Dining","Pool"},3.7));
      hotelList.add(new HotelPojo(110,"SBE","Mountain lodge with alpine charm",new String[]{"Fireside Lounge","Gourmet Cuisine","Ski Access"},2.7));

    }
    static void searchDetail(String hotelName)
    {
        int flag=0;
        for(HotelPojo object:hotelList)
        {
            if(object.getHotelName().equalsIgnoreCase(hotelName))
            {
                System.out.println("DETAILS FOUND");
                System.out.format("%-15s %-15s %-38s %-47s %-20s\n","Hotel ID","Hotel Name","Hotel Description","Hotel Facilities","Hotel Rating");
                System.out.format("%-15s %-15s %-38s %-47s %-20s\n",object.getHotelId(),object.getHotelName(),object.getHotelDescription(), Arrays.toString(object.getHotelFacilities()),object.getHotelRating());
                flag=1;
                break;
            }
        }
        if(flag==0)
            try
            {
                throw new HotelNotFoundException(hotelName);
            }
            catch (HotelNotFoundException e)
            {
                System.out.println(e);
            }

    }

    public static void main(String[] args)
    {
       createData();
       System.out.println("\nWELCOME TO HOTEL MANAGEMENT SYSTEM");
       System.out.println("Enter Your Choice\n1->Sort the Hotel System based on Hotel Name\n2->Sort the Hotel System based on Hotel Rating\n3->Display the Hotel Details");
       int choice=sc.nextInt();
       switch (choice)
       {
           case 1:
               System.out.println("\nThe sort details based on Hotel Name are :-\n");
               Collections.sort(hotelList,(object1,object2)->(object1.getHotelName().compareTo(object2.getHotelName())));
               System.out.format("%-15s %-15s %-38s %-47s %-20s\n","Hotel ID","Hotel Name","Hotel Description","Hotel Facilities","Hotel Rating");
               for(HotelPojo object:hotelList)
               {
                   System.out.format("%-15s %-15s %-38s %-47s %-20s\n",object.getHotelId(),object.getHotelName(),object.getHotelDescription(),Arrays.toString(object.getHotelFacilities()),object.getHotelRating());
               }
               break;

           case 2:
               System.out.println("\nThe sort details based on Hotel Rating are :-\n");
               Collections.sort(hotelList,(object1,object2)->(object1.getHotelRating()>object2.getHotelRating()?1:-1));
               System.out.format("%-15s %-15s %-38s %-47s %-20s\n","Hotel ID","Hotel Name","Hotel Description","Hotel Facilities","Hotel Rating");
               for(HotelPojo object:hotelList)
               {
                   System.out.format("%-15s %-15s %-38s %-47s %-20s\n",object.getHotelId(),object.getHotelName(),object.getHotelDescription(),Arrays.toString(object.getHotelFacilities()),object.getHotelRating());
               }
               break;

           case 3:
               System.out.println("Enter the Hotel Name to display:");
               String hotelName=sc.next();
               searchDetail(hotelName);
               break;

           default:
               System.out.println("Wrong Choice");

       }
    }
}
