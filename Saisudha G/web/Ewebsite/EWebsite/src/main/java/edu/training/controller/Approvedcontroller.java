package edu.training.controller;

import java.io.IOException;
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


@WebServlet("/Approvedcontroller")
public class Approvedcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[]users=request.getParameterValues("user");
		String userIndexstr=request.getParameter("userIndex");
		HttpSession session=request.getSession();
		if(userIndexstr!=null) {
			int userIndex=Integer.parseInt(userIndexstr);
			
			if((users!=null) && (userIndex >=0) && (userIndex<users.length)) {
				String selectedAction=users[userIndex];
				if(selectedAction.equals("APPROVE")) {
					List<Customer> list=(List<Customer>) session.getAttribute("control");
					List<Customer> approved=(List<Customer>) session.getAttribute("approved");
					if (list != null && approved != null && userIndex < list.size()) {
	                    Customer approvedUser = list.remove(userIndex);
	                    approved.add(approvedUser);
	                }
	            } else if ("REMOVE".equals(selectedAction)) {
	                // Remove the user's details from the "control" list
	                List<Customer> controlList = (List<Customer>) request.getSession().getAttribute("control");

	                if (controlList != null && userIndex < controlList.size()) {
	                    controlList.remove(userIndex);
	                }
	            }
	        }
	    }

	   
	    RequestDispatcher rd = request.getRequestDispatcher("newuserapproval.jsp");
	    rd.forward(request, response);
	}}
				


