package College;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

class CollegeBO {
	public static void main(String args[]) { 


	try
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name: ");
	   String name = sc.next();
		System.out.println("Enter website: ");
		String website = sc.next();
		System.out.println("Enter mobile: ");
		String mobile = sc.next();
		System.out.println("Enter founder: ");
		String founder = sc.next();
		System.out.println("Enter numberofDept: ");
		int numberOfDept = sc.nextInt();
		System.out.println("Enter location: ");
		String location= sc.next();
	
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");	
         PreparedStatement ps = con.prepareStatement("insert into college values(?, ?, ?,?,?,?,?)");
         ps.setString(1,name);
         ps.setString(2,website);
         ps.setString(3,mobile);
         ps.setString(4,founder);
         ps.setInt(5,numberOfDept);
         ps.setString(6,location);
         ps.setString(7,startingDate);
         ps.executeUpdate();
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	public void findCollege(List<CollegeBO> List){

        for(CollegeBO i:List) {

            addItem(i);

        }

    Public List<College>findCollege(List<String>nameList)throws Exception
    
    {
    	Scanner sc = new Scanner(System.in);
    		try
    		{
    			String sname=sc.next();
    		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");	
    		    PreparedStatement ps = con.prepareStatement("select * from college where name = ?" );
    		   
				ps.setString(1,sname);
    		    ResultSet rs = ps.executeQuery();
    		    
    		    while(rs.next())
    		    {
    		    	
    		    }
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}

    }
    publicList<College>findCollege(Date startingDate){
    	 {
    	    	Scanner sc = new Scanner(System.in);
    	    		try
    	    		{
    	    			String sname=sc.next();
    	    		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");	
    	    		    PreparedStatement ps = con.prepareStatement("select * from college where startingDate = ?" );
    	    		   
    					ps.setString(1,startingDtae);
    	    		    ResultSet rs = ps.executeQuery();
    	    		    
    	    		    while(rs.next())
    	    		    {
    	    		    	
    	    		    }
    		}
    		
    		catch(Exception e)
    		{
    			System.out.println(e);
    		}

    }
    publicList<College>findCollege(String location){
    	try
		{
		Scanner sc=new Scanner(System.in);
			String sname=sc.next();
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");	
		    PreparedStatement ps = con.prepareStatement("select * from college where location = ?" );
		   
			ps.setString(1,location);
		    ResultSet rs = ps.executeQuery();
		    
		    while(rs.next())
		    {
		    	
    }

    }
}
    }
