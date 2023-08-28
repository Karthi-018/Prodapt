package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterDemo extends HttpFilter implements Filter {
       
   
    public FilterDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see FilterDemo#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	//filter-to validation for security
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		String uname=request.getParameter("name");
		String pass=request.getParameter("password");
		if(uname.equals("Loki") & pass.equals("reset@123"))
		{
			request.setAttribute("name", uname);
			request.getRequestDispatcher("ServletOne").forward(request,response);
			
		}
		else
		{
			response.sendRedirect("index.html");
		}
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	
}
