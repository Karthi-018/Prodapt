package filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterDemo extends HttpFilter{
public void doFilter(HttpServletRequest req,HttpServletResponse res,FilterChain chain) throws IOException, ServletException
{
	String name=req.getParameter("uname");
	String pswd=req.getParameter("pass");
if(name.equals("Ramya") & pswd.equals("Reset123"))
{
	chain.doFilter(req, res);
}
else
{
	res.setContentType("text/html");
	res.getWriter().println("Invalid login");
	RequestDispatcher rd=req.getRequestDispatcher("index.html");
	rd.include(req, res);
}
}
}
