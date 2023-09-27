package edu.training.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.service.Prod_CusService;


@WebServlet("/Deletecusproductcontroller")
public class Deletecusproductcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pid=Integer.parseInt(request.getParameter("pid"));
		Prod_CusService p_c =new Prod_CusService();
		p_c.deletecusproduct(pid);
		RequestDispatcher rd=request.getRequestDispatcher("Viewcartcontroller");
	    rd.include(request, response);
		
		
	}

}
