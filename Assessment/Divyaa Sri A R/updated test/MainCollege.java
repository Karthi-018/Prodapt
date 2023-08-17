package test2;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
//import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;


public class MainCollege {
	static Scanner sc= new Scanner(System.in);
	static CollegeBO cbo= new CollegeBO();
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("sucess");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			System.out.println("Connection Successful");
			int choice;
			do {
			System.out.println("1. Search your clg details by name");
			System.out.println("2. Search your clg details by date");
			System.out.println("3. Search your clg details by location");
			System.out.println("4. sort by name in college list");
			System.out.println("5. sort by no of departments in college list");
			System.out.println("6. sort by date in college list");
			System.out.println("7. add college details");
			System.out.println("8. exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:{
				List<String> nameList = new ArrayList<String>();
				System.out.println("Enter number of names to search");
				int n=sc.nextInt();
				for(int i=1;i<=n;i++)
				{
				System.out.println("Enter search name "+i);
				String sname=sc.next();
				//College newCollege=new College(sname);
				//nameList.add(newCollege);
				nameList.add(sname);
				}
				List<College> findit = cbo.findCollege(nameList);
				if(findit.isEmpty())
				{
					System.out.println(" Not found");
				}
				else
				{
					System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
					System.out.println("-----------------------------------");
					for(College f:findit)
					{
						System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",f.getName(),f.getWebsite(),f.getMobile(),f.getFounder(),f.getNumberOfDept(),f.getLocation(),f.getStartingDate());;
					}
				}
				break;
				
			}
			case 2:{
				System.out.println("Enter date to search ");
				String sdate = sc.next();
				DateFormat df = new SimpleDateFormat("dd:mm:yy");
				java.util.Date sedate = df.parse(sdate);
				List<College> findit = new CollegeBO().findCollege(df.format(sedate));
				if(findit.isEmpty())
				{
					System.out.println("Not found");
				}
				else
				{
					System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
					System.out.println("--------------------------------------------------------------------------------------------");
					for(College f:findit)
					{
						System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",f.getName(),f.getWebsite(),f.getMobile(),f.getFounder(),f.getNumberOfDept(),f.getLocation(),f.getStartingDate());;
					}
				}
				break;
			}
			case 3:{
				System.out.println("Enter location to search ");
				String slocation=sc.next();
				List<College> findit = cbo.findCollege(slocation);
				if(findit.isEmpty())
				{
					System.out.println("Not found");
				}
				else
				{
					System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
					System.out.println("----------------------------------------------------------------------------------------------");
					for(College f:findit)
					{
						System.out.format("%-20s %-20s %20s %20s %20s %20s\n",f.getName(),f.getWebsite(),f.getMobile(),f.getFounder(),f.getNumberOfDept(),f.getLocation(),f.getStartingDate());;
					}
				}
				break;
			}
			 case 4:{
                 List<College> clg = cbo.sortbyName();
                 System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
                 System.out.println("----------------------------------------------------------------------------------------------");
                 for(College f:clg)
					{
						System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",f.getName(),f.getWebsite(),f.getMobile(),f.getFounder(),f.getNumberOfDept(),f.getLocation(),f.getStartingDate());;
					}
                 break;
			}
			 case 5:{
                 List<College> clg = cbo.sortbynoOfDept();
                 System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
                 System.out.println("----------------------------------------------------------------------------------------------");
                 for(College f:clg)
					{
						System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",f.getName(),f.getWebsite(),f.getMobile(),f.getFounder(),f.getNumberOfDept(),f.getLocation(),f.getStartingDate());;
					}
                 break;
			}
			 case 6:{
                 List<College> clg = cbo.sortbyDate();
                 System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
                 System.out.println("----------------------------------------------------------------------------------------------");
                 for(College f:clg)
					{
						System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",f.getName(),f.getWebsite(),f.getMobile(),f.getFounder(),f.getNumberOfDept(),f.getLocation(),f.getStartingDate());;
					}
                 break;
			}
			 case 7:{
				 List<College> clgList = new ArrayList<College>();
					System.out.println("Enter no of colleges ");
			        int num = sc.nextInt();
			        for(int i=1;i<=num;i++){
			        	System.out.println("Enter the college details "+i);
			        	String[] s = sc.next().split(",");
			        	Integer numberOfDept = Integer.parseInt(s[4]);
			        	DateFormat df = new SimpleDateFormat("dd:mm:yy");
			        	//Date startingDate =(Date) df.parse(s[6]); 
			        	//Date date = df.parse(startDate);
			        	java.util.Date startingDate =df.parse(s[6]); 
			        	College c = new College(s[0],s[1],s[2],s[3],numberOfDept,s[5],startingDate);
			        	//cbo.create(new College(s[0],s[1],s[2],s[3],numberOfDept,s[5],startingDate))
			        	clgList.add(c);
			        }
			        cbo.create(clgList);
			 }
			}
			}while(choice<=7);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	
	

}
