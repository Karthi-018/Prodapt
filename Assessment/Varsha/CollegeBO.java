package requirement4.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CollegeBO 
{
	Scanner sc = new Scanner(System.in);
	
	//1 add college details
	
	public void addCollege(College college)
	{
		
		try
		{
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/req4", "root", "root");	
	         PreparedStatement ps = con.prepareStatement("insert into req4_table values(?, ?,,?, ?, ?, ?)");
	         ps.setString(1,college.getName());
	         ps.setString(2,college.getWebsite());
	         ps.setString(3,college.getMobile());
	         ps.setString(4,college.getFounder());
	         ps.setInt(5,college.getnumberofDept());
	         ps.setString(6,college.getlocation());
	         ps.executeUpdate();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	
//	public List<College> findCollege(List<String> nameList)
//	{
//		
//	}
	
	//2
	//public List<College> findCollege(Date startingDate)
	
	//3
	public List<College> findCollege(String location) throws Exception
	{
		    List<College> collegeist = new ArrayList<>();
			
			try
			{
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/req4", "root", "root");	
			    PreparedStatement ps = con.prepareStatement("select * from req4_table where location = ?" );
			    ps.setString(1,slocation);
			    ResultSet rs = ps.executeQuery();
			    
			    while(rs.next())
			    {
			    	collegelist.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));
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
	}
	

