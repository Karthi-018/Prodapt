package ReqScope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/loginpg")
public class FirstServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		req.setAttribute("email",req.getParameter("email"));
		RequestDispatcher rd=req.getRequestDispatcher("/Second");
		rd.forward(req, res);
	}
}
