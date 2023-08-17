package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



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
	public List<College>findCollege(Date sdate)
	{
		List<College> findCollege=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
			PreparedStatement ps1= con.prepareStatement("select * from colleges where Date=?;");
			ps1.setObject(1,sdate);
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
	public void create(List<College> clgList) throws Exception {
		try {	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		PreparedStatement ps = con.prepareStatement("insert into colleges values(?,?,?,?,?,?,?)");
		for (College c : clgList)
		{
			ps.setString(1,c.getName() );
			ps.setString(2,c.getWebsite());
			ps.setString(3,c.getMobile());
			ps.setString(4,c.getFounder());
			ps.setInt(5, c.getNumberOfDept());
			ps.setString(6, c.getLocation());
			ps.setObject(7, (Date) c.getStartingDate());
			ps.executeUpdate();
		}
		System.out.println("College details inserted successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public List<College> sortbyName()throws Exception {
		List<College> sort=new ArrayList<>();
		try {	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		PreparedStatement ps1= con.prepareStatement("select * from colleges order by name;");
		ResultSet rs=ps1.executeQuery();
		while(rs.next())
		{
			sort.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
			sort.sort((o1,o2) -> (o1.getName().compareTo(o2.getName())<0)? -1 : (o1.getName().compareTo(o2.getName())>0)? 1:0);			
	}
	catch(Exception e){
		System.out.println(e);
	}
		return sort;
	}
		
	public List<College> sortbynoOfDept()throws Exception {
			List<College> sort=new ArrayList<>();
			try {	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			PreparedStatement ps1= con.prepareStatement("select * from colleges order by numberOfDept;");
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				sort.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			}
				sort.sort((o1,o2) -> (o1.getNumberOfDept()>o2.getNumberOfDept())? 1 :( o1.getNumberOfDept()<o2.getNumberOfDept())? -1:0);
				//return sort;
			}
			catch(Exception e){
				System.out.println(e);
			}
			return sort;
	}
	public List<College> sortbyDate()throws Exception {
		List<College> sort=new ArrayList<>();
		try {	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		PreparedStatement ps1= con.prepareStatement("select * from colleges order by startingDate;");
		ResultSet rs=ps1.executeQuery();
		while(rs.next())
		{
			sort.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		sort.sort((o1,o2) -> (o1.getStartingDate().compareTo(o2.getStartingDate())<0)? -1 : (o1.getStartingDate().compareTo(o2.getStartingDate())>0)? 1:0);
			//return sort;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return sort;
}


}
