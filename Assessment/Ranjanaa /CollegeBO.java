package university;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.*;

import foodAggregator.Item;

public class CollegeBO 
{
	Scanner sc = new Scanner(System.in);
	public void create(Connection con,College c) 
	{
		// TODO Auto-generated method stub
		try
		{
		
		PreparedStatement ps = con.prepareStatement("insert into university value(?,?,?,?,?,?,?)");
		
		
		ps.setString(1,c.getName());
		ps.setString(2,c.getWebsite());
		ps.setString(3,c.getMobile());
		ps.setString(4,c.getFounder());
		ps.setInt(5,c.getNumberOfDept());
		ps.setString(6,c.getLocation());
		ps.setDate(7,(Date) c.getStartingDate());
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void bulk(Connection con, List<College> l) 
	{
		// TODO Auto-generated method stub
		for(College c : l)
		{
			create(con,c);
		}
		
	}
	public List<College> findCollege(String uname, Connection con) {
		// TODO Auto-generated method stub
		boolean flag = false;
		List<College> l1 = new ArrayList<>();
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from fooditem where type=?");
			ps.setString(1,uname);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				l1.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				flag = true;
			}
			if(flag==false)
			{
				System.out.println("No such college is present");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return l1;
	}
	public List<College> findLocation(String ulocation, Connection con) {
		// TODO Auto-generated method stub
		boolean flag = false;
		List<College> l2 = new ArrayList<>();
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from fooditem where type=?");
			ps.setString(1,ulocation);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				l2.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				flag = true;
			}
			if(flag==false)
			{
				System.out.println("No such location is present");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Collections.sort(l2,(obj1,obj2)->(obj1.getLocation().compareTo(obj2.getLocation())));
		
		return l2;
	}
	public List<College> findDate(String udate, Connection con) {
		// TODO Auto-generated method stub
		boolean flag = false;
		List<College> l3 = new ArrayList<>();
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from fooditem where type=?");
			ps.setString(1,udate);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				l3.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				flag = true;
			}
			Collections.sort(l3,(obj1,obj2)->(obj1.getStartingDate().compareTo(obj2.getStartingDate())));
			if(flag==false)
			{
				System.out.println("No such date is present");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return l3;
	}
	
	public void displayColleges(List<College> colleges) 
    {

        String format = "%-15s %-20s %-15s %-15s %-8s %-20s %-15s%n";
        for (College college : colleges) 
        {
        	System.out.format(format,college.getName(),college.getWebsite(),college.getMobile(),college.getFounder(),college.getNumberOfDept(),college.getLocation(),college.getStartingDate() );

        }

    }
}
