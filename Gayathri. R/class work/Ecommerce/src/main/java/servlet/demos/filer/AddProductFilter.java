package servlet.demos.filer;

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
 * Servlet Filter implementation class AddProductFilter
 */
@WebFilter("/add")
public class AddProductFilter extends HttpFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		String pname=request.getParameter("pname");
		String pdes=request.getParameter("pdes");
		int price= Integer.parseInt(request.getParameter("price"));
		int quan=Integer.parseInt(request.getParameter("quan"));
		if(pname.length()>=3)
		{
		if( pdes.length()>=10)
		{
			if( price!=0 & quan!=0 )
			{
		chain.doFilter(request, response);
		     }
		}
		}
	}

}
