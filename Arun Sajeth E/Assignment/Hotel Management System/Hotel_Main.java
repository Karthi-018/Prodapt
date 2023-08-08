package org.example.hotel;

import java.util.*;

public class Hotel_Main
{
    static Scanner s = new Scanner (System.in);
    static List<Hotel> L1 = new ArrayList<>();

    public static void main(String[] args)
    {

        L1.add(new Hotel(101,"QRS","Non-Veg","AC",9.50));
        L1.add(new Hotel(101,"XYZ","Veg","AC & Non-AC",6.50));
        L1.add(new Hotel(101,"MNO","Veg & Non-Veg","Non-AC",8.50));
        L1.add(new Hotel(101,"ABC","Indian","Party-hall",8.00));
        L1.add(new Hotel(101,"GHI","Chinese","Restaurant",9.00));

        Hotel_Main hm = new Hotel_Main();
        hm.userChoice();
    }

    public void userChoice()
    {
        int choice;
        do
        {
            System.out.println();
            System.out.println("1. Sort based on Hotel Name");
            System.out.println("2. Sort based on Hotel Rating");
            System.out.println("3. Search hotel details by hotel name");

            System.out.print("\nEnter the choice : ");
            choice = s.nextInt();

            switch (choice)
            {
                // For sort according to Hotel Name

                case 1:
                    System.out.println("***************************** Based on Hotel name *****************************");
                    Collections.sort(L1,(h1,h2) -> (h1.getHotel_name().compareTo(h2.getHotel_name())));
                    for(Hotel h:L1)
                    {
                        System.out.format("%-20s %-10s %-20s %-20s %-12s\n",h.getHotel_id(),h.getHotel_name(),h.getHotel_desp(),h.getHotel_faci(),h.getHotel_rating());
                    }
                    System.out.println("*******************************************************************************");
                    break;

                // For sort according to Hotel Rating

                case 2:
                    System.out.println("*************************** Based on Hotel Rating *****************************");
                    Collections.sort(L1,(h1,h2) -> (h1.getHotel_rating()>h2.getHotel_rating()?1:-1));
                    for(Hotel h:L1)
                    {
                        System.out.format("%-20s %-10s %-20s %-20s %-12s\n",h.getHotel_id(),h.getHotel_name(),h.getHotel_desp(),h.getHotel_faci(),h.getHotel_rating());
                    }
                    System.out.println("*******************************************************************************");
                    break;

                // For search according to Hotel name

                case 3:
                    System.out.println("************************* Search based on Hotel name **************************");
                    System.out.print("Enter the hotel name to search : ");
                    String search_name = s.next();
                    Hotel_Main hm1 = new Hotel_Main();
                    hm1.search(search_name);
                    System.out.println("*******************************************************************************");

                    break;
                default:
                    System.out.println("********************************* EXIT ****************************************");
            }

        }while(choice!= 0 && choice<4);
    }

    public void search(String search_name)
    {
        boolean flag = false;
        for(Hotel h:L1)
        {
            if(h.getHotel_name().equals(search_name))
            {
                flag = true;
                System.out.format("%-20s %-10s %-20s %-20s %-12s\n",h.getHotel_id(),h.getHotel_name(),h.getHotel_desp(),h.getHotel_faci(),h.getHotel_rating());
            }
        }
        if(flag==false)
        try
        {
            throw new HotelNotFoundException(search_name);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
