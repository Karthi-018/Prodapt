package edu.training.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.training.model.Customer;
import edu.training.model.Daoclass;
import edu.training.model.Prod_Cus;
import edu.training.model.Product;

public class ProductService {
	

	public void addproduct(Product p) throws SQLException {
		
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?,?)");
			ps.setInt(1,p.getPid());
			ps.setString(2,p.getPname());
			ps.setString(3,p.getPdes());
			ps.setDouble(4,p.getPprice());
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
			list.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
		}
		
		return list;
		
		
	}
	public boolean editproduct(int id1,double price1,int qty1) {
		try { 
			Daoclass d=new Daoclass(); 
			Connection con=d.connect();
			PreparedStatement ps=con.prepareStatement("Update product set Pprice=?,Pqty=? where Pid=? ");
			 ps.setDouble(1,price1); 
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
	public void addTocart(Prod_Cus pc) throws SQLException {

		Daoclass d=new Daoclass();
		Connection con=d.connect();
		
			PreparedStatement ps=con.prepareStatement("insert into prod_cus values(?,?,?,?,?,?)");
		
			ps.setString(1,pc.getName());
			ps.setString(2,pc.getpwd());
			ps.setInt(3,pc.getPid());
			ps.setString(4,pc.getPname());
			ps.setDouble(5,pc.getPprice());
			ps.setInt(6,pc.getPqty());
			
			
			ps.executeUpdate();
		
	}
	public List<Product> addtoWishList(String pname) throws SQLException{
		List<Product> WishList=new ArrayList<>();
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		PreparedStatement ps=con.prepareStatement("select*from product where Pname=?");
		ps.setString(1, pname);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			WishList.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
		}
		

		
		return WishList;
		
	}
	public List<Product> searchproduct(String pname) throws SQLException {
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		List<Product> search=new ArrayList<>();
		PreparedStatement ps=con.prepareStatement("select*from product where Pname=?");
		ps.setString(1, pname);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			search.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
			
		}
		return search;
		
	}
	public  List<Product> getProductsbyId(int pid) throws SQLException{
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		List<Product> getProductsbyId=new ArrayList<>();
		PreparedStatement ps=con.prepareStatement("select*from product where pid=?");
		ps.setInt(1, pid);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			getProductsbyId.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
			
		}
		return getProductsbyId;
		
		
		
	}
	
}

