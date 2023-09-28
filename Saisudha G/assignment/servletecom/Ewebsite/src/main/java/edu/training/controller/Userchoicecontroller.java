package edu.training.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Userchoicecontroller")
public class Userchoicecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Useropr=request.getParameter("useropr");
		if(Useropr.equals("WishList")) {
			
			
		}
		else if(Useropr.equals("AddtoCart")) {
			RequestDispatcher rd=request.getRequestDispatcher("AddtoCart");
			rd.forward(request, response);
			
		}
		else {
			
		}
		
	}

	
}
