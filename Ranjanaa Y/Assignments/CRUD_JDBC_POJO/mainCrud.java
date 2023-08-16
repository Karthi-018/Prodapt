package crudconnection;
import java.util.*;
import java.sql.*;
public class mainCrud 
{
	public static void main(String args[])
	{
		Connection con;
		// creating object for DAO class
		crudDao cd = new crudDao();

		Scanner sc = new Scanner(System.in);
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loaded");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		System.out.println("Connected");
		int choice =0 ;
		while(choice !=5)
		{
			System.out.println("Enter your choice: ");
			System.out.println("Enter 1 to create a table: ");
			System.out.println("Enter 2 to display a table: ");
			System.out.println("Enter 3 to update a table: ");
			System.out.println("Enter 4 to delete a table: ");
			System.out.println("Enter 5 to search employee in  a table: ");
			System.out.println("Enter 6 to exit: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1 :
			cd.create(con);
			System.out.println("Employee detail added succesfully............");
			break;
			
			case 2 : 
			cd.display(con);
			System.out.println("This is the Employee table.............");
			break;
			
			case 3 : 
			cd.update(con);
			System.out.println("After updating ............");
			cd.display(con);
			break;
			
			case 4 : 
			cd.delete(con);
			System.out.println("Successfully deleted.............");
			break;
			
			case 5 :
			cd.search(con);
			System.out.println("This is the searched record............");
			break;
			
			case 6 : 
			System.exit(0);
			break;
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	
}
