package edu.prodapt.jdbc;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.text.*;
public class maincollege {
	
	public static void main(String a[]) throws Exception
	{
		try
		{
		ArrayList<college> al=new ArrayList<>();
		college o=new college();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the line");
		String line=s.next();
		al.add(o.adddata(line));
		System.out.println(al);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		PreparedStatement p=c.prepareStatement("insert  college values(?,?,?,?,?,?,?)");
		for(college ob:al)
		{
			p.setInt(1, ob.getNumberOfDept());
			p.setString(2, ob.getName());
			p.setString(3,ob.getLocation());
			p.setString(4, ob.getFounder());
			p.setString(5, ob.getMobile());
			p.setString(6, ob.getWebsite());
			p.setObject(7,(Date)ob.getStartingDate());
			p.executeUpdate();		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
