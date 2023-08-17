package assessment;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollegeBO {
	Scanner sc = new Scanner(System.in);
	DBconnectivity db = new DBconnectivity();
	Connection con = db.createConnection();
	PreparedStatement ps;
	ResultSet rs;
	

	public List<College> findCollege(List<String> nameList) throws SQLException{
		List<College> find = new ArrayList<>();
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
		List<College> find = new ArrayList<>();
		ps = con.prepareStatement("select * from college where startingDate = ?");
		ps.setDate(1, startingDate);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			find.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		
		return find;
		
	}
	
	
	
	public List<College> findCollege(String location) throws SQLException{
		List<College> find = new ArrayList<>();
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
		System.out.println(Arrays.toString(create));
		Integer numberOfDept = new Integer(create[4]);
		DateFormat df = new SimpleDateFormat("dd:mm:yy");
		java.util.Date startingDate = df.parse(create[6]); 
		College col = new College(create[0],create[1],create[2],create[3],numberOfDept,create[5],startingDate);
		ps = con.prepareStatement("insert into college values(?,?,?,?,?,?,?)");
		ps.setString(1,col.getName() );
		ps.setString(2,col.getWebsite());
		ps.setString(3,col.getMobile());
		ps.setString(4,col.getFounder());
		ps.setInt(5, col.getNumberOfDept());
		ps.setString(6, col.getLocation());
		ps.setDate(7, new java.sql.Date(col.getStartingDate().getTime()));
		int temp = ps.executeUpdate();
		if(temp == 1) {
			System.out.println("College added successfully");
		}
	}
	
	
	
	public void sortDept(List<College> list) {
		Collections.sort(list,(o1,o2)->o1.getNumberOfDept().compareTo(o2.getNumberOfDept()));
		for(College i:list) {
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",i.getName(),i.getWebsite(),
					i.getMobile(),i.getFounder(),i.getNumberOfDept(),i.getLocation(),i.getStartingDate());
		}
		
	}
	
	public void sortName(List<College> list) {
		Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));
		for(College i:list) {
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",i.getName(),i.getWebsite(),
					i.getMobile(),i.getFounder(),i.getNumberOfDept(),i.getLocation(),i.getStartingDate());
		}
		
	}
	
	public void sortDate(List<College> list) {
		Collections.sort(list,(o1,o2)->o1.getStartingDate().compareTo(o2.getStartingDate()));
		for(College i:list) {
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",i.getName(),i.getWebsite(),
					i.getMobile(),i.getFounder(),i.getNumberOfDept(),i.getLocation(),i.getStartingDate());
		}
		
	}
	
	
	public void sortCase(List<College> result) {
		System.out.println("1.Sort by college name");
		System.out.println("2.sort by date ");
		System.out.println("3.sort by department");
		int opt = sc.nextInt();
		
		switch(opt) {
		case 1:
			sortName(result);
			break;
			
		case 2:
			sortDate(result);
			break;
			
		case 3:
			sortDept(result);
			break;
			
		default:
			System.out.println("Invalid option");
		}
	}
	
	
	public void switchCase() throws ParseException, SQLException {
		
		System.out.println("1.Create college");
		System.out.println("2.Search college by names");
		System.out.println("3.Search college by date");
		System.out.println("4.Search college by location");
		System.out.println("5.Exit");
		int opt = sc.nextInt();
		List<College> result; 
		
		switch(opt) {
		case 1:
			System.out.println("Enter the college with details");
			String s = sc.next();
			createCollege(s);
			switchCase();
			break;
			
		case 2:
			List<String> nameList = new ArrayList<>();
			System.out.println("Enter the number of colleges to search");
			int n = sc.nextInt();
			System.out.println("Enter the colleges");
			for(int i=0;i<n;i++) {
				String college = sc.next();
				nameList.add(college);
			}
			
			result = findCollege(nameList);
			if(result.size()==0) {
				System.out.println("No colleges found");
			}
			else {
				sortCase(result);
			}
			
			result.clear();
			switchCase();
			break;
			
		case 3:
			System.out.println("Enter the starting date to search");
			String d = sc.next();
			DateFormat df = new SimpleDateFormat("dd:mm:yy");
			java.util.Date date = df.parse(d); 
			result = findCollege(new java.sql.Date(date.getTime()));
			if(result.size()==0) {
				System.out.println("No dates found");
			}
			else {
				sortCase(result);
			}
			result.clear();
			switchCase();
			break;
		
		case 4:
			System.out.println("Enter the location to search");
			result = findCollege(sc.next());
			if(result.size()==0) {
				System.out.println("No locations found");
			}
			else {
				sortCase(result);
			}
			result.clear();
			switchCase();
			break;
			
		case 5:
			db.closeConnection();
			System.exit(0);
			
		default:
			System.out.println("Invalid");
			
		
		
		}
	
	}
	
	
	public static void main(String[] args) throws ParseException, SQLException {
		CollegeBO cb = new CollegeBO();
		cb.switchCase();
	}

}
