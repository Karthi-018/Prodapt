package edu.Session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession session=req.getSession();
		res.setContentType("text/html");
		session.setAttribute("username",req.getParameter("uname"));
		RequestDispatcher rd=req.getRequestDispatcher("/secondserv");
		rd.forward(req, res);
	}

}
