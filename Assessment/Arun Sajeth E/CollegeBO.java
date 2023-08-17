package desp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class CollegeBO 
{
	public List<College> findCollege(List<String> nameList) throws SQLException
	{
		List<College> search = new ArrayList<>();
		Connection con = JdbcConnection.getConnection();
		for(String s:nameList)
		{
			PreparedStatement ps = con.prepareStatement("select * from college where name = ?");
			ps.setString(1, s);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				search.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			}
		}
		return search;
	}
	
	public List<College> findCollege(Date startingDate) throws Exception
	{
		List<College> search = new ArrayList<>();
		Connection con  = JdbcConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from college where startingDate = ? ");
		
		ps.setDate(1, startingDate);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			search.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		return search;
	}
	
	public List<College> findCollege(String location) throws SQLException
	{
		List<College> search = new ArrayList<>();
		Connection con  = JdbcConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from college where location = ? ");
		ps.setString(1, location);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			search.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		return search;
	}
	
	public List<College> sortByName(List<College> search)
	{
		Collections.sort(search,(s1, s2) -> (s1.getName().compareTo(s2.getName())));
		return search;
	}
	
	public List<College> sortByLocation(List<College> search)
	{
		Collections.sort(search,(s1, s2) -> (s1.getLocation().compareTo(s2.getLocation())));
		return search;
	}
	
	public List<College> sortByDate(List<College> search)
	{
		Collections.sort(search,(s1, s2) -> (s1.getStartingDate().compareTo(s2.getStartingDate())));
		return search;
	}
	
}
