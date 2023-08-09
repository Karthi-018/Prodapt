package org.example.hotel_management_system;

import java.util.*;

public class MainCls {
    static List<Hotel> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void initialise(){
        list.add(new Hotel(101,"HotelA","Take rest leave the rest","Ac rooms",new Double(5.0)));
        list.add(new Hotel(102,"HotelB","Take rest leave the rest","Swimming pool",new Double(4.2)));
        list.add(new Hotel(103,"HotelC","Take rest leave the rest","Ac rooms",new Double(3.0)));
        list.add(new Hotel(104,"HotelD","Take rest leave the rest","Ac rooms",new Double(4.1)));
        list.add(new Hotel(105,"HotelE","Take rest leave the rest","Ac rooms",new Double(3.5)));
        displayOptions();
    }

    public void displayOptions(){
        System.out.println("1. Sort by hotel name");
        System.out.println("2. Sort by hotel rating");
        System.out.println("3. Search hotel");
        System.out.println("4. Exit");
        System.out.println("Select the option");
        int opt = sc.nextInt();
        performOperations(opt);
    }

    public void displayList(){
        for(Hotel h:list){
            System.out.println(h);
        }
    }

    public void performOperations(int opt){
        switch (opt){
            case 1:
                Collections.sort(list,(o1,o2)-> (o1.gethName().compareTo(o2.gethName())));
                displayList();
                displayOptions();
                break;

            case 2:
                Collections.sort(list,(o1,o2)->(o1.getRating().compareTo(o2.getRating())));
                displayList();
                displayOptions();
                break;

            case 3:
                System.out.println("Enter the Hotel name");
                String name = sc.next();
                boolean isPresent = false;
                for(Hotel h:list){
                    if(h.gethName().equalsIgnoreCase(name)){
                        isPresent = true;
                        System.out.println(h);
                    }
                }
                if(!isPresent){
                    try{
                        throw new HotelNotFoundException(name);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                }
                displayOptions();
                break;

            case 4:
                System.exit(0);

            default:
                System.out.println("Invalid option");
                displayOptions();
        }

    }


    public static void main(String[] args) {
        MainCls m = new MainCls();
        m.initialise();

    }
}
