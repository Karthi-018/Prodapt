package edu.training.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import edu.training.model.Customer;
import edu.training.model.Daoclass;
import edu.training.model.Product;

public class RegisterService {
	
	public void registercustomer(Customer c) throws SQLException {
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		
			PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?,?,?)");
			ps.setString(1,c.getName());
			ps.setDate(2,c.getDob());
			ps.setString(3,c.getEmail());
			ps.setString(4,c.getPhno());
			ps.setString(5,c.getAdd());
			ps.setString(6,c.getPwd());
		
			ps.executeUpdate();
		}
	public List<Customer> viewcustomer() throws SQLException{
		List<Customer>list=new ArrayList<>();
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		PreparedStatement ps=con.prepareStatement("select * from customer");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			list.add(new Customer(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
		}
		
		return list;
		
		
	}
	public List<Customer> userapproved()throws SQLException{
		List<Customer>approved=new ArrayList<>();
		
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		PreparedStatement ps=con.prepareStatement("select * from customer");
		ResultSet rs=ps.executeQuery(); 
		while(rs.next()) {
			
			 
			approved.add(new Customer(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
		}
		
		return approved;
		
	}

}
