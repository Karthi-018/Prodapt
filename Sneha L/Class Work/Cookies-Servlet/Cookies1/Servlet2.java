package ServletCookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getcookie")
public class Servlet2 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		Cookie[] cookies=req.getCookies();
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
	
		out.println("<html><body>");
		
		for(Cookie c:cookies) {
			out.println( c.getName()+" : "+c.getValue());
			}
		out.println("<a href=\"index.html\">go back</a>");
		out.println("</body></html>");
		
		
	}

}
