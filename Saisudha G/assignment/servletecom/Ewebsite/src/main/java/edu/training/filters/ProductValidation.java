package edu.training.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import edu.training.model.Daoclass;
import edu.training.model.Product;

/**
 * Servlet Filter implementation class ProductValidation
 */
@WebFilter("/Productcontroller")
public class ProductValidation extends HttpFilter implements Filter {
       
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String id=request.getParameter("Pid");
		int Id=Integer.parseInt(id);
		String name=request.getParameter("Pname");
		String des=request.getParameter("Pdes");
		double price=Double.parseDouble(request.getParameter("Pprice"));
		
		String qty=request.getParameter("Pqty");
		int q=Integer.parseInt(qty);
		
		if((price != 0)&&(q>0)&& (name.length()>3)){
			Product p=new Product(Id,name,des,price,q);
			request.setAttribute("obj",p );
			
			
		chain.doFilter(request, response);
	}
		else {
			response.setContentType("text/html");
			response.getWriter().println("<b style='color:red'>Invalid</b>");
			RequestDispatcher rd=request.getRequestDispatcher("addproduct.jsp");
			rd.include(request, response);
		}
			
		}

	
}
