package edu.training.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Daoclass {
	Connection con;
	public Connection connect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
				
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
		
	}

}
