package servlet.demos.filer;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class RegisterValidateFilter
 */
@WebFilter("/registerpage")
public class RegisterValidateFilter extends HttpFilter implements Filter {
       
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		String dob=request.getParameter("dob");
		  String arr[]=dob.split("-");
		  int year=Integer.parseInt(arr[0]);
		  System.out.println(year);
		  System.out.println("\n");
		  String email=request.getParameter("email");
		  String domain[]=email.split("@");
		  String tcl=domain[1];
		  System.out.println(domain[1]);
		  String comp[]=domain[1].split("[.]");
		  System.out.println(comp);
		  System.out.println(comp[0]+comp[1]);
//          String domain1=arr1[1];
//		  String domain2[]=domain1.split(".");
//		  String domain=domain2[1];
		  //System.out.println(domain);
		  if(year<=1999 & request.getParameter("cname").length()>3 & Pattern.matches("^[a-zA-Z0-9]{8,15}",request.getParameter("pw")) &(Pattern.matches("^[6-9]{1}+[0-9]{9}$", request.getParameter("mbn"))))
		  {
			  if(comp[1].equals("com")||comp[1].equals("in")||comp[1].equals("org"))
			  {
			  System.out.println("redirecting");
			  chain.doFilter(request, response);
			  }
		  }
		  else 
		  {
			  if(year>1999)
			    {
					response.getWriter().println("<h3 align=\"center\" style=\"color:red;\">\nyear of birth shoulb be berfor 2000\n");	
			    }
			  if(request.getParameter("cname").length()<3 ) 
				{	
					response.getWriter().println(" <h3 align=\"center\" style=\"color:red;\">name shoulb be greater than 3 charcters\n");	
		        }
			  if(!Pattern.matches("^[6-9]{1}+[0-9]{9}$", request.getParameter("mbn")))
				{
					response.getWriter().println("<h3 align=\"center\"style=\"color:red;\">number should start with 9 or 8 or 7 or 6</h3>");	
				}
			  if(!Pattern.matches("^[a-zA-Z0-9]{8,15}",request.getParameter("pw")))
						
				{
					response.getWriter().println("<h3 align=\"center\" style=\"color:red;\">password should be alphanueric and specialcase  min of 8 & max of 15 charcters</h3>");	
				}
			  if(!(comp[1].equals("com")||comp[1].equals("in")||comp[1].equals("org")))
			  {
				  response.getWriter().println("<h3 align=\"center\" style=\"color:red;\">email invalid</h3>"); 
			  }
			  response.setContentType("text/html");
			     RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
			    rd.include(request, response);
		  }
		
		
	}

}
