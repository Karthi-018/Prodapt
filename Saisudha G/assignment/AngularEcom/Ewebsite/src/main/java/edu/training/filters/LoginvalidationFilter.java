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

import edu.training.model.Customer;
import edu.training.model.Daoclass;
import edu.training.service.RegisterService;

/**
 * Servlet Filter implementation class LoginvalidationFilter
 */
@WebFilter("/LoginController")
public class LoginvalidationFilter extends HttpFilter implements Filter {
       
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try {
			String uname=request.getParameter("uname");
			String pwd=request.getParameter("pwd");
			String name=request.getParameter("name");
			RegisterService rs=new RegisterService();
				
			
			if(rs.isValidCustomer(uname,pwd)) {
				
				
				chain.doFilter(request, response);
			}
			else {
				response.setContentType("text/html");
				response.getWriter().println("<b style='color:red'>Contact Admin or create account</b>");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
			
		}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}

	

}
