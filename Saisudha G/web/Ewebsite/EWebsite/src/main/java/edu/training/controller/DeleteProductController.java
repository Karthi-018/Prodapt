package edu.training.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.training.model.Daoclass;
import edu.training.model.Product;
import edu.training.service.ProductService;


@WebServlet("/DeleteProduct")
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session=request.getSession();
		 
		int id=Integer.parseInt(request.getParameter("id"));
		ProductService ps=new ProductService();
		ps.deleteproduct(id);
	    response.setContentType("text/html");
	    response.getWriter().println("<b style='color:green'>deleted successfully</b>");
	    RequestDispatcher rd=request.getRequestDispatcher("Viewproductcontroller");
	    rd.include(request, response);
		//response.getWriter().println("deleted successfully");
		 
		
		
		
		
		
	}

}
