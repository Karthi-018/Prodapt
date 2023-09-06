package servlet.demos.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.demos.model.ProductDataModel;
import servlet.demos.model.UserDataModel;
import servlet.demos.service.AdminService;

/**
 * Servlet implementation class UserViewControl
 */
@WebServlet("/UserViewControl")
public class UserViewControl extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		AdminService ps=new AdminService();
		  List<UserDataModel> ul=ps.ViewUser();
		  System.out.println(ul);
		  req.setAttribute("userlist",ul);
		res.getWriter().println("user display");
		RequestDispatcher rd=req.getRequestDispatcher("UserView.jsp");
		rd.forward(req, res);
	}
	}


