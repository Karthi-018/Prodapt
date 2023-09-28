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
		
			PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			ps.setString(1,c.getName());
			ps.setDate(2,c.getDob());
			ps.setString(3,c.getEmail());
			ps.setString(4,c.getPhno());
			ps.setString(5,c.getAdd());
			ps.setString(6,c.getPwd());
			ps.setString(7,c.getStatus());
			ps.executeUpdate();
		}
	public List<Customer> viewTobeApproved() throws SQLException{
		List<Customer>TobeApproved=new ArrayList<>();
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		PreparedStatement ps=con.prepareStatement("select * from customer where status='TobeApproved'");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			TobeApproved.add(new Customer(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
		}
		
		return TobeApproved;
		
		
	}
	public void userapproved(String Name)throws SQLException{
		
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		PreparedStatement ps=con.prepareStatement("update customer set status='Approved' where name=?");
		ps.setString(1,Name);
		ps.executeUpdate(); 
		//System.out.println(Name);
		
	}
public void userremoved(String Name)throws SQLException{
		
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		PreparedStatement ps=con.prepareStatement("delete from customer where name=?");
		ps.setString(1,Name);
		ps.executeUpdate(); 
		System.out.println(Name);
		
	}
public List<Customer> viewApproved() throws SQLException{
	List<Customer> Approved=new ArrayList<>();
	Daoclass d=new Daoclass();
	Connection con=d.connect();
	PreparedStatement ps=con.prepareStatement("select * from customer where status='Approved'");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		Approved.add(new Customer(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
	}
	
	return Approved;
	
	
}
public void userTobeApproved(String Name)throws SQLException{
	
	Daoclass d=new Daoclass();
	Connection con=d.connect();
	PreparedStatement ps=con.prepareStatement("update customer set status='TobeApproved' where name=?");
	ps.setString(1,Name);
	ps.executeUpdate(); 
	//System.out.println(Name);
	
}
public boolean isValidCustomer(String uname,String pwd) throws SQLException {
	Daoclass d=new Daoclass();
	Connection con=d.connect();
	PreparedStatement ps=con.prepareStatement("select*from customer where email=? AND pwd=? AND status='Approved'");
	ps.setString(1,uname);
	ps.setString(2,pwd);

	ResultSet results=ps.executeQuery();
	return results.next();
	
}

}
