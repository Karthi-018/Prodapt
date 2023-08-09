package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws  Exception{
        ArrayList<hotel> Hotels = new ArrayList<>();
        Hotels.add(new hotel(7, "Hotel_A2B", "veg", "Ac", 5.9));
        Hotels.add(new hotel(2, "Hotel_Anandha", "veg&non veg", "TV", 7.7));
        Hotels.add(new hotel(1, "Hotel_Abc", "snacks", "Fridge", 6.7));
        Hotels.add(new hotel(11, "Hotel A", "juice", "washingmachine", 9.9));
        Hotels.add(new hotel(18, "Hotel b", "snacks1", "Facility18", 5.0));
        Hotels.add(new hotel(12, "Hotel c", "snacks2", "Facility82", 4.5));
        Hotels.add(new hotel(21, "Hotel d", "snacks8", "Facility79", 6.7));
        Hotels.add(new hotel(91, "Hotel y", "snacks7", "Facility32", 5.9));
        Hotels.add(new hotel(81, "Hotel u", "snacks5", "Facility29", 3.5));
        Hotels.add(new hotel(71, "Hotel h", "snacks4", "Facility12", 1.9));


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice name:");
        //String name = sc.next();

        int choice;
        choice=sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                Hotels.sort((t1, t2) -> (t1.gethotelname().compareTo(t2.gethotelname())));
                //hotel.forEach(System.out::println);
                for(hotel w:Hotels ) {
                    System.out.println(w);
                }
                break;
            case 2:
                Hotels.sort((t1, t2) -> (t1.getRating() < t2.getRating()) ? -1 : (t1.getRating() > t2.getRating()) ? 1 : 0);
                for(hotel T:Hotels){
                    System.out.println(T);
                }
                break;
            case 3:
                    int x = 0;
                    System.out.println("Enter the search name: ");

                    String searchname = sc.nextLine();

                    System.out.println(searchname);
                    for (hotel h : Hotels) {
                        if (h.gethotelname().equals(searchname))
                        {
                            System.out.println(h);
                            x = 1;
                        }
                    }
                    if (x == 0) {
                       try {
                           throw new HotelNotFoundException(searchname);
                       } catch (HotelNotFoundException e)
                       {
                           System.out.println(e);
                        }
                        System.out.println("not found");

                    }

                }

        }
    }

