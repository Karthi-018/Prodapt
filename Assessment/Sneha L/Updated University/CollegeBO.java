package edu.com.University;

import java.util.*;

import java.sql.*;
import java.sql.Date;



public class CollegeBO {
	
	//------------------------------------------------------------------------------------------------------------------
	public List<College> findCollege(List<String> nameList) throws Exception
	{
		List<College> clg=new ArrayList<>();		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
			PreparedStatement ps=con.prepareStatement("select *from college where name=?");
			for(String i:nameList) {
			ps.setString(1, i);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				clg.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return clg;
	}
	//------------------------------------------------------------------------------------------------------------------------
		public List<College> findCollege(java.util.Date  startingDate) throws Exception{
			List<College> clg=new ArrayList<>();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
				PreparedStatement ps=con.prepareStatement("select *from college where startingDate=?");
				//converting java.util.Date into java.sql.Date
				java.sql.Date d1=new java.sql.Date(startingDate.getTime());
				ps.setDate(1, (Date) d1);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					clg.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			return clg;
					
		}
	//------------------------------------------------------------------------------------------------------------------
		public List<College> findCollege(String location) throws Exception{
			List<College> clg=new ArrayList<>();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
				PreparedStatement ps=con.prepareStatement("select *from college where location =?");
				ps.setString(1, location);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					clg.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			return clg;
		}
		//-------------------------------------------------------------------------------------------------------
		public void create(College clg) throws Exception {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
				PreparedStatement ps=con.prepareStatement("INSERT INTO college values(?,?,?,?,?,?,?)");
				ps.setString(1,clg.getName());
		        ps.setString(2,clg.getWebsite());
		        ps.setString(3,clg.getMobile());
		        ps.setString(4,clg.getFounder());
		        ps.setInt(5,clg.getNumberOfDept());
		        ps.setString(6,clg.getLocation());
		        ps.setObject(7, new java.sql.Date(clg.getStartingDate().getTime()));
		        ps.executeUpdate();
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		}
		public List<College> sortDate() throws Exception{
			List<College> clg=new ArrayList<>();
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
				PreparedStatement ps=con.prepareStatement("select *from college");
				
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					clg.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			Collections.sort(clg,Comparator.comparing(College::getStartingDate));
			return clg;
		}
		
		public List<College> sortDept() {
			List<College> clg=new ArrayList<>();
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
				PreparedStatement ps=con.prepareStatement("select *from college");
				
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					clg.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			Collections.sort(clg,Comparator.comparing(College::getNumberOfDept));
			return clg;
			
		}
		public List<College> sortLoc() {
			List<College> clg=new ArrayList<>();
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
				PreparedStatement ps=con.prepareStatement("select *from college");
				
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					clg.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			Collections.sort(clg,Comparator.comparing(College::getLocation));
			return clg;
			
		}
}
	
			
		

