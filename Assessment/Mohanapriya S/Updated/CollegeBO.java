package edu.prodapt.demo;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class CollegeBO {
	static Scanner s=new Scanner(System.in);
	static College_main_updated items=new College_main_updated();
	//static List<College>list1=new ArrayList<>();
	static List<College>list=new ArrayList<>();
	public static void main(String []args) throws Exception
	{
		try{
			System.out.println("Enter the number of colleges");
			int num=s.nextInt();
			for(int i=0;i<num;i++)
			{
			System.out.println("Enter the name,website,mobile,founder,number_of_department,location,starting_date of the song seperated by comma");
			String line=s.next();
			College c=new College();
			list.add(c.createCollege(line));
			System.out.println(list);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("Insert college values (?,?,?,?,?,?,?)");
			for(College data:list)
			{
				ps.setString(1, data.getname());
				ps.setString(2, data.getwebsite());
				ps.setString(3, data.getmobile());
				ps.setString(4, data.getfounder());
				ps.setInt(5, data.getnumberOfDept());
				ps.setString(6, data.getlocation());
				ps.setObject(7, (Date)data.getstartingDate());
				ps.executeUpdate();
			}
			}
			userchoice();
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
	}
	static void userchoice()
	{
		System.out.println("Enter your choice");
		System.out.println("1.To search using name/n2.To search using date of starting/n3.To search using location/n4.To Sort the college");
		int n=s.nextInt();
		s.nextLine();
		choiceloop(n);
		
	}
	
	static void choiceloop(int n)
	{
		switch(n)
		{
		case 1:
			System.out.println("Enter the name to be searched");
			String typ=s.next();
			List<College>find=items.findCollege(typ);
			display(find);
			break;
			
		case 2:
			System.out.println("Enter the date to be searched");
			String typ1=s.nextLine();
			DateFormat df = new SimpleDateFormat("dd:mm:yy");
			List<College> find1 = items.findCollege(df.format(typ1));
			//List<College>find1=items.findCollege1(typ1);
			display(find1);
			break;
			
		case 3:
			System.out.println("Enter the location to be searched");
			String typ2=s.nextLine();
			List<College>find2=items.findCollege2(typ2);
			display(find2);
			break;
			
		case 4:
			list.sort((t1,t2)->(t1.getname().compareTo(t2.getname())));
            list.forEach(System.out::println);
		}
	}
	
	
	public static void display(List<College>list)
	{
		if(!list.isEmpty())
    	{
    	for(College fi:list)
    	{
    		System.out.format("%-15s %-20s %-15s %-15s %-8s %-20s %-15s%n",fi.getname(),fi.getwebsite(),fi.getmobile(),fi.getfounder(),fi.getnumberOfDept(),fi.getlocation(),fi.getstartingDate() );
    	}}
    	else
    	{
    		System.out.println("No such Item is present");	
    	}
	}
	

}
