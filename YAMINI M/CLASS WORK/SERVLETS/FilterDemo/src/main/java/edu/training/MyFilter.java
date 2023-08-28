package edu.training;
import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFilter extends HttpFilter {
	
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		if(req.getParameter("uName").length()>=3)
		{
			//System.out.println("Via Filter calling Servlet");
		chain.doFilter(req, res);
		}
		else
		{
			res.sendRedirect("index.html");
//			req.getRequestDispatcher("index.html").forward(req, res);
		}
	}

}
