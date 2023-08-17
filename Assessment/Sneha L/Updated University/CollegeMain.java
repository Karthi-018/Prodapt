package edu.com.University;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CollegeMain {

		public static void main(String[] args) throws Exception {
			Scanner sc=new Scanner(System.in);
			List<College> college=new ArrayList<>();
			CollegeBO clgbo=new CollegeBO();
			System.out.println("Enter the no of colleges");
			int n=sc.nextInt();
			while(n>0){
	            String s=sc.next();
	            String[] arr = s.split(",");
	            String name = arr[0];
	            String website = arr[1];
	            String mobile = arr[2];
	            String founder = arr[3];
	            Integer noOfDept= Integer.parseInt(arr[4]);
	            String location = arr[5];
	            String startDate = arr[6];
	            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	            Date date = df.parse(startDate);
	            College d=new College(name,website,mobile,founder,noOfDept,location,date);
	            clgbo.create(d);
	            college.add(d);
	            
	            n--;
	        }
			Boolean b=true;
			while(b) {
				System.out.println("OPTIONS:\n 1. College list based on name \n 2.College list based on date \n 3.College list based on location\n 4.sorted the college name list based on number of department\n 5.sorted the college name list based on location\n 6.sorted the college name list based  on date ");
				int ch=sc.nextInt();
				List<College> colg=new ArrayList<>();
				switch(ch)
				{
				case 1:
					System.out.println("Enter college names:");
					String clgname=sc.next();
					String[] cnames=clgname.split(",");
					List<String> collegename=new ArrayList<>();
					Collections.addAll(collegename, cnames);
					colg=clgbo.findCollege(collegename);
					displayDetails(colg);
					
					
					break;
				case 2:
					System.out.println("Enter starting date:");
					String date=sc.next();
					SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
					Date d=sdf.parse(date);
					colg=clgbo.findCollege(d);
					displayDetails(colg);
				
					break;
				case 3:
					System.out.println("Enter location:");
					String loc=sc.next();
					colg=clgbo.findCollege(loc);
					displayDetails(colg);
					
					break;
				
				case 4:
					System.out.println("Sorted the list of college name based on department number");
					List<College> sortdept=clgbo.sortDept();
					displayDetails(sortdept);
					break;
				case 5:
					System.out.println("Sorted the list of college name based on Location");
					List<College> sortloc=clgbo.sortLoc();
					displayDetails(sortloc);
					break;
				case 6:
					System.out.println("Sorted the list of college name based on date");
					List<College> sortdate=clgbo.sortDate();
					displayDetails(sortdate);
					break;
					
				default:
					System.out.println("INVALID INPUT");
					}
	}
			
			
			


	}
		static void displayDetails(List<College> colg) throws CollegeNotFoundException {
			if(colg.isEmpty()) {
				throw new CollegeNotFoundException("No Found in Database");
			}
			else {
				System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
				for(College i:colg)
				{
					System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",i.getName(),i.getWebsite(),i.getMobile(),i.getFounder(),i.getNumberOfDept(),i.getLocation(),i.getStartingDate());
				}
			
			}
		}
}
