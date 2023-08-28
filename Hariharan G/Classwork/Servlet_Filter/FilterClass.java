package FilterDemo;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterClass extends HttpFilter
{
	public void doFilter(HttpServletRequest request,HttpServletResponse response,FilterChain chain) throws IOException, ServletException {
		String fname,lname;
		fname=request.getParameter("fname");
		lname=request.getParameter("lname");
		System.out.println(fname);
		System.out.println(lname);
		request.getSession().setAttribute("fn",fname);
		request.getSession().setAttribute("ln",lname);

		if(fname.length()>3 && lname.length()>3) {
//			request.getRequestDispatcher("Servlet1").forward(request,response);
//			response.sendRedirect("Servlet1");
			chain.doFilter(request, response);
			
		}
		else {
			response.sendRedirect("index.html");
		}
	}

}
