package edu.training.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.training.model.Daoclass;
import edu.training.model.Product;

public class ProductService {
	

	public void addproduct(Product p) throws SQLException {
		
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?,?)");
			ps.setInt(1,p.getPid());
			ps.setString(2,p.getPname());
			ps.setString(3,p.getPdes());
			ps.setString(4,p.getPprice());
			ps.setInt(5,p.getPqty());
		
			ps.executeUpdate();
			

		
	}
	public List<Product> viewproduct() throws SQLException{
		List<Product>list=new ArrayList<>();
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		PreparedStatement ps=con.prepareStatement("select * from product");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			list.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
		}
		
		return list;
		
		
	}
	public boolean editproduct(int id1,String price1,int qty1) {
		try { 
			Daoclass d=new Daoclass(); 
			Connection con=d.connect();
			PreparedStatement ps=con.prepareStatement("Update product set Pprice=?,Pqty=? where Pid=? ");
			 ps.setString(1,price1); 
			 ps.setInt(2,qty1); 
			 ps.setInt(3,id1);
			 int temp=ps.executeUpdate(); 
			 return true;
			
			 }
			 catch (SQLException e) 
			 {
			 e.printStackTrace(); 
			 return false;
			 }
		
	}
	public void deleteproduct(int id) {
		
		
		  try { 
			  Daoclass d=new Daoclass(); 
			  Connection con=d.connect(); 
			  PreparedStatement ps=con.prepareStatement("delete from product where Pid=? ");
		  ps.setInt(1,id); 
		  ps.executeUpdate();
		  
		  } 
		  catch (SQLException e) 
		  {  e.printStackTrace(); }
	}
	

}

