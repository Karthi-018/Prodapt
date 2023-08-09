package edu.prodapt.demos;
import java.sql.*; 
import java.util.*;

public class JdbcDemo 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
    try 
    {
	  Class.forName("com.mysql.cj.jdbc.Driver"); 
	  System.out.println("Driver Loaded Classes");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
      System.out.println("Connection success");
      
      //Using Statement Method()
      Statement stmt=con.createStatement();
      int temp=stmt.executeUpdate("insert into studentdetails values("+102+",'XYZ',"+87+")"); 
      System.out.println("Student inserted Success");  
      ResultSet rs=stmt.executeQuery("select *from studentdetails where sname='XYZ'"); 
      System.out.println("SID NAME MARKS");
      System.out.println("------------------------------");
      while(rs.next())
      {
    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt("smarks"));
      }  
      
      //Using PreparedStatement Method() 
      System.out.println("ENTER SID");
      int sid=sc.nextInt();
      System.out.println("ENTER SNAME");
      String sname=sc.next();
      System.out.println("ENTER SMARKS");
      int smarks=sc.nextInt();
      PreparedStatement ps=con.prepareStatement("insert into studentdetails values(?,?,?)"); 
      ps.setInt(1, sid);
      ps.setString(2, sname);
      ps.setInt(3, smarks);
      int t=ps.executeUpdate(); 
    
     
      PreparedStatement pst=con.prepareStatement("select*from studentdetails where smarks>?"); 
      System.out.println("Enter the marks:");
      int n=sc.nextInt(); 
      ps.setInt(1,n);
      ResultSet rst= pst.executeQuery();  
      while(rs.next())
      {
   	   System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getInt("smarks"));
      } 
    } 
    catch(ClassNotFoundException e)
    {
	   System.out.println(e);
    } 
    catch(SQLException e)
    {
	   System.out.println(e);
    }
  }
}
