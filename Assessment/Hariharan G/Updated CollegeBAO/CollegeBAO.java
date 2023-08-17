package practice;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.*;
import java.text.*;

public class CollegeBAO 
{
	static List<College> l=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	PreparedStatement ps;
	ResultSet rs;
	
	public void createCollege()throws Exception{
		System.out.println("Enter number of college details to be entered in the database:");
		int num=sc.nextInt();
		for(int j=0;j<num;j++) {
			System.out.println("Enter college details!");
			String collegeData=sc.next();
			String arr[]=collegeData.split(",");
			for(String s:arr) {
				System.out.println(s);
			}
			String date0=arr[6];
//			java.util.Date utilDate = new java.util.Date();
//		    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			DateFormat df = new SimpleDateFormat("dd:MM:yy");
            java.sql.Date date = (java.sql.Date) df.parse(date0);
			//DateFormat df=new SimpleDateFormat("DD-MM-YY");
			//..Date d=(Date) df.parse(arr[6]);
			//java.util.Date d=df.parse(arr[6]);
			int i=Integer.parseInt(arr[4]);
			l.add(new College(arr[0],arr[1],arr[2],arr[3],i,arr[5],date));
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			String query="insert into college values(?,?,?,?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1,arr[0]);
			ps.setString(2,arr[1]);
			ps.setString(3,arr[2]);
			ps.setString(4,arr[3]);
			ps.setInt(5,i);
			ps.setString(6, arr[5]);
			ps.setObject(7,(Date)date);
			//ps.setDate(7,new java.sql.Date(d.getTime()));
			//ps.setDate(7,(Date) d);
			ps.executeUpdate();
			System.out.println("College details entered!");
			
		}
		System.out.println(num+" College details entered in the database!");
	}
	public void operation()throws Exception {
		System.out.println("Select\n1. Find college by name\n2. Find college by starting date\n3. Find college by location\n4. Sort based on Number od Departments");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter college names to find");
			String find=sc.next();
			List<String> nameList=new ArrayList<>();
			nameList.add(find);
			List<College>col=findCollege(nameList);
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No of Departments","Location","Starting Date");
			for(College cc:col) {
				System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",cc.getName(),cc.getWebsite(),cc.getMobile(),cc.getFounder(),cc.getNumberOfDept(),cc.getLocation(),cc.getStartingDate());
			}
			operation();
			break;
						
		case 2:
			System.out.println("Find college by starting date:");
			String d1=sc.next();
			DateFormat df=new SimpleDateFormat("DD-MM-YY");
			Date d=(Date) df.parse(d1);
			List<College> c1=findCollege(d1);
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No of Departments","Location","Starting Date");
			for(College cc:c1) {
				System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",cc.getName(),cc.getWebsite(),cc.getMobile(),cc.getFounder(),cc.getNumberOfDept(),cc.getLocation(),cc.getStartingDate());
			}
			operation();
			break;
			
		case 3:
			System.out.println("Find college by locations");
			String location=sc.next();
			List<College> c2=findCollege(location);
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No of Departments","Location","Starting Date");
			for(College cc:c2) {
				System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",cc.getName(),cc.getWebsite(),cc.getMobile(),cc.getFounder(),cc.getNumberOfDept(),cc.getLocation(),cc.getStartingDate());
			}
			operation();
			break;
		
		case 4:
			System.out.println("Sorting based upon Number Of Departments");
			List<College> c3=sortNoOfDepartment();
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No of Departments","Location","Starting Date");
			for(College cc:c3) {
				System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",cc.getName(),cc.getWebsite(),cc.getMobile(),cc.getFounder(),cc.getNumberOfDept(),cc.getLocation(),cc.getStartingDate());
			}
			operation();
			break;
		
		default:
			System.out.println("BYE!!!");
			System.exit(0);
		}
	}
	
	public List<College> findCollege(List<String> nameList) throws Exception{
		String arr=nameList.get(0);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		String arr1[]=arr.split(",");
		int c=arr1.length;
		System.out.println(c);
		List<College> college = new ArrayList<>();
		for(int i=0;i<c;i++) {
			String query="select * from college where name=? ";
			
			ps=con.prepareStatement(query);
			ps.setString(1, arr1[i]);
			
			//int temp=ps.executeUpdate();	
			
			rs=ps.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getInt(5)+rs.getString(6)+rs.getDate(7));
//			}
			while(rs.next()) {
				college.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(java.sql.Date) rs.getObject(7)));
			}
		}
		Collections.sort(college,(obj1,obj2)->obj1.getName().compareTo(obj2.getName()));
		
		return college;
		
		
	}
	public List<College> findCollege(Date startingDate)throws Exception{
		String query="select * from college where startingDate=?";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		ps=con.prepareStatement(query);
		ps.setObject(1,startingDate);
		//ps.setDate(1, startingDate);
		rs=ps.executeQuery();
		List<College> college=new ArrayList<>();
		while(rs.next()) {
			college.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(java.sql.Date)rs.getObject(7)));
		}
		Collections.sort(college,(obj1,obj2)->obj1.getStartingDate().compareTo(obj2.getStartingDate()));
		return college;
		
	}
	public List<College> findCollege(String location)throws Exception{
		String query="select * from college where location=?";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		ps=con.prepareStatement(query);
		ps.setString(1, location);
		rs=ps.executeQuery();
		List<College> college=new ArrayList<>();
		while(rs.next()) {
			college.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(java.sql.Date)rs.getObject(7)));
		}
		Collections.sort(college,(obj1,obj2)->obj1.getName().compareTo(obj2.getName()));
		return college;
		
	}
	public List<College> sortNoOfDepartment()throws Exception{
		String query="select * from college";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		ps=con.prepareStatement(query);
		rs=ps.executeQuery();
		List<College> college=new ArrayList<>();
		while(rs.next()) {
			college.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(java.sql.Date)rs.getObject(7)));
		}
		Collections.sort(college,(obj1,obj2)->obj1.getNumberOfDept()>obj2.getNumberOfDept()?1:-1);
		return college;
	}
	
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("SUCCESS!!!");
			CollegeBAO c=new CollegeBAO();
			c.createCollege();
			System.out.println(l);
			c.operation();		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
