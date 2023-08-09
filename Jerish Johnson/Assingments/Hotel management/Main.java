package org.example;

import java.util.ArrayList;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws HotelNotFoundException{
        ArrayList<Hotel> data=new ArrayList<>();
        data.add(new Hotel(101,"AAA","Nice Ambiance","Alltype",8));
        data.add(new Hotel(102,"BBB","Good view","Swimming pool,Gym,park",6));
        data.add(new Hotel(103,"CCC","Nice place","Gym,park",9));
        data.add(new Hotel(104,"DDD","Modern","Gym,park,Playground",9));
        data.add(new Hotel(105,"EEE","Modern","Swimming pool,court,Gym,park",10));

        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while(ch !=4 )
        {
            System.out.println("Hotel Management System");
            System.out.println("1.Sort the Hotel data based on the hotel names.");
            System.out.println("2.Sort the Hotel data based on the hotel ratings.");
            System.out.println("3.Search Hotel by their names.");
            System.out.println("4.Exit");
            System.out.print("Enter your request :");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    Hservice.sortHname(data);
                    System.out.println("Hotels sorts by name");
                    System.out.println("********************************************");
                    for(Hotel i : data)
                    {
                        System.out.println(i.getHname()+" "+i.getRating()+" "+i.getHid()+" "+i.getDes()+" "+i.getFacilities()+" "+i.getRating());

                    }
                    break;
                case 2:
                    Hservice.sortHrating(data);
                    System.out.println("Hotels sorted by rating");
                    System.out.println("********************************************");
                    for(Hotel i : data)
                    {
                        System.out.println(i.getHname()+" "+i.getRating()+" "+i.getHid()+" "+i.getDes()+" "+i.getFacilities());
                    }
                    break;
                case 3:
                    boolean flag=false;
                    System.out.println("Enter Hotel name to Search:");
                    String name = sc.next();

                    for(Hotel hotels : data)
                    {
                        if (hotels.getHname().equalsIgnoreCase(name))
                        {
                            System.out.println("Hotel Found");
                            System.out.println(hotels.getHname()+" "+hotels.getHid()+" "+hotels.getDes()+" "+hotels.getFacilities()+" "+hotels.getRating());
                            flag = true;
                            break;
                        }

                    }
                    if (flag==false)
                    {
                        throw new HotelNotFoundException(name);
                    }
                    break;
                case 4:
                    System.out.println("Thank you ,please visit again!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }


        }
    }
}