package University;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;

public class CollegeBO {
	DBConnection DB=new DBConnection();
	
	public void addCollege(College col) throws Exception {
		Connection con=DB.getConnection();
		PreparedStatement ps =con.prepareStatement("insert into university values (?,?,?,?,?,?)");
		ps.setString(1, col.getName());
		ps.setString(2, col.getWebsite());
		ps.setString(3,col.getMobile());
		ps.setString(4,col.getFounder());
		ps.setInt(5, col.getNumberOfDept());
		ps.setString(6,col.getLocation() );
		ps.setDate(7,(Date) col.getStartingDate());
		ps.executeUpdate();
		
	}
	
	public List<College> findCollege(List<String> namelist) throws Exception{
		Connection con=DB.getConnection();
		List<College> flist=new ArrayList<>();
		for(namelist i:String) {
			PreparedStatement ps =con.prepareStatement("select * from univeristy where name=?");
			ps.i(1,namelist);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				flist.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			}
		}
	
		return flist;
	}
	
}
