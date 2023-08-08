package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HotelMain
{
    static Scanner sc=new Scanner(System.in);
    List<Hotel> l=new ArrayList<>();
    public void createDetails()
    {
        l.add(new Hotel(101,"Hotel1","studio rooms","wifi a la carte",5));
        l.add(new Hotel(102,"Hotel2","1BHK","swimming pool view",4));
        l.add(new Hotel(103,"Hotel3","2BHK","lake view",4.7));
        l.add(new Hotel(104,"Hotel4","3BHK","river view",5));
        l.add(new Hotel(105,"Hotel5","Boat House","river view",4.8));
        l.add(new Hotel(106,"AAA","Mountain view ","wifi ups backup",4.5));
        l.add(new Hotel(107,"Bbbb","Tree house","hot water home food",4.3));
        l.add(new Hotel(108,"Cccc","Tent stay","Heaters provided",3));
        l.add(new Hotel(109,"Dddd","Jungle themed","insect free stays",5));
        l.add(new Hotel(110,"Eeee","hanging rooms","wifi premium stays",5));

    }

    public void performOperations(int choice) throws Exception {
        switch(choice)
        {
            case 1:
                System.out.println("Sorting hotel data based upon hotel name");
                Collections.sort(l,(obj1,obj2)->obj1.getHotelName().compareTo(obj2.getHotelName()));
                System.out.format("%-15s %-15s %-25s %-25s %-15s\n","Hotel ID","Hotel Name","HotelFacilities","HotelDescription","Hotel Rating");

                for (Hotel i:l
                     ) {
                    System.out.format("%-15s %-15s %-25s %-25s %-15s\n",i.getHotelId(),i.getHotelName(),i.getHotelFacility(),i.getHotelDesc(),i.getRating());
                }
                break;
            case 2:
                System.out.println("Sorting hotel data based upon rating");
                Collections.sort(l,(obj1,obj2)-> obj1.getRating()>obj2.getRating()?1:-1);
                System.out.format("%-15s %-15s %-25s %-25s %-15s\n","Hotel ID","Hotel Name","HotelFacilities","HotelDescription","Hotel Rating");
                for (Hotel i:l
                ) {
                    System.out.format("%-15s %-15s %-25s %-25s %-15s\n",i.getHotelId(),i.getHotelName(),i.getHotelFacility(),i.getHotelDesc(),i.getRating());

                }
                break;

            case 3:
                System.out.println("Search by hotel name");
                System.out.println("Enter hotel name: ");
                String search=sc.next();
                try {
                    searchHotel(search);
                    break;
                }
                catch (HotelNotFoundException h)
                {
                    System.out.println(h);
                }

            default:
                break;
        }
    }

    public void searchHotel(String hotelName) throws Exception
    {
        int flag=0;
        for(Hotel i:l){
            if(i.getHotelName().equals(hotelName)){
                flag=1;
                System.out.println("SEARCH SUCCESS!!!");
                System.out.format("%-15s %-15s %-25s %-25s %-15s\n","Hotel ID","Hotel Name","HotelFacilities","HotelDescription","hotel Rating");
                System.out.format("%-15s %-15s %-25s %-25s %-15s\n",i.getHotelId(),i.getHotelName(),i.getHotelFacility(),i.getHotelDesc(),i.getRating());

            }
        }
        if(flag==0){
            throw new HotelNotFoundException();
        }

    }
    public static void main(String[] args) throws Exception {
        //Scanner sc=new Scanner(System.in);
        Hotel h=new Hotel();
        HotelMain hm=new HotelMain();
        hm.createDetails();
        System.out.println("Select 1 to sort hotel data based on hotel name");
        System.out.println("Select 2 to sort hotel data based on hotel rating");
        System.out.println("Select 3 to search hotel by hotel name");
        int selection=sc.nextInt();
        hm.performOperations(selection);


    }
}
