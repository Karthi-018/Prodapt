package requirement4.assignment;

import java.util.Date;

import java.util.*;

import java.sql.*;
import java.text.SimpleDateFormat;
//import java.util.DriverManager;

public class Collegemain 
{
public static void main(String args[], List<String> nameList) throws Exception
{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/req4","root","root");
		
		Scanner sc = new Scanner(System.in);
		CollegeBO c = new CollegeBO();
		List<College> clist = new ArrayList<>();
		
		System.out.println("1. Search based on Name");
		System.out.println("2. Search based on Date");
		System.out.println("3. Search based on Location");
		System.out.println("Enter your choice");
		
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
     		System.out.println("Enter date: ");
     		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
			String dateInString = sc.next();
			Date startingDate = formatter.parse(dateInString);
     		
     		College college = new College(name, website, mobile, founder, numberofDept, location, startingDate);
     		c.addCollege(college);
     		
     		break;
     		
         }
			 
		 case 2:
		 {
         	 
         	 List<College> cList = new ArrayList<>();
        	 
         	 CollegeBO i1 = new CollegeBO();
         	 
         	 System.out.println("How many colleges?");
        	 int no = sc.nextInt();
         	 
         	 
         	 for(int x=0;x<no;x++) 
			 {
				   System.out.println("Enter "+x+1+" name");
				   String name1 = sc.next();
				   cList.add(name1);
			   }
         	List<College> collegelist=new ArrayList();
         	collegelist = i1.findCollege((List<String>) nameList);
			 for(College e : cList)
	        	{
	        		System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",e.getName(),e.getWebsite(),e.getMobile(),e.getFounder(),e.getNumberofDept(),e.getLocation(),e.getDate());
	        	}
	        	
	        	break;
		 }
		 
		 case 3:
		 {
			    List<College> cList = new ArrayList<>();
	        	CollegeBO i1 = new CollegeBO();
	        	System.out.println("Enter the starting date: ");
	        	SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
			    Date startingdate1=(java.util.Date)df.parse(sc.next()); 
	            
	        	cList = i1.findCollege((List<String>) startingdate1);
	        	
	        	for(College a : cList)
	        	{
	        		System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",a.getName(),a.getWebsite(),a.getMobile(),a.getFounder(),a.getNumberofDept(),a.getLocation(),a.getDate());
	        	}
	        	
	        	break;
		 }
		 
		
		case 4:

        {
        	
        	List<College> cList1 = new ArrayList<>();
        	CollegeBO i2 = new CollegeBO();
        	System.out.println("Enter the location: ");
        	String location1 = sc.next();
            
        	cList1 = i2.findCollege(location1);
        	
        	for(College b : cList1)
        	{
        		System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",b.getName(),b.getWebsite(),b.getMobile(),b.getFounder(),b.getNumberofDept(),b.getLocation(),b.getDate());
        	}
        	
        	break;
        	 
	}
	
}
}
}
