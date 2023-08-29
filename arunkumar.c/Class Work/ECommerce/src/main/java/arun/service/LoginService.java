package arun.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;

public class LoginService {
	
	public String getRole(String uname, String pass,ServletContext context) {
		
		try {
			
			if(uname.equals("shanu") && pass.equals("shanu123")) {
				return "admin";
			}
			else {
				Class.forName(context.getInitParameter("driver"));
				Connection con = DriverManager.getConnection(context.getInitParameter("url"),context.getInitParameter("username"),context.getInitParameter("password"));
				PreparedStatement ps = con.prepareStatement("SELECT * FROM customers WHERE email=? and password=?;");
				ps.setString(1,uname);
				ps.setString(2,pass);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					return "user";
				}
				else {
					return "nobody";
				}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("errr");
			return "err";
		}
	}

}
