package requirement4.assignment;

import java.util.Date;
import java.util.ArrayList;
import java.util.*;

import java.sql.*;
//import java.util.DriverManager;

public class Collegemain 
{
public static void main(String args[]) throws Exception
{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/req4","root","root");
		Scanner sc = new Scanner(System.in);
		CollegeBO c = new CollegeBO();
		int choice = sc.nextInt();
		
		switch(choice)
		 {
		 case 1:
		
         {

         	System.out.println("Enter name: ");
     		String name = sc.next();
     		System.out.println("Enter website: ");
     		String website = sc.next();
     		System.out.println("Enter mobile: ");
     		String mobile = sc.next();
     		System.out.println("Enter founder: ");
     		String founder = sc.next();
     		System.out.println("Enter numberofDept: ");
     		int numberofDept = sc.nextInt();
     		System.out.println("Enter location: ");
     		String location = sc.next();
     		
     		College college = new College(name, website, mobile, founder, numberofDept, location);
     		c.addCollege(college);
     		
     		break;
     		
         }
			 
		 
		 case 3:
		 {
			 List<College> collegelist = new ArrayList<>();
			 CollegeBO c2 = new CollegeBO();
			 System.out.println("Enter location");
			 String slocation = sc.next();
			 
			 collegelist = c2.findCollege(slocation);
			 for(College c1 : collegelist)
			 {
				System.out.println("c1.getName() + c1.getWebsite() + c1.getMobile() + c1.getFounder() + c1.getnumberofDept() + c1.getLocation()"); 
			 }
		 }
			 
		 }
	
}
}
