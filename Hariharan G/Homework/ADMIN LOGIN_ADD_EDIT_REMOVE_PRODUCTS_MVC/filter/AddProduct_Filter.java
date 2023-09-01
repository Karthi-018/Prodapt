package edu.training.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import edu.training.connection.Conn;

/**
 * Servlet Filter implementation class AddProduct_Filter
 */
@WebFilter("/addProducts")
public class AddProduct_Filter extends HttpFilter implements Filter {
	Connection con=Conn.getConnection();
	PreparedStatement ps;
	ResultSet rs;
	
	
	

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		try {
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		double pprice=Double.parseDouble(request.getParameter("pprice"));
		int pquantity=Integer.parseInt(request.getParameter("pquantity"));
		ps=con.prepareStatement("select * from products where pId=?");
		ps.setInt(1,pid);
		rs=ps.executeQuery();
		PrintWriter pw=response.getWriter();
		if(rs.next() && pname.length()<3 && pprice<=0 && pquantity<0) {
			response.setContentType("text/html");
			pw.println("<b style='color:red'>INVALID PRODUCT DETAILS! TRY AGAIN</b>");
			request.getRequestDispatcher("addProduct.jsp").include(request, response);    
		}
//		else if(pname.length()<3) {
//			response.setContentType("text/html");
//			pw.println("<b style='color:red'>INVALID PRODUCT DETAILS! TRY AGAIN</b>");
//			request.getRequestDispatcher("addProduct.jsp").include(request, response);    
//		}
//		else if(pprice<=0) {
//			response.setContentType("text/html");
//			pw.println("<b style='color:red'>INVALID PRODUCT DETAILS! TRY AGAIN</b>");
//			request.getRequestDispatcher("addProduct.jsp").include(request, response);    
//		}
//		else if(pquantity<0) {
//			response.setContentType("text/html");
//			pw.println("<b style='color:red'>INVALID PRODUCT DETAILS! TRY AGAIN</b>");
//			request.getRequestDispatcher("addProduct.jsp").include(request, response);    
//		}
		else {
			request.getRequestDispatcher("ProductController").forward(request, response);    

		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		chain.doFilter(request, response);
	}

		public void init(FilterConfig fConfig) throws ServletException {
	}
		public void destroy() {
		}

}
