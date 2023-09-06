package servlet.demos.filer;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import servlet.demos.service.UserService;

/**
 * Servlet Filter implementation class LoginValidateFilter
 */
@WebFilter("/loginpage")
public class LoginValidateFilter extends HttpFilter implements Filter {
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		try {
		String username=request.getParameter("uname");
	    String password=request.getParameter("pw");
	    UserService us=new UserService();
	    if(username.equals("Admin") & password.equals("Reset@123"))
	    {
		  chain.doFilter(request, response);
	    }
	    
	    else if(us.UserValidation(username, password).equals("Approve"))
	    {
					RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
					rd.forward(request, response);
		}
	    else if(us.UserValidation(username, password).equals("Not-Approved"))
	    {
	    	response.setContentType("text/html");
	    	response.getWriter().println("<h2 align=\"center\" style=\"color:red;\">Not approved yet pls login after sometime pls refresh page and try</h2>");
	    	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
	    	
	    }
	    else
	    {
	    	response.setContentType("text/html");
	    	response.getWriter().println("<h2 align=\"center\" style=\"color:red;\">Invalid login</h2>");
	    	RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
	    }
	    System.out.println(us.UserValidation(username, password));
			
	    }catch(Exception e)
		{
	    	System.out.println(e);
		}
	}

}
