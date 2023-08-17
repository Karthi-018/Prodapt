package test2;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
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
			System.out.println("1. Create your item");
			System.out.println("2. add more items");
			System.out.println("3. Display your item by type");
			System.out.println("4. Display your item by price");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:{
				List<String> nameList = new ArrayList<String>();
				System.out.println("Enter number of items to add");
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
					System.out.format("%-20s %-20s %20s %20s %20s %20s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
					System.out.println("-----------------------------------");
					for(College f:findit)
					{
						System.out.format("%-20s %-20s %20s %20s %20s %20s\n",f.getName(),f.getWebsite(),f.getMobile(),f.getFounder(),f.getNumberOfDept(),f.getLocation(),f.getStartingDate());;
					}
				}
				break;
				
			}
			case 2:{
				System.out.println("Enter date to search ");
				String sdate = sc.next();
				DateFormat df = new SimpleDateFormat("dd:mm:yy");
				List<College> dateResult = cbo.findCollege(df.format(sdate));
				List<College> findit = cbo.findCollege(sdate);
				if(findit.isEmpty())
				{
					System.out.println("Not found");
				}
				else
				{
					System.out.format("%-20s %-20s %20s %20s %20s %20s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
					System.out.println("-----------------------------------");
					for(College f:findit)
					{
						System.out.format("%-20s %-20s %20s %20s %20s %20s\n",f.getName(),f.getWebsite(),f.getMobile(),f.getFounder(),f.getNumberOfDept(),f.getLocation(),f.getStartingDate());;
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
					System.out.format("%-20s %-20s %20s %20s %20s %20s\n","Name","Website","Mobile","Founder","NumberOfDept","location","StartingDate");
					System.out.println("-----------------------------------");
					for(College f:findit)
					{
						System.out.format("%-20s %-20s %20s %20s %20s %20s\n",f.getName(),f.getWebsite(),f.getMobile(),f.getFounder(),f.getNumberOfDept(),f.getLocation(),f.getStartingDate());;
					}
				}
				break;
			}
			}
			}while(choice<=3);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	
	

}
