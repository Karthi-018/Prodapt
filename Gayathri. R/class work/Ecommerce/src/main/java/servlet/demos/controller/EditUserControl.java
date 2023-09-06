package servlet.demos.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.demos.model.UserDataModel;
import servlet.demos.service.AdminService;


@WebServlet("/editing")
public class EditUserControl extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String status=request.getParameter("edit");
		String email=request.getParameter("email");
		if(status.equals("Approve"))
		{try {
			System.out.println("aprroving is in process"+email);
			AdminService as=new AdminService();
			if((as.EditUser(email, status).equals("success"))) 
			{   response.setContentType("text/html");
			    response.getWriter().println("<h2 align=\"center\" style=\"color:green;\">Approved success</h2>");
			    AdminService ps=new AdminService();
				  List<UserDataModel> ul=ps.ViewUser();
				  System.out.println(ul);
				  request.setAttribute("userlist",ul);
				RequestDispatcher rd=request.getRequestDispatcher("UserView.jsp");
				rd.include(request, response);
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			if(status.equals("Not-Approved"))
			{try {
				System.out.println("deaprroving is in process"+email);
				AdminService as=new AdminService();
				if((as.EditUser(email, status).equals("success"))) 
				{   response.setContentType("text/html");
				    response.getWriter().println("<h2 align=\"center\" style=\"color:green;\">unApproved success</h2>");
				    AdminService ps=new AdminService();
					  List<UserDataModel> ul=ps.ViewUser();
					  System.out.println(ul);
					  request.setAttribute("userlist",ul);
					RequestDispatcher rd=request.getRequestDispatcher("UserView.jsp");
					rd.include(request, response);
				}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
