package servlet.demos.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adminpage")
public class AdminChoiceControl extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 if(request.getParameter("opr").equals("AddProduct"))	
		  {
			  RequestDispatcher rd=request.getRequestDispatcher("AddProduct.jsp");
			  rd.forward(request, response);
		  }
		  else if(request.getParameter("opr").equals("viewproduct"))
		  {
			  
			  
	    	  RequestDispatcher rd=request.getRequestDispatcher("/ProductViewControl");
	     	  rd.forward(request, response);
		  }
		  else
		  {
			  RequestDispatcher rd=request.getRequestDispatcher("/UserViewControl");
	     	  rd.forward(request, response);
		  }
	}

}
