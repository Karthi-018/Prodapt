package edu.prodapt.crud;

import java.sql.Connection; 
import java.sql.SQLException;
import java.util.Scanner;

public class MainCls {
	
	Scanner sc = new Scanner(System.in);
	DbConnection db = new DbConnection();
	Connection con = db.createConnection();
	
	
	
	public void options() throws SQLException {
		
		System.out.println("1. Create");
		System.out.println("2. Search");
		System.out.println("3. Update");
		System.out.println("4. Display all employees");
		System.out.println("5. Delete");
		System.out.println("6. Exit");
		System.out.println("Select the options");
		int opt = sc.nextInt();
		performOperations(opt);
		
	}
	
	
	
	public void performOperations(int opt) throws SQLException {
		
		
		ServiceCls service = new ServiceCls();
		
		switch(opt) {
		
		case 1:
			
			System.out.println("*****Creating new Employee*****");
			service.create(con);
			options();
			break;
			
			
			
		case 2:
			
			System.out.println("*****Searching Employee*****");
			System.out.println("Enter the Id to search");
			Employee emp = service.searchId(sc.nextInt(),con);
			
			if(emp == null) {
				
				System.out.println("Id not found :(");
				
			}
			
			else {
				
				System.out.println(emp);
				
			}
			
			options();
			break;
			
			
			
		case 3:
			
			System.out.println("*****Updating Employee*****");
			service.update(con);
			options();
			break;
			
			
			
		case 4:
			
			System.out.println("*****Displaying all Employees*****");
			service.display(con);
			options();
			break;
			
			
			
		case 5:
			
			System.out.println("*****Deleting Employee*****");
			service.delete(con);
			options();
			break;
			
			
			
		case 6:
			
			db.closeConnection();
			System.exit(0);
			
			
		}
	}
	
	
		
	
	public static void main(String[] args) throws SQLException{
		
		
		MainCls mc = new MainCls();
		mc.options();	
		
	}

}
