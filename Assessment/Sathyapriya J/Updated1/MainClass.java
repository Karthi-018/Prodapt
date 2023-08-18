package test1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MainClass 
{
	
	public static void main(String a[]) throws Exception 
	{
		CollegeBO bo = new CollegeBO();
		List<College> colleges = new ArrayList();
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("success");
			System.out.println("Welcome to College Database");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
		int choice = 0;
		while(choice!=5)
		{
			System.out.println("1.To create  new College data\n2.Search college by name\n3.Search college by its starting date\n4.Search college by its location\n5.Exit ");
			System.out.println("Enter your choice to perform");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter college details(College name,website,mobile number,founder,number of department,location : ");
					bo.createCollege(College.inputCol(sc.next()));
					break;
				
				case 2:
					List<String> name = new ArrayList<>();
					System.out.println("Enter the number of colleges to search");
					int n = sc.nextInt();
					System.out.println("Enter the name of colleges");
					for(int i=0;i<n;i++) 
					{
						name.add(sc.next());
						
					}
					colleges= bo.findCollegeByName(name);
					bo.displayColleges(colleges);
					break;
					
				case 3:
                    System.out.print("Enter starting date (yyyy-mm-dd): ");
                    String startingDateStr = sc.next();
                    Date startingDate = Date.valueOf(startingDateStr);
                    colleges= bo.findCollege(startingDate);
                    bo.displayColleges(colleges);
                    break;

                case 4:
                    System.out.print("Enter the location of college: ");
                    String location = sc.next();
                    colleges= bo.findCollege(location);
                    bo.displayColleges(colleges);
                    break;
					
				
				case 5:
					System.out.println("Thank you :)");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid option");
				
			}
			System.out.println("Options for sorting the college data");
			System.out.println("1.Sort colleges by name\n2.Sort colleges by starting dates\n3.Sort colleges by number of departments");
			System.out.println("Enter your choice: ");
	        choice = sc.nextInt();
	        
			switch(choice) 
			{
	            case 1:
	            	colleges=bo.sortByName(colleges);
	                System.out.println("Colleges sorted by name.");
	                bo.displayColleges(colleges);
	                break;
	                
	            case 2: 
	                colleges = bo.sortByDate(colleges);
	                System.out.println("Colleges sorted by starting dates.");
	                bo.displayColleges(colleges);
	                break;
	            case 3:
	                colleges = bo.sortByNoOfDept(colleges);
	                System.out.println("Colleges sorted according to number of departments.");
	                bo.displayColleges(colleges);
	                break;
	                
	            default:
	                System.out.println("Invalid option");
	                break;
	        }


			
	 

	    }
		


	 

	}
		
}

