package edu.training.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.model.Prod_Cus;
import edu.training.model.Product;
import edu.training.service.ProductService;


@WebServlet("/SearchproductController")
public class SearchproductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pname=request.getParameter("pname");
		ProductService ps=new ProductService();
		try {
	        List<Product> search=ps.searchproduct(pname);
	        request.setAttribute("search", search);
	        
	         
	         RequestDispatcher rd=request.getRequestDispatcher("searchforproduct.jsp");
		     rd.forward(request, response);
		
		
	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
