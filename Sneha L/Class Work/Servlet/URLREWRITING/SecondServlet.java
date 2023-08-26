package urlrewriting;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname=req.getParameter("uname");
		res.setContentType("text/html");
		res.getWriter().println("<h1>Hello, "+uname+"!</h1>");
		}

}
