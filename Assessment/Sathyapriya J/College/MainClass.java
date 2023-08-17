package test1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;



public class MainClass 
{
	
	public static void main(String a[]) throws Exception 
	{
		CollegeBO bo = new CollegeBO();
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
			System.out.println("Enter choice");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter details : ");
					bo.createCollege(College.inputCol(sc.next()));
					break;
				case 2:

                    System.out.print("Enter starting date (yyyy-MM-dd): ");
                    String startingDateStr = sc.next();
                    Date startingDate = Date.valueOf(startingDateStr);
                    List<College> collegesByDate = bo.findCollege(startingDate);
                    bo.displayColleges(collegesByDate);
                    break;

                case 3:

                    System.out.print("Enter location: ");
                    String location = sc.next();
                    List<College> collegesByLocation = bo.findCollege(location);
                    bo.displayColleges(collegesByLocation);
                    break;
					
				case 4:
					//findCollege();
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid option");
				
			}
		}
	}
}
