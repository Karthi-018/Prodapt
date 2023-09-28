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
import edu.training.service.Prod_CusService;
import edu.training.service.ProductService;

@WebServlet("/Viewcartcontroller")
public class Viewcartcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		Prod_CusService p_c=new Prod_CusService();
		try {
	         List<Prod_Cus>cart=p_c.viewCart(uname);
	         request.setAttribute("cart", cart);
	         
	         RequestDispatcher rd=request.getRequestDispatcher("viewCart.jsp");
		     rd.forward(request, response);
		
		
	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
