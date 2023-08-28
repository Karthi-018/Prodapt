package a;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterServlet extends HttpFilter{

	public void doFilter(HttpServletRequest req,HttpServletResponse res,FilterChain fc) throws IOException, ServletException {
		System.out.println(req.getParameter("pswd"));
		if(req.getParameter("pswd").length()>8) {
			fc.doFilter(req, res);
		}
		else
			req.getRequestDispatcher("Sample.html").forward(req, res);
	}
}
