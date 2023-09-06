package servlet.demos.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.demos.model.UserDataModel;
import servlet.demos.service.UserService;

/**
 * Servlet implementation class RegisterValidateControl
 */
@WebServlet("/registerpage")
public class RegisterValidateControl extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
//		System.out.println("registration is in process");
		String name=request.getParameter("cname");
		String dob=request.getParameter("dob");
		String email=request.getParameter("email");
		String mobNo=request.getParameter("mbn");
		String password=request.getParameter("pw");
		String Gender=request.getParameter("gender");
		String Status="Not-Approved";
		UserDataModel data=new UserDataModel(name,dob,email,mobNo,password,Gender,Status);
		UserService us=new UserService();
		try {
			if(us.AddUser(data).equals("success"))
			{
				response.setContentType("text/html");
				response.getWriter().println("<h2 style=\"color:pink;\" align=\"center\">registration success...login to go.....</h2>");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
