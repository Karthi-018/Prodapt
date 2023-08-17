package edu.prodapt.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main_college {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		College col=new College();
		List<College> list=new ArrayList<College>();
		CollegeBO obj=new CollegeBO();
		System.out.println("Enter your choice:");
		int choice=scan.nextInt();
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root")) {
	            switch (choice) {
	                case 1:
	                	obj.addDetails(col);
	                	break;
	                case 2:
	                	System.out.println("Enter the starting date to search:");
	                	String startingDate = scan.next();
	            		List<College> list1=new ArrayList<College>();
	            		list.sort(Comparator.comparing(College::getName));
	                    displayCollege(list1);
	                    break;
	                case 3:
	                	System.out.println("Enter the location to search:");
	                	String location = scan.next();
	            		List<College> list2=new ArrayList<College>();
	            		list.sort(Comparator.comparing(College::getStartingDate));
	                    displayCollege(list2);
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
