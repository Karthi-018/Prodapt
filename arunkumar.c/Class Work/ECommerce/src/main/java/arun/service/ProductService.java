package arun.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContext;

import arun.model.Product;

public class ProductService {
	
	public Product save(Product product, ServletContext context) {
		try {
			Class.forName(context.getInitParameter("driver"));
			Connection con = DriverManager.getConnection(context.getInitParameter("url"),context.getInitParameter("username"),context.getInitParameter("password"));
			PreparedStatement ps = con.prepareStatement("INSERT INTO products VALUES(?,?,?,?,?)");
			ps.setInt(1,product.getId());
			ps.setString(2,product.getName());
			ps.setString(3,product.getDescription());
			ps.setInt(4,product.getPrice());
			ps.setInt(5,product.getQuantity());
			int result = ps.executeUpdate();
			if(result>0) {
				return product;
			}
			return null;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Already exist");
			return null;
		}
	}

	public ArrayList<Product> findAll(ServletContext context) throws ClassNotFoundException, SQLException {
		Class.forName(context.getInitParameter("driver"));
		Connection con = DriverManager.getConnection(context.getInitParameter("url"),context.getInitParameter("username"),context.getInitParameter("password"));
		PreparedStatement ps = con.prepareStatement("SELECT * FROM products");
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> products = new ArrayList<Product>();
		while(rs.next()) {
			products.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)));
		}
		return products;
	}
}
