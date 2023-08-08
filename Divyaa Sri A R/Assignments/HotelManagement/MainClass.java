package org.example.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List<HotelMngt> hotel=new ArrayList<>();

        hotel.add(new HotelMngt(2,"hotel2","description2","facility2",4.3));
        hotel.add(new HotelMngt(8,"hotel8","description8","facility8",2.8));
        hotel.add(new HotelMngt(3,"hotel3","description3","facility3",4.8));
        hotel.add(new HotelMngt(5,"hotel5","description5","facility5",4.1));
        hotel.add(new HotelMngt(4,"hotel4","description4","facility4",3.8));
        hotel.add(new HotelMngt(10,"hotel10","description10","facility10",3.0));
        hotel.add(new HotelMngt(6,"hotel6","description6","facility6",3.3));
        hotel.add(new HotelMngt(7,"hotel7","description7","facility7",4.0));
        hotel.add(new HotelMngt(1,"hotel1","description1","facility1",3.2));
        hotel.add(new HotelMngt(9,"hotel9","description9","facility9",4.9));

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice");
        int option=sc.nextInt();

        switch(option) {
            case 1:{
                hotel.sort((s1, s2) -> (s1.getHotelname().compareTo(s2.getHotelname())));
                for (HotelMngt h : hotel) {
                    System.out.println(h);
                }
                break;
            }
            case 2:{

                //hotel.sort((s1,s2)->Double.compare(s1.getRating(),s2.getRating()));
                hotel.sort(new Comparator<HotelMngt>() {

                    public int compare(HotelMngt s1, HotelMngt s2) {
                        if (s1.getRating() < s2.getRating()) {
                            return -1;
                        } else if (s1.getRating() > s2.getRating()) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                });
                for(HotelMngt hm: hotel) {
                    System.out.println(hm);
                }
                break;

            }
            case 3:{
                boolean flag=false;
                System.out.println("Enter the name to search");
                String searchName=sc.next();
                for(HotelMngt ht:hotel){
                    if(searchName.equals(ht.getHotelname())){
                        System.out.println(ht);
                        flag=true;
                    }
            }
                if(flag==false){
                    try {
                        throw new HotelNotFoundException(searchName);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                }
                break;
        }
    }
}
}
