package edu.training.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.training.service.AddProducts;

/**
 * Servlet implementation class DeleteProductController
 */
@WebServlet("/DeleteProductController")
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
	}

	
	public void destroy() {
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setAttribute("eid",request.getParameter("deleteid"));
		AddProducts ad=new AddProducts();
		try {
			String result=ad.deleteProduct(Integer.parseInt(request.getParameter("deleteid")));
			response.setContentType("text/html");
			
			response.getWriter().println("<h1><b style='color:green'>Product Deleted</b></h1>");
			request.getRequestDispatcher("ViewProductsController").include(request, response);
		} 
		catch (NumberFormatException | SQLException e) {
			response.getWriter().println("Product not deleted");
		}
	}

}
