package org.example;
import java.util.*;


class Main {
    public static  void main(String args[]) {
        Hotel obj = new Hotel(101, "Villa", "A", "AC rooms", 4);
        List<Hotel> data = new ArrayList<>();
        String search_name;


        data.add(obj);
        data.add(new Hotel(102, "Golden", "B", "Non Ac", 3));
        data.add(new Hotel(105, "Agora", "F", "Food", 5));
        data.add(new Hotel(100, "Motel", "Z", "Water", 3));
        data.add(new Hotel(112, "Beliz", "U", "swimming", 1));
        data.add(new Hotel(100, "Chic", "M", "tennis court", 3));
        data.add(new Hotel(131, "Inn", "R", "conference rooms", 2));
        data.add(new Hotel(188, "Holiday", "C", "TV", 5));
        data.add(new Hotel(134, "Star", "Q", "Fan", 4));
        data.add(new Hotel(103, "Galaxy", "V", "Gym", 3));

        System.out.println("**********************************************");
        System.out.println("Enter your choice");
        System.out.println("1 -> Sort the Hotel data based on Hotel Name");
        System.out.println("2 -> Sort the Hotel data based on Hotel Rating");
        System.out.println("3 -> Search");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {

            case 1:
                data.sort((t1, t2) -> (t1.getHotelName().compareTo(t2.getHotelName())));
                data.forEach(System.out::println);
                break;
            case 2:
                data.sort((t1, t2) -> (t1.getRating() < t2.getRating()) ? -1 : (t1.getRating() > t2.getRating()) ? 1 : 0);
                data.forEach(System.out::println);
                break;
            case 3:
                try {
                    System.out.println("Enter the search name: ");
                    search_name = sc.next();
                    int x = 0;
                    for (Hotel h : data) {
                        if (search_name.equals(h.getHotelName())) {
                            //hotel = h;
                            System.out.println(h);
                            x = 1;
                            break;
                        }
                    }
                    if(x==0){
                        try
                        {
                            throw new HitelNotFoundException(search_name);
                        }
                        catch (HitelNotFoundException e)
                        {
                            System.out.println(e);
                        }
                    }
                    /*else
                    {
                        System.out.println(hotel);
                    }*/

                }
                    finally{
                            System.out.println("**********************************");
                        }




                }
        }
    }









