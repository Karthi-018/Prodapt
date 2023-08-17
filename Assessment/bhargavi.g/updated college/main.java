package college;

import java.util.Date;

import java.util.*;

import java.sql.*;
import java.text.SimpleDateFormat;


public class main
{
public static List<College> List1 = null;


public static void main(String[] args, List<String> nameList) throws Exception
{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		Scanner sc = new Scanner(System.in);
		CollegeBO c = new CollegeBO();
		List<College> list = new ArrayList<>();
		
		System.out.println("1. Search based on Name");
		System.out.println("2. Search based on Date");
		System.out.println("3. Search based on Location");
		System.out.println("Enter  choice");
		
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
     		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
			String dateInString = sc.next();
			Date startingDate = formatter.parse(dateInString);
     		
     		College college = new College(name, website, mobile, founder, numberofDept, location, startingDate);
     		c.addCollege(college);
     		
     		break;
     		
         }
			 
		 case 2:
		 {
         	 
         	 List<College> list1 = new ArrayList<>();
        	 
         	 CollegeBO i1 = new CollegeBO();
         	 
         	 System.out.println("How many colleges?");
        	 int no = sc.nextInt();
         	 
         	 
         	 for(int x=0;x<no;x++) 
			 {
				   System.out.println("Enter "+x+1+" name");
				   Comparable<String> name1 = sc.next();
				   list1.addAll(list1);
			   }
         	List<College> collegelist=new ArrayList();
         	collegelist = i1.findCollege((List<String>) nameList);
			 for(College e : list1)
	        	{
	        		System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",e.getName(),e.getWebsite(),e.getMobile(),e.getFounder(),e.getnumberofDept(),e.getlocation(),e.getStartingDate());
	        	}
	        	
	        	break;
		 }
		 
		 case 3:
		 {
			    List<College> cList = new ArrayList<>();
	        	CollegeBO i = new CollegeBO();
	        	System.out.println("Enter the starting date: ");
	        	SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
			    Date startingdate1=(java.util.Date)df.parse(sc.next()); 
	            
	        	cList = i.findCollege((List<String>) startingdate1);
	        	
	        	for(College a : list)
	        	{
	        		System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",a.getName(),a.getWebsite(),a.getMobile(),a.getFounder(),a.getnumberofDept(),a.getlocation(),a.getStartingDate());
	        	}
	        	
	        	break;
		 }
		 
		
		case 4:

        {
        	
        	List<College> list1 = new ArrayList<>();
        	CollegeBO i1 = new CollegeBO();
        	System.out.println("Enter the location: ");
        	String location1 = sc.next();
            
        	List1 = i1.findCollege(location1);
        	
        	for(College b : List1)
        	{
        		System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",b.getName(),b.getWebsite(),b.getMobile(),b.getFounder(),b.getnumberofDept(),b.getlocation(),b.getStartingDate());
        	}
        	
        	break;
        	 
	}
	
}
}
}
