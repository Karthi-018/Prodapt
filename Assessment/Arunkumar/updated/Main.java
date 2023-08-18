package test;

import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        System.out.println("Enter no of colleges ");
        int n = sc.nextInt();
        while(n-->0){
            // panimalar,panimalar.com,9898989898,jesus,5,chennai,03:05:23
            String[] w = sc.next().split(",");
            String name = w[0];
            String website = w[1];
            String mobile = w[2];
            String founder = w[3];
            Integer noOfdepartments = Integer.parseInt(w[4]);
            String location = w[5];
            String startDate = w[6];
            DateFormat df = new SimpleDateFormat("dd:MM:yy");
            Date date = df.parse(startDate);
            CollegeBO.save(new College(name,website,mobile,founder,noOfdepartments,location,date));
        }
        int choice;
        do{
            System.out.println("1.find college by name list ");
            System.out.println("2.find college by start date ");
            System.out.println("3.find college by location ");
            System.out.println("4.sort college list based on no of dept");
            System.out.println("5.exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    ArrayList<String> a = new ArrayList<>();
                    String[] collegeNames = sc.next().split(",");
                    for(String g : collegeNames){
                        a.add(g);
                    }
                    List<College> collegeList = new CollegeBO().findCollege(a);
                    System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
                    for(College c : collegeList){
                        System.out.println(c);
                    }
                    break;
                case 2 :
                    System.out.println("Enter start date ");
                    String dd = sc.next();
                    DateFormat dateFormat = new SimpleDateFormat("dd:MM:yy");
                    Date date1 = dateFormat.parse(dd);
                    List<College> cList = new CollegeBO().findCollege(date1);
                    System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
                    for(College c : cList){
                        System.out.println(c);
                    }
                    break;
                case 3:
                    System.out.println("Enter college location");
                    String location = sc.next();
                    List<College> cLocation = new CollegeBO().findCollege(location);
                    System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
                    for(College cg : cLocation){
                        System.out.println(cg);
                    }
                    break;
                case 4:
                    ArrayList<College> all = CollegeBO.sortDept();
                    System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
                    for(College nn : all){
                        System.out.println(nn);
                    }
                    break;
            }
        }while(choice!=5);
    }

}
