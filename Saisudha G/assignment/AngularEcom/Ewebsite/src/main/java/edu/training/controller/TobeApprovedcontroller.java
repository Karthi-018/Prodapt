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
import javax.servlet.http.HttpSession;

import edu.training.model.Customer;
import edu.training.service.RegisterService;


@WebServlet("/TobeApproved")
public class TobeApprovedcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterService rs=new RegisterService();
		HttpSession session=request.getSession();
		try {
	         List<Customer>TobeApproved=rs.viewTobeApproved();
	        session.setAttribute("control", TobeApproved);
	         RequestDispatcher rd=request.getRequestDispatcher("newuserapproval.jsp");
		     rd.forward(request, response);
		
		
	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

}
