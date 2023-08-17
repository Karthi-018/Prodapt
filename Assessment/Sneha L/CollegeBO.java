package University;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class CollegeBO {
	void create(College college) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
			PreparedStatement ps=con.prepareStatement("INSERT INTO college values(?,?,?,?,?,?,?)");
			ps.setString(1,college.getName());
			ps.setString(2, college.getWebsite());
			ps.setString(3,college.getMobile());
			ps.setString(4,college.getFounder());
			ps.setInt(5, college.getNumberofDept());
			ps.setString(6,college.getLocation());
			ps.setDate(7,(Date) college.getStartingDate());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}

	public List<College> findCollege(List<String> nameList) throws Exception
	{
		List<College> clg=new ArrayList<>();		
		try {
			
			for(String i:nameList) {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
			PreparedStatement ps=con.prepareStatement("select *from college where name=?");
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
	public List<College> findCollege(java.util.Date  startingDate) throws Exception{
		List<College> clg=new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
			PreparedStatement ps=con.prepareStatement("select *from college where startingDate=?");
			ps.setDate(1, (Date) startingDate);
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
				//Collections.sort(clg,(o1,o2)->((o1.getStartingDate()>o2.getStartingDate()?1:-1)));
	}
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

 

 
}
