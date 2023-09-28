package edu.training.filters;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpSession;

import java.util.*;
import edu.training.model.Customer;

import java.text.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
 
@WebFilter("/RegisterController")

public class RegistrationValidationFilter extends HttpFilter implements Filter {

   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
	  
      try {
    	 
        String name = request.getParameter("name");
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate=df.parse(request.getParameter("dob"));
        java.sql.Date date=new java.sql.Date(utilDate.getTime());
        
    	String email = request.getParameter("email");
        String phno = request.getParameter("phno");
        String add=request.getParameter("add");
        String pwd = request.getParameter("pwd");
        String status=request.getParameter("status");
       

        PrintWriter out = response.getWriter();
        List<String> er=new ArrayList<>();
        
       
        
 

if (!(name.length() >= 3)) {
				er.add("Invalid Name <br>");
				
				
}

if (date.after(df.parse("2000-01-01"))) {
	
	er.add("Not Eligible:Age Limit <br>");
            
            }

 if (!(email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))) {
	 
	 er.add("Invalid Email <br>");
			
}

 
if (!((phno.charAt(0) == '7' || phno.charAt(0) == '8' || phno.charAt(0) == '9') && (phno.length() == 10))) {
        		
	er.add("Invalid mobile number <br>");
	
        	}
if(add==null) {
	er.add("Address is Required <br>");
	
}

 
if (!((pwd.length() == 8) && pwd.matches("^[a-zA-Z0-9]+$"))) {

        	er.add("Invalid Password type <br>");
        
 }
if(!(er.isEmpty())) {
	for(String e:er) {
        out.println("<b style='color:red'>"+e+"</b><br>");
        }
	request.getRequestDispatcher("Register.jsp").include(request, response);
	}
 
else {
	     
	     Customer c=new Customer(name,date,email,phno,add,pwd,status);
         request.setAttribute("o",c);
         chain.doFilter(request, response);

        }}
      catch(ParseException e) {
    	  e.printStackTrace();
      }
    	}

    

} 

