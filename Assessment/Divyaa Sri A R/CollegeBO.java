package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CollegeBO {
	
	public List<College>findCollege(List<String>nameList)
	{
		List<College> findCollege=new ArrayList<>();
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
			PreparedStatement ps1= con.prepareStatement("select * from colleges where name=?;");
			for (String name : nameList)
			{
				ps1.setString(1,name);
			}
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				findCollege.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		return findCollege;
	}
	public List<College>findCollege(java.sql.Date sdate)
	{
		List<College> findCollege=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
			PreparedStatement ps1= con.prepareStatement("select * from colleges where Date=?;");
			ps1.setDate(1,sdate);
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				findCollege.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return findCollege;
	}
	public List<College>findCollege(String slocation )
	{
		List<College> findCollege=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
			PreparedStatement ps1= con.prepareStatement("select * from colleges where location=?;");
			ps1.setString(1,slocation);
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				findCollege.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return findCollege;
	}



}
