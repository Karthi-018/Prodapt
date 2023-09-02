package edu.training.filters;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import edu.training.model.Daoclass;

/**
 * Servlet Filter implementation class LoginvalidationFilter
 */
@WebFilter("/LoginvalidationFilter")
public class LoginvalidationFilter extends HttpFilter implements Filter {
       
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try {
			
			
			if((request.getParameter("pwd").equals("123"))&&(request.getParameter("uname").equals("Admin"))){
				request.getRequestDispatcher("index.jsp").forward(request, response);
				chain.doFilter(request, response);
			}
			else {
				response.setContentType("text/html");
				response.getWriter().println("<b style='color:red'>Invalid</b>");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
			
		}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}

	

}
