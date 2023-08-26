package ServletCookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setcookie")
public class Servlet1 extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		Cookie cookie=new Cookie("username",req.getParameter("uname"));
		Cookie cookie1=new Cookie("email",req.getParameter("email"));

		
		//Add cookie to the response
		res.addCookie(cookie);
		res.addCookie(cookie1);
		res.sendRedirect("index2.html");

}
}
