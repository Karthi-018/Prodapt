package requirement4.assignment;


import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.sql.*;
import java.sql.Date;


public class CollegeBO 
{
	Scanner sc = new Scanner(System.in);
	
	
	//1
	
	public void addCollege(College college) throws Exception
	{
		
		try
		{
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/req4", "root", "root");	
	         PreparedStatement ps = con.prepareStatement("insert into req4_table values(?, ?,,?, ?, ?, ?)");
	         ps.setString(1,college.getName());
	         ps.setString(2,college.getWebsite());
	         ps.setString(3,college.getMobile());
	         ps.setString(4,college.getFounder());
	         ps.setInt(5,college.getNumberofDept());
	         ps.setString(6,college.getLocation());
	         ps.setDate(7,(Date)college.getDate());
	         ps.executeUpdate();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	//2
	
	@SuppressWarnings("finally")
	public List<College> findCollege(List<String> nameList) throws Exception
	{
        List<College> collegelist = new ArrayList<>();
		
		try
		{
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/req4", "root", "root");	
		    PreparedStatement ps = con.prepareStatement("select * from req4_table where name = ?" );
		    
		    for(String s : nameList)
		    {
		    	ps.setString(1,s);
		    }
		    
		    ResultSet rs = ps.executeQuery();
		    
		    while(rs.next())
		    {
		    	collegelist.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		    }
		    
		    if(collegelist.isEmpty())
		    {
		    	System.out.println("Nothing");
		    }
		}
	
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			return collegelist;
		}
	}	
				
	
	//3
	
	public List<College> findCollege(Date startingdate1) throws Exception
	{
	    List<College> collegelist = new ArrayList<>();
		
		try
		{
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/req4", "root", "root");	
		    PreparedStatement ps = con.prepareStatement("select * from req4_table where startingDate = ?" );
		    ps.setDate(1,startingdate1);
		    ResultSet rs = ps.executeQuery();
		    
		    while(rs.next())
		    {
		    	collegelist.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		    }
		    if(collegelist.isEmpty())
		    {
		    	System.out.println("Nothing");
		    }
		}
	
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		Collections.sort(collegelist,(d1,d2)->(d1.getDate().compareTo(d2.getDate())));
		
		
			return collegelist;
		
	}	
			
	
	//4
	
	
	public List<College> findCollege(String location1) throws Exception
	{
		    List<College> collegelist = new ArrayList<>();
			
			try
			{
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/req4", "root", "root");	
			    PreparedStatement ps = con.prepareStatement("select * from req4_table where location = ?" );
			    ps.setString(1,location1);
			    ResultSet rs = ps.executeQuery();
			    
			    while(rs.next())
			    {
			    	collegelist.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			    }
			    if(collegelist.isEmpty())
			    {
			    	System.out.println("Nothing");
			    }
			}
		
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			Collections.sort(collegelist,(l1,l2)->(l1.getLocation().compareTo(l2.getLocation())));
				return collegelist;
			}
		}
	
	

