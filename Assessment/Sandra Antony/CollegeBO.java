package feature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollegeBO {
	public List<College> findCollege(List<String> nameList) throws SQLException{
		List<College> colleges = new ArrayList<College>();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	        for(String collegeName : nameList) {
	        	PreparedStatement ps = con.prepareStatement("select * from College where name = ?");
	        	ps.setString(1, collegeName);
	        	ResultSet result = ps.executeQuery();
	        	while(result.next()) {
	        		College c = new College(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getInt(5),result.getString(6),result.getTimestamp(7));
	        		colleges.add(c);
	        	}
	        }
	    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colleges;
	}
	public List<College> findCollege(Date startingDate) throws SQLException{
		List<College> colleges = new ArrayList<College>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps = con.prepareStatement("select * from College where startingDate = ?");
        	ps.setDate(1, (java.sql.Date) startingDate);
        	ResultSet result = ps.executeQuery();
        	while(result.next()) {
        		College c = new College(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getInt(5),result.getString(6),result.getTimestamp(7));
        		colleges.add(c);
        	}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colleges;
	}
	public List<College> findCollege(String location) throws SQLException{
		List<College> colleges = new ArrayList<College>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps = con.prepareStatement("select * from College where location = ?");
        	ps.setString(1, location);
        	ResultSet result = ps.executeQuery();
        	while(result.next()) {
        		College c = new College(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getInt(5),result.getString(6),result.getTimestamp(7));
        		colleges.add(c);
        	}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colleges;
	}
}
