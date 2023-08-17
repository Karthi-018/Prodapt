package edu.prodapt.demos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main_college {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		College col=new College();
		List<College> list=new ArrayList<College>();
		CollegeBO obj=new CollegeBO();
		System.out.println("Enter your choice:");
		System.out.println("1.To Add details:");
		System.out.println("2.To search by name:");
		System.out.println("3.To search by starting date:");
		System.out.println("4.To search by location:");
		System.out.println("5.To compare based on the no.of.departments:");

		int choice=scan.nextInt();
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root")) {
	            switch (choice) {
	                case 1:
	                	obj.addDetails(col);
	                	break;
	                case 2:
	                    System.out.println("Enter the name to search:");
	                    String name = scan.next();
	                    List<String> nameList = new ArrayList<>();
	                    nameList.add(name);
	                    List<College> resultList = obj.findCollege(nameList);
	                    resultList.sort(Comparator.comparing(College::getName));
	                    displayCollege(resultList);
	                    break;
	                case 3:
	                    System.out.println("Enter the starting date to search (yyyy-MM-dd):");
	                    String startingDateStr = scan.next();
	                    Date startingDate = java.sql.Date.valueOf(startingDateStr);
	                    List<College> list2 = obj.findCollege(startingDate);
	                    list2.sort(Comparator.comparing(College::getStartingDate));
	                    displayCollege(list2);
	                    break;
                    case 4:
	                	System.out.println("Enter the location to search:");
	                	String location = scan.next();
	            		List<College> list3=obj.findCollege(location);
	            		list3.sort(Comparator.comparing(College::getLocation));
	                    displayCollege(list3);
	                    break;
                    case 5:
	            		List<College> list4=obj.noOfDept();
                        list4.sort(Comparator.comparingInt(College::getNumberOfDept));
                        displayCollege(list4);
                        break;
                    default:
	                	System.out.println("invalid data");

	              
	                	
	            }
	        }
}
		catch (ClassNotFoundException | SQLException e) {
	System.out.println(e.getMessage());
}
	}


public static void displayCollege(List<College> list) {
    if (!list.isEmpty()) {
        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name", "website", "mobile","founder","numberOfDept","location","startingDate");
        for (College i : list) {
        	System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", i.getName(), i.getWebsite(),i.getMobile(),
        			i.getFounder(),i.getNumberOfDept(),i.getLocation(),i.getStartingDate());        		   
        }
    } else {
        System.out.println("No details is present.");
    }
}
}
