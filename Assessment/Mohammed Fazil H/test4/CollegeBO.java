package test4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CollegeBO {
	DbConnection db = new DbConnection();
	Connection con = db.createConnection();
	PreparedStatement ps;
	ResultSet rs;
	
	List<College> find = new ArrayList<>();
	public List<College> findCollege(List<String> nameList) throws SQLException{
		
		for(int i=0;i<nameList.size();i++) {
			ps = con.prepareStatement("select * from college where name = ?");
			ps.setString(1,nameList.get(i));
			rs = ps.executeQuery();
			while(rs.next()) {
				find.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			}
		}
		return find;
		
	}
	
	public List<College> findCollege(Date startingDate) throws SQLException{
		find  = null;
		ps = con.prepareStatement("select * from college where date = ?");
		ps.setDate(1, startingDate);
		rs = ps.executeQuery();
		while(rs.next()) {
			find.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		return find;
		
	}
	
	public List<College> findCollege(String location) throws SQLException{
		find = null;
		ps = con.prepareStatement("select * from college where location = ?");
		ps.setString(1, location);
		rs = ps.executeQuery();
		while(rs.next()) {
			find.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		return find;
		
	}
}
