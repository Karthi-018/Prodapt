package FilterValidation;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterValid extends HttpFilter{
	
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		if(req.getParameter("uname").equals("Admin") && req.getParameter("password").equals("Reset@123") )
		/*if(req.getParameter("uname").equals("Admin") )
			if(req.getParameter("password").equals("Reset@123") ) */
		{
			chain.doFilter(req, res);
		}
		
		else
		{
			//res.sendRedirect("Valid.html");
  		//req.getRequestDispatcher("Valid.html").forward(req, res);
		
			//res.setContentType("image/html");
  		
  		req.getRequestDispatcher("Valid.html").include(req, res);
  		res.getWriter().println("Invalid Credentials");
  		
		}
	}
}
