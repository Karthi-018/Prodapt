package university_req;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

class CollegeBO {
	//----------method for splitting the string----------------------------------------
	void addValues(String s)throws Exception {
		String arr[]=s.split(",");
		String name=arr[0];
		String website=arr[1];
		String mobile=arr[2];
		String founder=arr[3];
		int numberOfDept=Integer.parseInt(arr[4]);
		String location=arr[5];
		
		DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		Date startingDate=df.parse(arr[6]);
		College ob= new College(name,website,mobile,founder,numberOfDept,location,startingDate);
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assessment","root","root");
			PreparedStatement ps=con.prepareStatement("INSERT INTO college (name,website,mobile,founder,numberOfDept,location,startingDate) VALUES (?,?,?,?,?,?,?)");
			ps.setString(1,ob.getName());
            ps.setString(2,ob.getWebsite());
            ps.setString(3,ob.getMobile());
            ps.setString(4,ob.getFounder());
            ps.setInt(5,ob.getNumberOfDept());
            ps.setString(6,ob.getLocation());
            ps.setObject(7,(java.util.Date) ob.getStartingDate());
            ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	//-----------main method-----------------------------------------------------------
	public static void main(String args[])throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the College Details");
		//vit,vit.com,9889654321,soya,8,vellore,09:05:23
		String s=sc.next();
		CollegeBO obj=new CollegeBO();
		obj.addValues(s);
		System.out.println("Enter 1)Search based on College name\nEnter 2)Search based on College Starting Date\nEnter 3)Search based on College Location");
		System.out.println("Enter your choice");
		int n=sc.nextInt();
		switch(n) {
		case 1:System.out.println("Enter the number of college name");
			   ArrayList<String> collegeList=new ArrayList();
			   int num=sc.nextInt();
			   for(int i=0;i<num;i++) {
				   System.out.println("Enter the "+i+1+" name");
				   String cname=sc.next();
				   collegeList.add(cname);
			   }
			   
		       List<College>DetailsList= obj.findCollege(collegeList);  
               System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
               for(College object:DetailsList)
               {
               	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getNumberOfDept(),object.getLocation(),object.getStartingDate());
               }  
		       break;
		case 2:System.out.println("Enter the starting date");
		       SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		       Date date=(java.util.Date)df.parse(sc.next()); 
		       List<College>listDate= obj.findCollege(date); 
		       System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
				for(College object:listDate)
               {
               	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getNumberOfDept(),object.getLocation(),object.getStartingDate());

               }  
			   break;	
		       
		case 3:System.out.println("Enter the college location");
		       String l=sc.next();
		       List<College>locationList= obj.findCollege(l); 
				System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
				for(College object:locationList)
               {
               	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getNumberOfDept(),object.getLocation(),object.getStartingDate());

               }  
               break;  
		}
		
		
	}

	
	//-------------------------------------------------------------------------------------------
	List<College> findCollege(List<String> nameList)throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assessment","root","root");
		ArrayList<College> collegeList=new ArrayList();
		for(String s:nameList) {
			PreparedStatement ps=con.prepareStatement("select * from college where name=?");
			ps.setString(1,s);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				collegeList.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			}
		}
		Collections.sort(collegeList,(o1,o2)->(o1.getName().compareTo(o2.getName())));
		return collegeList;
	}
	//------------------------------------------------------------------------------------------------
	
	public List<College> findCollege(String location) throws Exception
	{
		List<College> collegeList=new ArrayList<>();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assessment","root","root");
		PreparedStatement ps=con.prepareStatement("select*from college where location=?"); 
		ps.setString(1, location);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			  collegeList.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		return collegeList; 
		
	}
	//----------------------------------------------------------------------------------------------------
	public List<College> findCollege(Date startingDate) throws Exception
	{
		List<College> collegeList=new ArrayList<>();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assessment","root","root");
		PreparedStatement ps=con.prepareStatement("select*from college where startingDate=?"); 
		ps.setObject(1,startingDate);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			  collegeList.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		Collections.sort(collegeList,(o1,o2)->(o1.getStartingDate().compareTo(o2.getStartingDate())));
		return collegeList; 
	}
	

}

