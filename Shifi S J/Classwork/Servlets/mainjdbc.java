package edu.prodapt.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main
{
	public static Connection getConnection()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shifi","root","root");
		}
		catch (ClassNotFoundException|SQLException e) 
		{
			e.printStackTrace();
		}
		return con;
	}
}