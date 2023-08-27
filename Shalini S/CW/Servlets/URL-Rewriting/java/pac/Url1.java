package pac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class Url1 extends HttpServlet{
		public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
		{
			res.sendRedirect("log?Name="+req.getParameter("uname"));	
		}

	
}
