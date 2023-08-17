package university.tst;
import java.sql.*;
import java.sql.Date;
import java.util.*;

public class CollegeBO {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CollegeBO c=new CollegeBO ();
		List<String> nameList1=new ArrayList<>();
		c.findCollege(nameList1);
		
		
	}
	public List<College> findCollege(List<String> nameList) throws ClassNotFoundException, SQLException{
		List<College> nameList1=new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		System.out.println("Enter the College Name:");
		String name=sc.next();
		PreparedStatement ps=con.prepareStatement("SELECT*FROM college Where name=?");
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println("College name"+name);
		}
		
		return null;
		
		
	}
	public List<College> findCollege(Date startingDate){
		List<College> nameList1=new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		System.out.println("Enter date:");
		Date date=sc.next();
		PreparedStatement ps=con.prepareStatement("select name from college where date=?");
		ps.setDate(1,date);
		ResultSet rs=ps.executeQuery();
		
		
		
	}
	public List<College> findCollege(String location) throws ClassNotFoundException, SQLException{
		List<College> nameList1=new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		String location1=sc.next();
		PreparedStatement ps=con.prepareStatement("select name from college where location=?");
		ps.setString(1, location1);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println("college name"+College.getName());
		}
		
		return null;
		
	}
	

}
