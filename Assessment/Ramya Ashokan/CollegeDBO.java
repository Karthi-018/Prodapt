package college;
import java.sql.Date;
import java.util.*;
import java.sql.*;
public class CollegeDBO 
{
	public void add(List<College> l)
	{
		College c=new College();
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		
		String Query="insert into college values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(Query);
		ps.setString(1,c.getName() );
		ps.setString(2, c.getWebsite());
		ps.setString(3, c.getMobile() );
		ps.setString(4, c.getFounder());
		ps.setInt(5, c.getNumberOfDept());
		ps.setString(6, c.getLocation());
		ps.setDate(7,c.getS_date());
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
}
