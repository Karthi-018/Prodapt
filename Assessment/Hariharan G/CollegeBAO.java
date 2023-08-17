package practice;
import java.util.*;
import java.sql.*;
import java.sql.Date;
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
			DateFormat df=new SimpleDateFormat("DD-MM-YY");
			Date d=(Date) df.parse(arr[6]);
			//java.util.Date d=df.parse(arr[6]);
			int i=Integer.parseInt(arr[4]);
			l.add(new College(arr[0],arr[1],arr[2],arr[3],i,arr[5],d));
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			String query="insert into college values(?,?,?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1,arr[0]);
			ps.setString(2,arr[1]);
			ps.setString(3,arr[2]);
			ps.setString(4,arr[3]);
			ps.setInt(5,i);
			ps.setString(6, arr[5]);
			ps.setDate(7,(Date) d);
			ps.executeUpdate();
			System.out.println("College details entered!");
			
		}
		System.out.println(num+" College details entered in the database!");
	}
	public void operation()throws Exception {
		System.out.println("Select\n1. Find college by name\n2. Find college by starting date\n3. Find college by starting date");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter college names to find");
			String find=sc.next();
			List<String> nameList=new ArrayList<>();
			nameList.add(find);
			List<College>col=findCollege(nameList);

//			int index=0;
//			for(College i:l) {
//				nameList.add(l.get(index).getName());
//				index=index+1;
//			}
						
		case 2:
			System.out.println("Find college by starting date:");
			String d1=sc.next();
			DateFormat df=new SimpleDateFormat("DD-MM-YY");
			Date d=(Date) df.parse(d1);
			List<College> c1=findCollege(d1);
			
		}
	}
	
	public List<College> findCollege(List<String> nameList) throws Exception{
		String arr=nameList.get(0);
		
		String arr1[]=arr.split(",");
		int c=arr1.length;
		for(int i=0;i<c;i++) {
			String query="select name from college where name=? order by name";
			ps.setString(1, arr1[i]);
			ps.executeUpdate();		
		}
		List<College> college = null;
		return college;
		
		
	}
	public List<College> findCollege(Date startingDate)throws Exception{
		
	}
	public List<College> findCollege(String location)throws Exception{
		
	}
	
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("SUCCESS!!!");
			CollegeBAO c=new CollegeBAO();
			c.createCollege();
			System.out.println(l);
			c.operation();
			
			
			//Conection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
