package arun.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arun.model.Product;
import arun.service.ProductService;
@WebServlet("/editProduct")
public class EditProduct extends HttpServlet{
	ServletContext context;
	public void init() {
		context = getServletContext();
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		try {
			Class.forName(context.getInitParameter("driver"));
			Connection con = DriverManager.getConnection(context.getInitParameter("url"),context.getInitParameter("username"),context.getInitParameter("password"));
			PreparedStatement ps = con.prepareStatement("UPDATE products SET price=?,quantity=? WHERE id=?;");
			int price = Integer.parseInt(req.getParameter("price"));
			int quantity = Integer.parseInt(req.getParameter("quantity"));
			int id = Integer.parseInt(""+req.getSession().getAttribute("productid"));
			ps.setInt(1, price);
			ps.setInt(2, quantity );
			ps.setInt(3, id);
			int result = ps.executeUpdate();
			ArrayList<Product> products = new ProductService().findAll(context);
			req.setAttribute("products", products);
			RequestDispatcher rd = req.getRequestDispatcher("viewproduct.jsp");
			rd.forward(req, res);
		} 
		catch (ClassNotFoundException | SQLException e) {
			System.out.println("no update exist");
		}
	}
}
