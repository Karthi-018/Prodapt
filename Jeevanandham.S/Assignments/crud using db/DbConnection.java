package edu.prodapt.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {
	
	Connection con;
	
	
	public Connection createConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			System.out.println("Connection successfull");
			
		} 
		
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return con;
	}
	
	
	
	public void  closeConnection() {
		
		try {
			
			con.close();
			System.out.println("Connection closed successfully");
			
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	

}
