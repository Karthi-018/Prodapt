package edu.training.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.model.Product;
import edu.training.service.ProductService;

/**
 * Servlet implementation class Productcontroller
 */
@WebServlet("/Productcontroller")
public class Productcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Product p=(Product)request.getAttribute("obj");
		ProductService ps=new ProductService();
		try {
			ps.addproduct(p);
			 response.setContentType("text/html");
			 response.getWriter().println("<b style='color:green'>Added successfully</b>");
			 RequestDispatcher rd=request.getRequestDispatcher("addproduct.jsp");
			 rd.include(request, response);
			//response.getWriter().println("added successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

	

}
