package edu.training.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

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

/**
 * Servlet implementation class Productcontroller2
 */
@WebServlet("/editproduct")
public class EditProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 HttpSession session=request.getSession();
		 
		 int id1=(int)session.getAttribute("id1");
		 double price1=Double.parseDouble(request.getParameter("price1")); 
		 int qty1=Integer.parseInt(request.getParameter("qty1")); 
		 
		 
		 ProductService ps=new ProductService();
		 
		 boolean temp=ps.editproduct(id1,price1,qty1);
		 if(temp) {
			 response.setContentType("text/html");
			 response.getWriter().println("<b style='color:green'>edited successfully</b>");
			 RequestDispatcher rd=request.getRequestDispatcher("Viewproductcontroller");
			 rd.include(request, response);
//			 response.getWriter().println("updated successfully");
		 }
		 else {
			    response.setContentType("text/html");
			    response.getWriter().println("<b style='color:green'>not updated</b>");
			    RequestDispatcher rd=request.getRequestDispatcher("Viewproductcontroller");
			    rd.include(request, response);
//			 response.getWriter().println("not updated");
			 
		 }
		 
		 
		}

}
