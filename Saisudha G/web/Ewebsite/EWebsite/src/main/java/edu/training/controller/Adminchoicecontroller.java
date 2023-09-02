package edu.training.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Adminchoicecontroller
 */
@WebServlet("/Adminchoicecontroller")
public class Adminchoicecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Adminopr =request.getParameter("Admin");
		if(Adminopr.equals("Add Product")) {
			RequestDispatcher rd=request.getRequestDispatcher("addproduct.jsp");
			rd.forward(request, response);
		}
		if(Adminopr.equals("UserAcess control")) {
			RequestDispatcher rd=request.getRequestDispatcher("Useracesscontroller");
			rd.forward(request, response);
		}
		
		else {
			RequestDispatcher rd=request.getRequestDispatcher("Viewproductcontroller");
			rd.forward(request, response);
		}
	}

	

}
