package edu.training.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.training.model.Daoclass;
import edu.training.model.Prod_Cus;
import edu.training.model.Product;

public class Prod_CusService {
	public List<Prod_Cus> viewCart(String uname) throws SQLException{
		List<Prod_Cus> cart=new ArrayList<>();
		Daoclass d=new Daoclass();
		Connection con=d.connect();
		PreparedStatement ps=con.prepareStatement("select * from prod_cus where uname=?");
		ps.setString(1,uname);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			cart.add(new Prod_Cus(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getDouble(5),rs.getInt(6)));
		}
		
		return cart;
		
		
	}
	public void deletecusproduct(int pid) {
		
		
		  try { 
			  Daoclass d=new Daoclass(); 
			  Connection con=d.connect(); 
			  PreparedStatement ps=con.prepareStatement("delete from prod_cus where Pid=? ");
		      ps.setInt(1,pid); 
		      ps.executeUpdate();
		  
		  } 
		  catch (SQLException e) 
		  {  e.printStackTrace(); }
	}
	public int gettotalquantity() {
		int totalquantity=0;
		List<Prod_Cus> cart=new ArrayList<>();
		for(Prod_Cus q:cart) {
			totalquantity+=q.getPqty();
		}
		
		return totalquantity;
		
	}
	public double gettotalamount() {
		double totalamount=0.0;
		List<Prod_Cus> cart=new ArrayList<>();
		for(Prod_Cus q:cart) {
			totalamount+=q.getPprice();
		}
		return totalamount;
	}

}
