package a;

import java.util.*;
import java.util.Date;
import java.sql.*;

public class CollegeBO {
	List<College> list=new ArrayList<College>();
	Scanner s=new Scanner(System.in);
	public void add(List list) {
		System.out.print("Enter name:");
		String name=s.next();
	}
	
	public List<College>findCollege(List<String>nameList){
		return list;	
	}
	
	public List<College>findCollege(Date startingDate){
		return list;
	}
	
	public List<College>findCollege(String location) throws SQLException{
		    try (Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		        PreparedStatement ps = con.prepareStatement("select * from item where location = ?")) {
		        ps.setString(1, location);
		        ResultSet resultSet = ps.executeQuery();
		        while (resultSet.next()) {
		            String name = resultSet.getString("name");
		            String website=resultSet.getString("website");
		            String mobile=resultSet.getString("mobile");
		            String founder=resultSet.getString("founder");
		            int numberOfDept=resultSet.getInt("numberOfDept");
		            Date startingDate=resultSet.getDate("startingDate");
		            String location1 = resultSet.getString("location");
		            College item = new College(name,website,mobile,founder,numberOfDept,location1,startingDate) ;
		            list.add(item);	            
		        } 
		    } 
		return list;
	}
}
