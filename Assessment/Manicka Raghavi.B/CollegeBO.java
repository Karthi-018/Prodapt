package university;
import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class CollegeBO 
{
    static Scanner sc=new Scanner(System.in);  
    ResultSet rs;

	void createCollegeDB() throws SQLException, ParseException
	{   
		System.out.println("Enter the College Details:");
	    String details=sc.nextLine();
	    
	    String[] detailArr=details.split(","); 
	    
	    SimpleDateFormat df=new SimpleDateFormat("dd:mm:yy");
	    Date date=(Date) df.parse(detailArr[6]); 
	    
	    College object=new College(detailArr[0],detailArr[1],detailArr[2],detailArr[3],Integer.valueOf(detailArr[4]),detailArr[5],date);
	    
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
	    PreparedStatement ps=con.prepareStatement("insert into college valuse(?,?,?,?,?,?,?)");
	    ps.setString(1,object.getName());
	    ps.setString(2,object.getWebsite()); 
	    ps.setString(3,object.getMobile());
	    ps.setString(4,object.getFounder());
	    ps.setInt(5,object.getDept());
	    ps.setString(6,object.getLocation());
	    ps.setDate(7,(Date) object.getDate()); 
	    int temp=ps.executeUpdate();
	    
	    if(temp>=1)
	    	System.out.println("Data Created Successfully");
	    
	}
	
	public List<College> findCollege(List<String> nameList) throws SQLException
	{   
		List<College> collegeList=new ArrayList<>();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root"); 
		for(String name:nameList)
		{
			PreparedStatement ps=con.prepareStatement("select*from college");
			rs=ps.executeQuery();
			while(rs.next())
			{
			  if(rs.getString(1).equals(name))
			  {
				  collegeList.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
			  }
			}
			
		} 
		
		Collections.sort(collegeList,(obj1,obj2)->(obj1.getName().compareTo(obj2.getName())));
		return collegeList;
		
	} 
	
	public List<College> findCollege(Date startingDate) throws SQLException
	{
		List<College> collegeList=new ArrayList<>();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		PreparedStatement ps=con.prepareStatement("select*from college where date=?"); 
		ps.setDate(1,startingDate);
		rs=ps.executeQuery();
		while(rs.next())
		{
			  collegeList.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		Collections.sort(collegeList,(obj1,obj2)->(obj1.getDate().compareTo(obj2.getDate())));
		return collegeList; 
	}
	
	public List<College> findCollege(String location) throws SQLException
	{
		List<College> collegeList=new ArrayList<>();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		PreparedStatement ps=con.prepareStatement("select*from college where location=?"); 
		ps.setString(1, location);
		rs=ps.executeQuery();
		while(rs.next())
		{
			  collegeList.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		return collegeList; 
		
	}
	
	
	
	public static void main(String[]args) throws ClassNotFoundException, SQLException, ParseException
    {
		CollegeBO obj=new CollegeBO(); 
		
		
		Class.forName("com.cj.mysql.jdbc.Driver");
		
		System.out.println("WELCOME TO COLLEGE BO");
		
		//TO create the database for college
		obj.createCollegeDB();  
		int flag=1; 
		
		ArrayList<String> nameList=new ArrayList<>();
		while(flag==1)
		{
			System.out.println("Enter 1->Find Result based on College name\nEnter 2->Find Result based on College Starting Date\nEnter 3->Find Result based on College Location");
			int choice=sc.nextInt(); 
			
			switch(choice)
			{
			case 1: 
				String name;
                do
                {
                	System.out.println("Enter the College Name: else enter 0"); 
                	name=sc.next();
                	nameList.add(name);
                }while(name!="0"); 
                List<College>collegeDetails= obj.findCollege(nameList);  
                System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
                for(College object:collegeDetails)
                {
                	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getDept(),object.getLocation(),object.getDate());
                }  
                break;
                
			case 2:
				System.out.println("Enter the Starting Date");
				SimpleDateFormat df=new SimpleDateFormat("dd:mm:yy");
				Date date=(Date) df.parse(sc.next()); 
				List<College>collegeDetails1= obj.findCollege(date); 
				System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
				for(College object:collegeDetails1)
                {
                	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getDept(),object.getLocation(),object.getDate());

                }  
                break; 
                
			case 3:
				System.out.println("Enter the Location");
				String location=sc.next();
				List<College>collegeDetails2= obj.findCollege(location); 
				System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
				for(College object:collegeDetails2)
                {
                	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getDept(),object.getLocation(),object.getDate());

                }  
                break;  
                
				
				
				
                
				
				
				
			}
		}
		
		
		
		
		
		
		
		
    }
}
