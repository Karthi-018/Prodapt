package FiltDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ft extends HttpFilter
{
	public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain c) throws IOException, ServletException
	{
		System.out.println(req.getParameter("password"));
		PrintWriter out = res.getWriter();
		RequestDispatcher rd;
		if(req.getParameter("password").length() >= 8)
		{
			rd=req.getRequestDispatcher("LoginAfterReg.html");
			rd.forward(req, res);
			c.doFilter(req, res);
		}
		else
		{
			rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
			res.setContentType("text/html");
			out.println("<center><h3>Enter a password with atleast 8 characters</h3></center>");
		}
	}
}
