package org.example;
import java.util.*;
public class Hotel_main {
    public static void main(String[] args) throws Exception
    {
        List<Hotel>details=new ArrayList();
        Hotel h1=new Hotel(101,"Nala","Fully furnished rooms with Safety Lockers","3 times Food per day,Laundry",4.50);
        Hotel h2=new Hotel(205,"Himalaya","Fully furnished rooms,Hourly rent,Garden available","Food,room service",4.7);
        Hotel h3=new Hotel(155, "Residence","Fully furnished rooms,Self service","3 times Food per day,Cafetaria",4.1);
        Hotel h4=new Hotel(55, "Nalan"," ","3 times Food per day",3.50);
        Hotel h5=new Hotel(404,"Error","Rooms available as per day rent","3 times Food per day",2.7);
        Hotel h6=new Hotel(701,"Aanandhi","Fully furnished rooms","Breakfast will be provided,room service available",4.3);
        Hotel h7=new Hotel(385, "Feel Home","Fully furnished rooms with both daily and monthly rent","3 times Food per day,Washing machineavailable",2.45);
        Hotel h8=new Hotel(000, "Green Home"," ","3 times Food per day",3.50);
        Hotel h9=new Hotel(061,"AEC","Only rooms ","Seperate Cost for others ",2.1);
        Hotel h10=new Hotel(906,"Kushi","Fully furnished rooms","Food,room service",4.1);


        details.add(h1);
        details.add(h2);
        details.add(h3);
        details.add(h4);
        details.add(h5);
        details.add(h6);
        details.add(h7);
        details.add(h8);
        details.add(h9);
        details.add(h10);

        Scanner s=new Scanner(System.in);
        System.out.println("1-> To sort data based on Hotel Name");
        System.out.println("2-> To sort data based on Hotel rating");
        System.out.println("3-> To Search Hotel by HotelName");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
                details.sort((t1,t2)->(t1.getName().compareTo(t2.getName())));
                details.forEach(System.out::println);
                break;
            case 2:
                details.sort((t1,t2)->((t1.getRating()<t2.getRating())?-1:(t1.getRating()<t2.getRating())?1:0));
                details.forEach(System.out::println);
                break;
            case 3:
                System.out.println("Enter the Hotel Name");
                String name=s.next();
                int flag=0;
                try
                {
                    for(Hotel d:details)
                    {
                        if(name.equals(d.getName()))
                        {
                            System.out.println(d);
                            flag++;
                        }
                    }
                    if(flag==0)
                    {
                        throw new HotelNotFoundException(name);
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
        }



    }
}