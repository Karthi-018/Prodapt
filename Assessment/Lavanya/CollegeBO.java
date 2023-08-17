
package edu.prodapt.demos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class CollegeBO {
	Scanner scan=new Scanner(System.in);
	College col=new College();
	List<College> list=new ArrayList<College>();
	public void addDetails(College col)throws SQLException {
		System.out.print("Enter college name :");
        String name = scan.next();
        System.out.print("Enter website :");
        String website = scan.next();
        System.out.print("Enter mobile phone :");
        String mobile = scan.next();
        System.out.print("Enter founder :");
        String founder = scan.next();
        System.out.print("Enter number of departments :");
        int numberOfDept = scan.nextInt();
        System.out.print("Enter location :");
        String location = scan.next();
        System.out.print("Enter Starting date :");
        String startingDate = scan.next();
        College col1 = new College(name,website,mobile,founder,numberOfDept,location,startingDate);
        String sql = "insert into item_details values (?, ?, ?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1,col1.getName());
            ps.setString(2,col1.getWebsite());
            ps.setString(3,col1.getMobile());
            ps.setString(4,col1.getFounder());
            ps.setInt(5,col1.getNumberOfDept());
            ps.setString(6,col1.getLocation());
            ps.setString(7,  col1.getStartingDate());
            ps.executeUpdate();
            System.out.println("college details added successfully.");
        }
	}
	
	public List<College> findCollege(List<String> nameList){
		String sql = "select * from college_details where name = ?";
	    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
	        PreparedStatement ps = con.prepareStatement(sql)) {
	        ps.setString(1, name);
	        ResultSet resultSet = ps.executeQuery();
	        while (resultSet.next()) {
	            String name = resultSet.getString("name");
	            String website=resultSet.getString("website");
	            String mobile=resultSet.getString("mobile");
	            String founder=resultSet.getString("founder");
	            int numberOfDept=resultSet.getInt("numberOfDept");
	            String location=resultSet.getString("location");
	            String startingDate=resultSet.getString("startingDate");
	            College col = new College(name,website,mobile,founder,numberOfDept,location,startingDate);
	            list.add(col);
	        } 	            
	    
		return list;
		
	}	   
	    }
	public List<College> findCollege(String startingDate)throws SQLException{
		String sql = "select * from college_details where name = ?";
	    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
	        PreparedStatement ps = con.prepareStatement(sql)) {
	        ps.setString(1, startingDate);
	        ResultSet resultSet = ps.executeQuery();
	        while (resultSet.next()) {
	        	String name = resultSet.getString("name");
	            String website=resultSet.getString("website");
	            String mobile=resultSet.getString("mobile");
	            String founder=resultSet.getString("founder");
	            int numberOfDept=resultSet.getInt("numberOfDept");
	            String location=resultSet.getString("location");
	            String startingDate=resultSet.getString("startingDate");
	            College col = new College(name,website,mobile,founder,numberOfDept,location,startingDate);
	            list.add(col);
	        } 	            
	    
		return list;
		
	}	
		
	}
	public List<College> findCollege(String location){
		String sql = "select * from college_details where name = ?";
	    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
	        PreparedStatement ps = con.prepareStatement(sql)) {
	        ps.setString(1, location);
	        ResultSet resultSet = ps.executeQuery();
	        while (resultSet.next()) {
	        	String name = resultSet.getString("name");
	            String website=resultSet.getString("website");
	            String mobile=resultSet.getString("mobile");
	            String founder=resultSet.getString("founder");
	            int numberOfDept=resultSet.getInt("numberOfDept");
	            String location=resultSet.getString("location");
	            String startingDate=resultSet.getString("startingDate");
	            College col = new College(name,website,mobile,founder,numberOfDept,location,startingDate);
	            list.add(col);
	        } 	            
	    
		return list;
		
	}	
		
	}
}

	

