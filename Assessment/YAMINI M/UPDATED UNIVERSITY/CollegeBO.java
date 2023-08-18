package CollegeUniversity;

import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CollegeBO 
{
    public  void colList()throws Exception
	{
	Scanner sc=new Scanner(System.in);
	String[] s = sc.next().split(",");
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
        PreparedStatement ps=con.prepareStatement("select * from college where name=?");
        ResultSet rs=ps.executeQuery();
        
        SimpleDateFormat df=new SimpleDateFormat("dd:MM:yy");
        Date date=(Date) df.parse(s[6]);
        College col=new College(s[0],s[1],s[2],s[3],Integer.valueOf(s[4]),s[5],date);
        
        if(rs.next())
        {
        PreparedStatement ps1=con.prepareStatement("insert into college values(?,?,?)");
        ps1.setString(1, col.getName());
        ps1.setString(2,col.getWebsite() );
        ps1.setString(3, col.getMobile());
        ps1.setString(4, col.getFounder());
        ps1.setInt(5, col.getNumberOfDept());
        ps1.setString(6, col.getLocation());
        ps1.setDate(7, (Date) col.getStartingDate());
         	
        int temp=ps1.executeUpdate();
        
        if(temp==1)
        {
        	System.out.println("College added successfully");
        }
        else {
        }
        }
	}
        catch(ClassNotFoundException | SQLException  e)
    	{
       	System.out.println(e);	       
    	}
	}


	    private static Connection getConnect()throws Exception{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        return DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	    }
	    
	    public List<College> findCollege(List<String> nameList)throws Exception{
	        ArrayList<College> al = new ArrayList<>();
	        Connection con = getConnect();
	        for(String s : nameList){
	            PreparedStatement ps = con.prepareStatement("SELECT * FROM college where name = ?;");
	            ps.setString(1,s);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()){
	                al.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
	            }
	        }
	        al.sort((o1,o2)-> {
	                    return o1.getName().compareTo(o2.getName());
	                }
	        );
	        return al;
	    }
	    
	    
	    public List<College> findCollege(Date startingDate)throws Exception{
	        ArrayList<College> al = new ArrayList<>();
	        Connection con = getConnect();
	        PreparedStatement ps = con.prepareStatement("SELECT * FROM college where startDate = ?;");
	        ps.setObject(1,startingDate);
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()){
	            al.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
	        }
	        al.sort((o1,o2)-> {
	                return o1.getStartingDate().compareTo(o2.getStartingDate());
	            }
	        );
	        return al;
	    }
	    
	    
	    public List<College> findCollege(String location)throws Exception{
	        ArrayList<College> al = new ArrayList<>();
	        Connection con = getConnect();
	        PreparedStatement ps = con.prepareStatement("SELECT * FROM college where location = ?;");
	        ps.setString(1,location);
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()){
	            al.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
	        }
	        al.sort((o1,o2)-> {
	                    return o1.getLocation().compareTo(o2.getLocation());
	                }
	        );
	        return al;
	    }
       
	    
	    public ArrayList<College> sortDept()throws Exception{
	        ArrayList<College> al = new ArrayList<>();
	        Connection con = getConnect();
	        PreparedStatement ps = con.prepareStatement("SELECT * FROM college order by noOfdept;");
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()){
	            al.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
	        }
	        al.sort((o1,o2)-> {
	                    if(o1.getNumberOfDept()>o2.getNumberOfDept()){
	                        return 1;
	                    }
	                    else return -1;
	                }
	        );
	        return al;
	    }
	    
	    
	public static void main(String[]args) throws Exception
        {
		CollegeBO obj=new CollegeBO(); 
	
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO COLLEGE UNIVERSITY");
		System.out.println("Enter the Number of College details you want to enter:");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		 {
			obj.colList();  
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
	                	           System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getNumberOfDept(),object.getLocation(),object.getStartingDate());

	                               }  
					
				}
                                break;
                
			case 2:
				System.out.println("Enter the Starting Date"); 
				 SimpleDateFormat df=new SimpleDateFormat("dd:MM:yy");
			     Date date=(Date) df.parse(sc.next());
				 collegeDetails= obj.findCollege(date);  
				if(collegeDetails.size()==0)
					System.out.print("Details not found");
				else
				{
					System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
					
					for(College object:collegeDetails)
	                                {
	                	          System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getNumberOfDept(),object.getLocation(),object.getStartingDate());

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
	                	         System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getNumberOfDept(),object.getLocation(),object.getStartingDate());

	                                }  
					
				}
                                break; 
                
			case 4:
				System.out.println("Sorted College List based on number of department:"); 
				collegeDetails= obj.sortDept(); 
				System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n","Name","Website","Mobile","Founder","No.of departments","Location","Starting Date");
				for(College object:collegeDetails)
				{
                	         System.out.format("%-15s %-20s %-15s %15s %-20s %-15s %s\n",object.getName(),object.getWebsite(),object.getMobile(),object.getFounder(),object.getNumberOfDept(),object.getLocation(),object.getStartingDate());

				}
				break; 
					
			default:
				System.exit(0);
				
			} 
			System.out.println("\n");
		}
		
         }
}
