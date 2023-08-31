package edu.training.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class RegisterationFilter
 */
@WebFilter("/login")
public class RegisterationFilter extends HttpFilter implements Filter {
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 	String name1 = request.getParameter("name1");
	        String name2 = request.getParameter("name2");
	        String email = request.getParameter("mail");
	        String mobile = request.getParameter("mobile");
	        String password =request.getParameter("password");
	        boolean isValid = validateInput(name1, name2, email, mobile, password);
	        if (!isValid) {
	            // If validation fails, you can choose to display an error message on the same page
	            request.setAttribute("registrationError", "Registration failed due to invalid data.");
	            request.getRequestDispatcher("register.jsp").include(request, response);
	            return;
	        }


		chain.doFilter(request, response);
	}

	private boolean validateInput(String name1, String name2, String email, String mobile, String password) {
		 boolean isValid = true;

	        if (name1 == null || name1.isEmpty() || name2 == null || name2.isEmpty()
	                || email == null || email.isEmpty() || mobile == null || mobile.isEmpty()
	                || password == null || password.isEmpty()) {
	            isValid = false;
	        }
		return isValid;
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
