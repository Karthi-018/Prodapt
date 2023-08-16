package edu.prodapt.jdbc;
import java.sql.*;
public class itemDAO {
	void additem(String line)
	{
		try
		{
	String item[]=line.split(",");
	item o=new item();
	//o.setname(item[0]);
	//o.setprice(Double.parseDouble(item[1]));
	//System.out.println(o.getprice());
	//o.settype(item[2]);
	String name=item[0];
	Double price=Double.parseDouble(item[1]);
	String type=item[2];
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded successfull");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodagregator","root","root");
	System.out.println("connection successful");
	PreparedStatement p=con.prepareStatement("insert fooddetails values(?,?,?)");
	item ob=new item();
	p.setDouble(1,price);
	p.setString(2,name);
	p.setString(3,type);
	p.executeUpdate();
	System.out.println("inserted success");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	public void findItem(Double cost)
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		PreparedStatement p1=c.prepareStatement("Select * from fooddetails WHERE price=?;");
		p1.setDouble(1,cost);
		ResultSet rs=p1.executeQuery();
		while(rs.next())
		   {
			   System.out.println(rs.getDouble(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
		   }
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void findItem(String Type)
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		PreparedStatement p1=c.prepareStatement("Select * from fooddetails where type=?;");
		p1.setString(1,Type);
		ResultSet rs=p1.executeQuery();
		while(rs.next())
		   {
			   System.out.println(rs.getString(1)+" "+rs.getDouble(2)+" "+rs.getString(3)); 
		   }
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
