package urlrewriting;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class FirstServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	String uname=req.getParameter("uname");
		res.sendRedirect("SecondServlet?uname="+uname);	
	}

}
