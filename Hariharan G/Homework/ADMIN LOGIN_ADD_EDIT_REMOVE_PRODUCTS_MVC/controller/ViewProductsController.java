package edu.training.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.training.connection.Conn;
import edu.training.model.Product;
import edu.training.service.AddProducts;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewProductsController
 */
@WebServlet("/ViewProductsController")
public class ViewProductsController extends HttpServlet {
	Connection con=Conn.getConnection();
	PreparedStatement ps;
	ResultSet rs;
	
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		
		AddProducts ad=new AddProducts();
		List<Product>l=ad.viewProduct();
		request.setAttribute("viewList",l);
		request.getRequestDispatcher("viewProducts.jsp").forward(request, response);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
