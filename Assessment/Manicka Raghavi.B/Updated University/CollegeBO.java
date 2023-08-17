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
    
    //Create a college database
	void createCollegeDB() throws SQLException, ParseException
	{   
		System.out.println("Enter the College Details\nName,Website,Mobile,Founder,Number of Departments,Location,Date(dd:mm:yy)");
	    String details=sc.next();
	    
	    String[] detailArr=details.split(","); 
	    
	    SimpleDateFormat df=new SimpleDateFormat("dd:MM:yy");
	    java.util.Date date=df.parse(detailArr[6]); 
	    
	    College object=new College(detailArr[0],detailArr[1],detailArr[2],detailArr[3],Integer.valueOf(detailArr[4]),detailArr[5],date);

	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
	    PreparedStatement ps=con.prepareStatement("insert into college values(?,?,?,?,?,?,?)");
	    ps.setString(1,object.getName());
	    ps.setString(2,object.getWebsite()); 
	    ps.setString(3,object.getMobile());
	    ps.setString(4,object.getFounder());
	    ps.setInt(5,object.getDept());
	    ps.setString(6,object.getLocation()); 
	    ps.setDate(7,new java.sql.Date((object.getDate().getTime())));
	    int temp=ps.executeUpdate();
	    
	    if(temp>=1)
	    	System.out.println("Data Created Successfully");
	    
	}
	
	//Method to find College Details Based on College Name List
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
	
	//Method to find College Details Based on Starting Date
	public List<College> findCollege(java.util.Date startingDate) throws SQLException
	{
		List<College> collegeList=new ArrayList<>();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		PreparedStatement ps=con.prepareStatement("select*from college where date=?"); 
		ps.setDate(1,new java.sql.Date(startingDate.getTime()));
		rs=ps.executeQuery();
		while(rs.next())
		{
			  collegeList.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}
		Collections.sort(collegeList,(obj1,obj2)->(obj1.getDate().compareTo(obj2.getDate())));
		return collegeList; 
	}
	
	//Method to find College Details Based on Location
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
    
    //Method to return sorted college details based on department 
	public List<College> sortDept() throws SQLException
	{
		List<College> collegeList=new ArrayList<>();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		PreparedStatement ps=con.prepareStatement("select*from college"); 
		rs=ps.executeQuery();
		while(rs.next())
		{
			  collegeList.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		} 
		Collections.sort(collegeList,(obj1,obj2)->(obj1.getDept()>obj2.getDept()?1:-1));
		
		return collegeList;
	} 
	
	//Method to return sorted college details based on Starting Date 
	public List<College> sortDate() throws SQLException  
	
	{   List<College> collegeList=new ArrayList<>();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		PreparedStatement ps=con.prepareStatement("select*from college"); 
		rs=ps.executeQuery();
		while(rs.next())
		{
			  collegeList.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
		}  
		Collections.sort(collegeList,(obj1,obj2)->(obj1.getDate().compareTo(obj2.getDate())));
		return collegeList; 
	}
	
	public static void main(String[]args) throws ClassNotFoundException, SQLException, ParseException
    {
		CollegeBO obj=new CollegeBO(); 
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		System.out.println("WELCOME TO COLLEGE_BO");
		
		//To create the database for college 
		System.out.println("Enter the Number of College details you want to enter:");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		 {
			obj.createCollegeDB();  
		 }
		
		int flag=1; 
		
		while(flag==1)
		{   
			ArrayList<String> nameList=new ArrayList<>();  
			List<College>collegeDetails=new ArrayList<>();
			
			System.out.println("Enter 1->Find Result based on College name\nEnter 2->Find Result based on College Starting Date\nEnter 3->Find Result based on College Location\nEnter 4->Sort College List Based on the Number Of Departments\nEnter 5->Sort College List Based on Starting Date");
			int choice=sc.nextInt(); 
			
			switch(choice)
			{
			
			case 1: 
                System.out.println("Enter the College Names:"); 
                String name=sc.next(); 
                String []namesArray=name.split(",");
                nameList.addAll(Arrays.asList(namesArray));   
                collegeDetails= obj.findCollege(nameList);  
                if(collegeDetails.size()==0)
					System.out.print("Details not found");
				else
				{  
					System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");

					for(College object:collegeDetails)
	                {
	                	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getDept(),object.getLocation(),object.getDate());

	                }  
					
				}
                break;
                
			case 2:
				System.out.println("Enter the Starting Date"); 
				SimpleDateFormat df=new SimpleDateFormat("dd:MM:yy");
			    java.util.Date date=df.parse(sc.next()); 
				collegeDetails= obj.findCollege(date);  
				if(collegeDetails.size()==0)
					System.out.print("Details not found");
				else
				{
					System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
					
					for(College object:collegeDetails)
	                {
	                	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getDept(),object.getLocation(),object.getDate());

	                }  
				}
				 
                break; 
                
			case 3:
				System.out.println("Enter the Location");
				String location=sc.next();
				collegeDetails= obj.findCollege(location); 
				if(collegeDetails.size()==0)
					System.out.print("Details not found");
				else
				{  
					System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");

					for(College object:collegeDetails)
	                {
	                	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getDept(),object.getLocation(),object.getDate());

	                }  
					
				}
                break; 
                
			case 4:
				System.out.println("Sorted College List based on number of department:"); 
				collegeDetails= obj.sortDept(); 
				System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
				for(College object:collegeDetails)
				{
                	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getDept(),object.getLocation(),object.getDate());

				}
				break; 
				
			case 5:	
				System.out.println("Sorted College List based on starting date:");
				collegeDetails=obj.sortDate();
				System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
				for(College object:collegeDetails)
				{
                	System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getDept(),object.getLocation(),object.getDate());

				}
				break; 
							
			default:
				System.exit(0);
				
			} 
			System.out.println("\n");
		}
		
    }
}
