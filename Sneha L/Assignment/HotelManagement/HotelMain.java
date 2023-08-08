import java.awt.*;
import java.util.*;
import java.io.*;
public  class HotelMain implements Serializable{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<HotelDetails> hotelarr=new ArrayList<>();

    public static void main(String[] args) throws Exception {
        hotelarr.add(new HotelDetails(201,"ITC Grand Chola","Experience luxury at heights","Infinity Pool,Fine Dining",4.3));
        hotelarr.add(new HotelDetails(202,"Taj Connemara","Stay green with amenities","Antique Furnishings,wifi premium",3.7));
        hotelarr.add(new HotelDetails(203,"Adventure Lodge","Thrilling outdoor activities ","Biking,SkyDiving",4.2));
        hotelarr.add(new HotelDetails(204,"Leela Palace","Modern and stylish","spa,ocean view",4.0));
        hotelarr.add(new HotelDetails(205,"CitaDines","modern hotel feauring","gym,rootfop pool",4.5));
        hotelarr.add(new HotelDetails(206,"The Park","Upmarket Hotel","nightclub,spa",3.5));
        hotelarr.add(new HotelDetails(207,"Golden Fruits","Down-to-earth quarters","Complimentary breakfast,WiFi",4.7));
        hotelarr.add(new HotelDetails(208,"The Madras Grand","Understated amenities","Gym,viewpoints",3.9));
        hotelarr.add(new HotelDetails(209,"Sheraton Grande","Relax by the beach in cozy retreat","Private beach,Live Performance",4.6));
        hotelarr.add(new HotelDetails(210,"AR PARK","Futuristic accomodations ","smart room,VR Lounge",4.9));
        int option;
            do{
                System.out.println("Menu:");
                System.out.println("1. Sort Hotels by Name");
                System.out.println("2. Sort Hotels by Rating");
                System.out.println("3. Search the Hotel by Name");
                System.out.println("4. Exit");
                System.out.println("Select the option");
                option= sc.nextInt();
                sc.nextLine();
                switch (option){
                    case 1:
                        System.out.println("Sorted Hotel list based on name");
                        Collections.sort(hotelarr, Comparator.comparing(HotelDetails::getHotelName));
                        System.out.format("%-5s | %-32s | %-35s | %-35s | %-5s\n","HOTEL ID","HOME NAME","HOTEL DESCRIPTION","HOTEL FACILITIES","HOTEL RATING" );
                        for(HotelDetails h:hotelarr){
                            System.out.format("%-5s | %-35s | %-35s | %-35s | %-5s\n",h.getHotelId(),h.getHotelName(),h.getHotelDescription(),h.getHotelFacilities(),h.getHotelRating());
                        }
                        break;
                    case 2:
                        System.out.println("Sorted Hotel list based on ratings");
                        Collections.sort(hotelarr,(o1,o2)->((o1.getHotelRating()>o2.getHotelRating()?1:-1)));
                        System.out.format("%-5s | %-32s | %-35s | %-35s | %-5s\n","HOTEL ID","HOME NAME","HOTEL DESCRIPTION","HOTEL FACILITIES","HOTEL RATING" );
                        for(HotelDetails h:hotelarr){
                            System.out.format("%-5s | %-35s | %-35s | %-35s | %-5s\n",h.getHotelId(),h.getHotelName(),h.getHotelDescription(),h.getHotelFacilities(),h.getHotelRating());
                        }
                        break;
                    case 3:
                        System.out.println("Search the hotels\n Enter the hotel name to search:");

                        String name= sc.nextLine();
                        boolean found=false;
                        for(HotelDetails h:hotelarr)
                        {
                            if(h.getHotelName().equalsIgnoreCase(name)){
                                System.out.println("Hotel Found\n hotel details");
                                System.out.format("%-5s | %-32s | %-35s | %-35s | %-5s\n","HOTEL ID","HOME NAME","HOTEL DESCRIPTION","HOTEL FACILITIES","HOTEL RATING" );
                                    System.out.format("%-5s | %-35s | %-35s | %-35s | %-5s\n",h.getHotelId(),h.getHotelName(),h.getHotelDescription(),h.getHotelFacilities(),h.getHotelRating());

                                found=true;
                                File file=new File("hotel.txt");
                                try(FileOutputStream fout=new FileOutputStream(file);
                                    ObjectOutputStream objt=new ObjectOutputStream(fout)){
                                    objt.writeObject(h);
                                }
                                catch(Exception e){
                                    e.printStackTrace();
                                }
                                break;

                            }
                        }
                        if(!found){
                                throw new HotelNotFoundException();
                        }
                        break;

                }


        }while(option!=4);


    }
}