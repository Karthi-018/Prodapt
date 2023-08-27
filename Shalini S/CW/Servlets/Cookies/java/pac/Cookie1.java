package pac;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        Cookie cookie1=new Cookie("name",req.getParameter("fname"));
        Cookie cookie2=new Cookie("pass",req.getParameter("pass"));
        res.addCookie(cookie1);
        res.addCookie(cookie2);
        RequestDispatcher rd=req.getRequestDispatcher("cook.html");
        rd.forward(req, res);
	}    		
}
