package edu.training.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.connection.Conn;
import edu.training.model.Product;



public class AddProducts  {
	Connection con=Conn.getConnection();
	PreparedStatement ps;
	ResultSet rs;
	public String addProduct(Product product) throws SQLException {
		ps=con.prepareStatement("insert into products values(?,?,?,?,?)");
		ps.setInt(1,product.getpId());
		ps.setString(2,product.getpName());
		ps.setString(3, product.getpDesc());
		ps.setDouble(4,product.getpPrice());
		ps.setInt(5, product.getpQuantity()); 
		int temp=ps.executeUpdate();
		return "Insertion Successful";
		
	}
//	public String viewProduct()
	public List<Product> viewProduct() throws SQLException 
	{	
		List<Product> productList=new ArrayList<>();
		ps=con.prepareStatement("select * from products");
		rs=ps.executeQuery();
		while(rs.next()) {
			productList.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
		}
		return productList;
		
	}
	
	public List<Product> editProductDetails(Double updatePrice,int updateQuantity,int pid) throws SQLException {
		System.out.println(updatePrice);
		System.out.println(updateQuantity);
		System.out.println(pid);

		ps=con.prepareStatement("update products set pPrice=?,pQuantity=? where pId=?");
		ps.setDouble(1, updatePrice);
		ps.setInt(2, updateQuantity);
		ps.setInt(3, pid);
		int temp=ps.executeUpdate();
		
		List<Product> editList=new ArrayList<>();
		editList=viewProduct();
//		ps=con.prepareStatement("select * from products");
//		rs=ps.executeQuery();
//		while(rs.next()) {
//			editList.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)));
//		}
		return editList;
		
	}
	
	public String deleteProduct(int pid) throws SQLException {
		ps=con.prepareStatement("delete from products where pId=?");
		ps.setInt(1, pid);
		int temp=ps.executeUpdate();
		return "DELETION Successful";

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	Connection con=Conn.getConnection();
//	public void init(ServletConfig config) throws ServletException {
//		
//		Connection con=Conn.getConnection();
//		System.out.println("SUCCESSFUL CONNECTION!");
//	}
//
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//		PrintWriter pw=response.getWriter();
////		String pName,pDesc;
////		int pid=Integer.parseInt(request.getParameter("pid"));
////		pName=request.getParameter("pname");
////		pDesc=request.getParameter("pdesc");
////		double pPrice=Double.parseDouble(request.getParameter("pprice"));
////		int pQuantity=Integer.parseInt(request.getParameter("pquantity"));
////		System.out.println(pid);
//		PreparedStatement ps=con.prepareStatement("insert into products values(?,?,?,?,?)");
//		
//		int temp=ps.executeUpdate();
//		if(temp>0) {
//			pw.println("PRODUCT ADDED TO THE DATABASE SUCCESSFULLY");
//			request.getRequestDispatcher("addProduct.jsp").include(request, response);
//		}
//		else {
//			response.setContentType("text/html");
//			pw.println("<b style='color:red'>INVALID PRODUCT DETAILS! TRY AGAIN</b>");
//			request.getRequestDispatcher("addProduct.jsp").include(request, response);         
//         
//			
//		}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//
//		
//	}
//	public void destroy() {
//	}

}
