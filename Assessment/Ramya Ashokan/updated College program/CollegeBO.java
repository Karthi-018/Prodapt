package college;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.*;
public class CollegeBO 
{
	public void add(College obj)
	{
		College c=obj;
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		
		String Query="insert into college values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(Query);
		ps.setString(1,c.getName());
		ps.setString(2, c.getWebsite());
		ps.setString(3, c.getMobile());
		ps.setString(4, c.getFounder());
		ps.setInt(5, c.getNumberOfDept());
		ps.setString(6, c.getLocation());
		//Date util_date=(Date) c.getS_date();
		//Date sqldate=(java.sql.Date)c.getS_date();
		ps.setDate(7,(Date)c.getS_date());
		int temp=ps.executeUpdate();
		if(temp==1)
		{
			System.out.println("College added successfully");
		}
		else
		{
			System.out.println("College not added successfully");	
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	public List<College>findCollege(List<String> nameList)
	{
		List<College> nl=new ArrayList<>();	
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		
			for(String lname:nameList)
			{
			PreparedStatement ps=con.prepareStatement("select * from college where name=? ");
			ps.setString(1,lname);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				nl.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
			}
		}
		Collections.sort(nl,(obj1,obj2)->{
			return obj1.getName().compareTo(obj2.getName());
		}
		);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return nl ;
		
	}
	public List<College> findCollege(java.util.Date s_date) {
		List<College> sd=new ArrayList<>();
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		
		PreparedStatement ps=con.prepareStatement("Select * from college where s_date=?");
		
		ps.setObject(1,s_date);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			sd.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
			
		}
		Collections.sort(sd,(obj1,obj2)->{
			return obj1.getS_date().compareTo(obj2.getS_date());
		}
		);
		
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return sd;
		}
	
	public List<College>findCollege(String location)
	{
		List<College> fl = new ArrayList<>();
		try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
        PreparedStatement ps = con.prepareStatement("select * from college where location = ?;");
        ps.setString(1,location);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            fl.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
        }
        Collections.sort(fl,(obj1,obj2)-> {
                    return obj1.getLocation().compareTo(obj2.getLocation());
                }
        );
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
        return fl;	
        
	}
	 public ArrayList<College> sortDept()throws Exception{
	        ArrayList<College> sl = new ArrayList<>();
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	        PreparedStatement ps = con.prepareStatement("select * from college order by numberOfDept;");
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()){
	            sl.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
	        }
	        Collections.sort(sl,(obj1,obj2)-> {
	                    if(obj1.getNumberOfDept()>obj2.getNumberOfDept()){
	                        return 1;
	                    }
	                    else return -1;
	                }
	        );
	        return sl;
	    }
	
}
