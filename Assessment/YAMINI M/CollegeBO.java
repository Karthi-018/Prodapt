package CollegeUniversity;

import java.util.*;
import java.io.*;
import java.sql.*;
import java.util.Date;

public class CollegeBO {
	Scanner sc = new Scanner(System.in);
    System.out.println("College University");
   	System.out.println("1.Add List\n 2.Search by Name\n3.Search by Starting Date\n4.Search by Location\n");
    System.out.println("Enter your choice");
    int choice=sc.nextInt();
    sc.nextLine();
    	
    switch(choice)
    	{
    	case 1:
    		System.out.println("Enter the name:");
    		String name=sc.next();
    		System.out.println("Enter the website :");
    		String website=sc.nextLine();
    		System.out.println("Enter the mobile:");
    		String mobile=sc.nextLine();
    		System.out.println("Enter the founder:");
    		String founder=sc.next();
    		System.out.println("Enter the numberOfDept:");
    		int numberOfDept=sc.nextInt();
    		System.out.println("Enter the location:");
    		String location=sc.nextLine();
    		System.out.println("Enter the startingDate:");
    		Date startingDate=sc.nextDate();
    		
    		College col=new College(name,website,mobile,founder,numberOfDept,location,startingDate);
    		break;
    		
    		
    	case 2:
    		System.out.println("Enter name to search");
    		String s_name=sc.next();
    		List<College> foundName=getName.findCollege(s_name);
    		display(foundName);
    		break;
    		
    	case 3:
    		System.out.println("Enter startingDate to search");
    		Date s_startingDate=sc.nextDate();
    		List<College> foundCollege=getDate.findCollege(s_startingDate);
    		display(foundCollege);
    		break;
    		
    	case 4:
    		System.out.println("Enter location to search");
    		String s_Location=sc.nextString();
    		List<College> foundLocation=getLocation.findCollege(s_Location);
    		display(foundLocation);
    		break;
    	}
	
		public  void colList(College col)
		{
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	        PreparedStatement ps=con.prepareStatement("select * from college where name=?");
	        ResultSet rs=ps.executeQuery();
	        
	        if(rs.next())
	        {
	        PreparedStatement ps1=con.prepareStatement("insert into college values(?,?,?)");
	        ps1.setString(1, col.getName());
	        ps1.setString(2,col.getWebsite() );
	        ps1.setString(3, col.getMobile());
	        ps1.setString(4, col.getFounder());
	        ps1.setInt(5, col.getNumberOfDept());
	        ps1.setString(6, col.getLocation());
	        ps1.setDate(7, (java.sql.Date) col.getStartingDate());
	        int temp=ps1.executeUpdate();
	        
	        if(temp==1)
	        {
	        	System.out.println("College added successfully");
	        }
	        else {
	        }
	        }
		}
	       catch(Exception  e)
	    	{
	       	System.out.println(e);	
	       	}	       	
}
		public void colList(List<College> nameList)
	    {
	    for(College c : nameList)
	    {
	        colList(c);
	    }
	    }
		
		public List<College> findCollege(String name)
	    {
	    	List<College> cList=new ArrayList<>();
	    	try
	    	{
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	    	PreparedStatement ps2=con.prepareStatement("select * from college where name=?");
	    	ps2.setString(1, name);
	    	ResultSet rs1=ps2.executeQuery();
	    	while(rs1.next())
	    	{
	    	String website=rs1.getString("website");
	    	String mobile=rs1.getString("mobile");
	    	String founder=rs1.getString("founder");
	    	int numberOfDept=rs1.getInt("numberOfDept");
	    	String location=rs1.getString("location");
	    	Date startingDate=rs1.getDate("startingDate");
	    	cList.ps(new College(website,mobile,founder,numberOfDept,location,startingDate));
	    	}
	    	
	    	}
	    	catch(Exception  e)
	    	{
	    	System.out.println(e);	
	    	}
	    	return cList;
	    }
		
		public List<College> findCollege(Date startingDate)
	    {
	    	
	        List<Item> cList1=new ArrayList<>();
	    	try
	    	{
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	    	PreparedStatement ps=con.prepareStatement("select * from college where startingDate=?");
	    	ps.setDate(1,startingDate);
	    	ResultSet rs2=ps.executeQuery();
	    	while(rs2.next())
	    	{
	    	String name=rs2.getString("name");
	    	String website=rs2.getString("website");
	    	String mobile=rs2.getString("mobile");
	    	String founder=rs2.getString("founder");
	    	int numberOfDept=rs2.getInt("numberOfDept");
	    	String location=rs2.getString("location");
	    	cList1.ps(new College(name,website,mobile,founder,numberOfDept,location));
	    	}
	    	}
	    	catch(Exception  e)
	    	{
	    	System.out.println(e);	
	    	}
	    	return cList1;
	    }
		
		public List<College> findCollege(String location)
	    {
	    	
	        List<College> cList2=new ArrayList<>();
	    	try
	    	{
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	    	PreparedStatement ps3=con.prepareStatement("select * from college where location=?");
	    	ps3.setString(1,location);
	    	ResultSet rs3=ps3.executeQuery();
	    	while(rs3.next())
	    	{
	    	String name=rs3.getString("name");
	    	String website=rs3.getString("website");
	    	String mobile=rs3.getString("mobile");
	    	String founder=rs3.getString("founder");
	    	int numberOfDept=rs3.getInt("numberOfDept");
	    	Date startingDate=rs3.getDate("startingDate");
	    	cList2.ps3(new College(name,website,mobile,founder,numberOfDept,startingDate));
	    	}
	    	}
	    	catch(Exception  e)
	    	{
	    	System.out.println(e);	
	    	}
	    	return cList1;
	    }
		
}
