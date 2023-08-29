package edu.training.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.training.model.Product;
import edu.training.repo.DaoClass;

public class ProductService {
	
	public String addProduct(Product product)throws SQLException
	{
		Connection con = DaoClass.getConnection();
		
		PreparedStatement ps = con.prepareStatement("insert into Product values(?,?,?,?,?)");
		ps.setInt(1, product.getPid());
		ps.setString(2, product.getpName());
		ps.setString(3, product.getpDesc());
		ps.setDouble(4, product.getpPrice());
		ps.setInt(5,product.getpQty());
		int temp = ps.executeUpdate();
		
		return "Product Created ";
	}
	
	public String deleteProduct(int pid)
	{
		return "Product Deleted";
	}
	
	public List<Product> viewProduct() throws SQLException
	{
		List<Product> productList = new ArrayList<Product>();
		Connection con = DaoClass.getConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from product");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			productList.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5)));
		}
		
		
		return productList;
	}

}
