package Filterexample1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class MyFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
        String username = request.getParameter("uname");
        String password = request.getParameter("passwd");
        PrintWriter out = response.getWriter();
        if (username.length() > 3 && password.length() > 3) {
            chain.doFilter(request, response);
        } else {
        	
            request.getRequestDispatcher("index.html").forward(request, response);
        }
    }

 

    
}