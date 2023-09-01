package edu.training.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/addProduct")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("adminChoice").equals("ADD PRODUCT")) {
			request.getRequestDispatcher("addProduct.jsp").forward(request, response);
		}
		else if (request.getParameter("adminChoice").equals("VIEW PRODUCT")){
			request.getRequestDispatcher("ViewProductsController").forward(request, response);
		}
		else if (request.getParameter("adminChoice").equals("LOGOUT")){
			request.getRequestDispatcher("Homepage.jsp").forward(request, response);
		}
//		else if (request.getParameter("adminChoice").equals("VIEW CUSTOMERS")){
//			request.getRequestDispatcher("Homepage.jsp").forward(request, response);
//		}
		
	}
	public void destroy()
	{
		
	}

}
