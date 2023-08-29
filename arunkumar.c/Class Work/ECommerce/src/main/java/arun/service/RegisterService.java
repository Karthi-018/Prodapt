package arun.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;

import arun.model.Customer;

public class RegisterService {
	public Customer save(Customer customer,ServletContext context) {
		try {
			Class.forName(context.getInitParameter("driver"));
			Connection con = DriverManager.getConnection(context.getInitParameter("url"),context.getInitParameter("username"),context.getInitParameter("password"));
			PreparedStatement ps = con.prepareStatement("INSERT INTO customers VALUES(?,?,?,?,?)");
			ps.setInt(1,customer.getId());
			ps.setString(2,customer.getName());
			ps.setString(3,customer.getEmail());
			ps.setString(4,customer.getPhone());
			ps.setString(5,customer.getPassword());
			int result = ps.executeUpdate();
			if(result>0) {
				return customer;
			}
			return null;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Already exist");
			return null;
		}
	}
	
}
