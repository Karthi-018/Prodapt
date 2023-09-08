package edu.training.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.training.model.Product;
import edu.training.repo.DAOclass;

public class ProductService {
	
	public String addProduct(Product product)throws SQLException
	{
		Connection con = DAOclass.getConnection();
		
		PreparedStatement ps = con.prepareStatement("insert into products values(?,?,?,?,?);");
		ps.setInt(1, product.getPid());
		ps.setString(2, product.getPname());
		ps.setString(3, product.getPdesc());
		ps.setDouble(4, product.getPrice());
		ps.setInt(5,product.getPquantity());
		int temp = ps.executeUpdate();
		
		return "Product Created";
	}
	
		
	public List<Product> viewProduct() throws SQLException
	{
		List<Product> productList = new ArrayList<Product>();
		Connection con = DAOclass.getConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from products;");
		
		ResultSet rs = ps.executeQuery();


		while(rs.next())
		{
			productList.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5)));
		}
		
		
		return productList;
	}


	public String edit(int pid,double price,int quantity)

	    {

	        Connection con=DAOclass.getConnection();

	        PreparedStatement ps=null;

	        

	        try {

	            ps = con.prepareStatement("update products set price=?,pquantity=? where pid=?");

	            ps.setDouble(1,price );  

	            ps.setInt(2, quantity);

	            ps.setInt(3, pid);

	            ps.executeUpdate();
        
        
	        } catch (SQLException e) {

	            e.printStackTrace();

	        }
    

	         return "Edited successfully";
	    }
 
	    public String delete(int id) {

	        Connection con=DAOclass.getConnection();

	        PreparedStatement ps=null;

	        try {

	            ps=con.prepareStatement("delete from products where pid=?");
	            ps.setInt(1, id);
	            ps.executeUpdate();

	        } catch (SQLException e) {

	            e.printStackTrace();

	        }

	        return "Deleted successfully";
	    }

	}

