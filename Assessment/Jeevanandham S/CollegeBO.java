package collegelist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

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
	
	public void createCollege(String line) throws ParseException, SQLException {
		String[] create = line.split(",");
		Integer numberOfDept = new Integer(create[4]);
		DateFormat df = new SimpleDateFormat("dd:mm:yy");
		java.util.Date startingDate =df.parse(create[6]); 
		College col = new College(create[0],create[1],create[2],create[3],numberOfDept,create[5],startingDate);
		ps = con.prepareStatement("insert into college values(?,?,?,?,?,?,?)");
		ps.setString(1,col.getName() );
		ps.setString(2,col.getWebsite());
		ps.setString(3,col.getMobile());
		ps.setString(4,col.getFounder());
		ps.setInt(5, col.getNumberOfDept());
		ps.setString(6, col.getLocation());
		ps.setDate(7, (Date) col.getStartingDate());
		int temp = ps.executeUpdate();
		if(temp == 1) {
			System.out.println("College added successfully");
		}
	}
	
	public static void main(String[] args) throws ParseException, SQLException {
		Scanner sc = new Scanner(System.in);
		CollegeBO cb = new CollegeBO();
		System.out.println("1.Create college");
		System.out.println("2.Search college by names");
		System.out.println("3.Search college by date");
		System.out.println("4.Search college by location");
		int opt = sc.nextInt();
		
		switch(opt) {
		case 1:
			System.out.println("Enter the colege with details");
			cb.createCollege(sc.next());
			break;
			
		case 2:
			List<String> nameList = new ArrayList<>();
			System.out.println("Enter the number of colleges to search");
			int n = sc.nextInt();
			System.out.println("Enter the colleges");
			for(int i=0;i<n;i++) {
				nameList.add(sc.next());
			}
			
			List<College> nameResult = cb.findCollege(nameList);
			for(College i:nameResult) {
				System.out.println(i);
			}
			break;
			
		case 3:
			System.out.println("Enter the starting date to search");
			String d = sc.next();
			DateFormat df = new SimpleDateFormat("dd:mm:yy");
			List<College> dateResult = cb.findCollege(df.format(d));
			for(College i:dateResult) {
				System.out.println(i);
			}
			
			break;
		
		case 4:
			System.out.println("Enter the location to search");
			List<College> loResult = cb.findCollege(sc.next());
			for(College i:loResult) {
				System.out.println(i);
			}
			break;
			
		default:
			System.out.println("Invalid");
			
		sc.close();
			
		}
	}

}
