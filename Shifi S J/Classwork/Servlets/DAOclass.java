package edu.training.repo;
import java.sql.Connection;
import java.sql.DriverManager;
public class DAOclass {
		
		
		public static Connection getConnection()
		{
			Connection con = null;
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "root");
				System.out.println("gggg");
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
			return con;
		}

	}
