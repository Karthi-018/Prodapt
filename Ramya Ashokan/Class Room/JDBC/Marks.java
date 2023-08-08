package jdbcs;
import java.sql.*;
import java.util.*;
public class Marks {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks range");
int marks=sc.nextInt();
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
PreparedStatement ps=con.prepareStatement("select * from student where marks>?;");
ps.setInt(1, marks);
ResultSet rs=ps.executeQuery();
System.out.println("Id\tName\tMarks");
while(rs.next())
{
	System.out.println(rs.getInt("studId")+"\t"+rs.getString("sname")+"\t"+rs.getInt("marks"));
}
}
catch(ClassNotFoundException |SQLException e)
{
	System.out.println(e.getMessage());
	
}}
}
