package edu.prodapt.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class CollegeBO {
	static Scanner s=new Scanner(System.in);
	public static void main(String []args)
	{
		College data=new College();
		System.out.println("Enter the number of colleges");
		int num=s.nextInt();
		try{
			for(int i=0;i<num;i++)
			{
			System.out.println("Enter the name,website,mobile,founder,number_of_department,location,starting_date of the song seperated by comma");
			String line=s.next();
			College S=new College();
			S=College.createCollege(line);
			data.add(S);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("Insert employee values (?,?,?,?,?,?,?)");
			ps.setString(1, data.getname());
			ps.setString(2, data.getwebsite());
			ps.setString(3, data.getmobile());
			ps.setString(4, data.getfounder());
			ps.setInteger(5, data.getnumberOfDept());
			ps.setString(6, data.getlocation());
			ps.setDate(7, data.getstartingDate());
			ps.executeUpdate();
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
	}
	static void userchoice()
	{
		
	}

}
