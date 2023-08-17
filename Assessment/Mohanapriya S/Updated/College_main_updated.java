package edu.prodapt.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class College_main_updated {
	
	public List<College> findCollege(String name)
	{
		List<College>result=new ArrayList<>();
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		PreparedStatement p2=c2.prepareStatement("select * from college where name=?");
		p2.setString(1,name);
		ResultSet rs1=p2.executeQuery();
		while(rs1.next())
		{
			String website=rs1.getString("website");
			String mobile=rs1.getString("mobile");
			String founder=rs1.getString("founder");
			Integer numberOfDept=rs1.getInt("numberOfDept");
			String location=rs1.getString("location");
			//ps.setObject(7, (Date)data.getstartingDate());
			Date startingDate=rs1.getDate("startingDate");
			result.add(new College(name,website,mobile,founder, numberOfDept,location,startingDate));	
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public List<College> findCollege1(java.sql.Date startingDate)
	{
		List<College>result=new ArrayList<>();
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		PreparedStatement p1=c1.prepareStatement("select * from college where Date=?");
		p1.setDate(1,startingDate);
		ResultSet rs2=p1.executeQuery();
		while(rs2.next())
		{
			String name=rs2.getString("name");
			String website=rs2.getString("website");
			String mobile=rs2.getString("mobile");
			String founder=rs2.getString("founder");
			Integer numberOfDept=rs2.getInt("numberOfDept");
			String location=rs2.getString("location");
			//ps.setObject(7, (Date)data.getstartingDate());
			
			result.add(new College(name,website,mobile,founder,numberOfDept,location, startingDate));	
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	public List<College> findCollege2(String location)
	{
		List<College>result=new ArrayList<>();
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		PreparedStatement p2=c2.prepareStatement("select * from college where location=?");
		p2.setString(1,location);
		ResultSet rs1=p2.executeQuery();
		while(rs1.next())
		{
			String name=rs1.getString("name");
			String website=rs1.getString("website");
			String mobile=rs1.getString("mobile");
			String founder=rs1.getString("founder");
			Integer numberOfDept=rs1.getInt("numberOfDept");
			//String location=rs1.getString("location");
			//ps.setObject(7, (Date)data.getstartingDate());
			Date startingDate=rs1.getDate("startingDate");
			result.add(new College(name,website,mobile,founder, numberOfDept,location,startingDate));	
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	

}
