package edu.training.Service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAOClass {
	static Connection con=null;
	public static Connection getConnect() {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;
	}

}
