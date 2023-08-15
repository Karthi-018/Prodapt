package crudJdbc;

import java.sql.*;
import java.util.*;

public class crudMain
{
	static connection connect = new connection();
	static Connection con = connect.createConnection();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws SQLException,NullPointerException
	{
		System.out.println("*******Welcome to Employee Record********");
		boolean loop=true;
		do
		{
				
			System.out.println("1.Create");
			System.out.println("2.Search");
			System.out.println("3.Update");
			System.out.println("4.Display all employee's details");
			System.out.println("5.Delete");
			System.out.println("6.Exit");
			System.out.println("Select your option");
			int option = s.nextInt();
			
			ServiceCrud service = new ServiceCrud();
			
			switch(option) 
			{
				case 1:														//creating
				
				System.out.println("Creating...");
				service.create(con);
				
				break;
//------------------------------------------------------------------------------------------------				
				
				case 2:														//searching
				
				System.out.println("Searching...");
				System.out.println("Enter your Id to search");
				crudJDBC crud = service.findId(s.nextInt(),con);
				
				if(crud == null) 
				{
					
					System.out.println("Id not found");
					
				}
				
				else 
				{
					
					System.out.println(crud);
					
				}
				
				break;
//----------------------------------------------------------------------------------------------------				
				
				case 3:														//updating
				
					System.out.println("Updating...");
					service.update(con);
					break;
//-----------------------------------------------------------------------------------------------------					
				
				case 4:														//displaying all the record
				
					System.out.println("Displaying...");
					service.display(con);	
					break;
//-----------------------------------------------------------------------------------------------------
				
				case 5:														//deleting
				
					System.out.println("Deleting...");
					service.delete(con);
					break;
//------------------------------------------------------------------------------------------------------				
			
				case 6:														//exit	
				
					loop=false;
					break;
			}
			
		}
		while(loop);
	}

}
