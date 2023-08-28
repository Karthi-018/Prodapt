package FilterEx2;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFilter extends HttpFilter {
    Connection con=null;
    public void init() throws ServletException {
        ServletContext context=getServletContext();
        String driverClass=(String)context.getInitParameter("dClass");
        String url=(String)context.getInitParameter("url");
        String user=(String)context.getInitParameter("userName");
        String passwd=(String)context.getInitParameter("password");
        try {
            Class.forName(driverClass);
            con=DriverManager.getConnection(url,user,passwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void doFilter(HttpServletRequest req,HttpServletResponse res,FilterChain chain) {
        try(PrintWriter out = res.getWriter()) {
             String userName = req.getParameter("uname");
           String pass = req.getParameter("passwd");

           PreparedStatement ps = con.prepareStatement("select firstname,password from employees1 where firstname=?");
           ps.setString(1, userName);

 

           ResultSet rs = ps.executeQuery();


           while(rs.next()) {

               if(pass.equals(rs.getString("password"))) 
               {
                   chain.doFilter(req, res);

               }
               else {
                  RequestDispatcher rd=req.getRequestDispatcher("index.html");
                rd.forward(req, res);

               }
            }    
    }
    catch(Exception e) {
        System.out.println(e);
    }
    }
    public void destroy(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 

}