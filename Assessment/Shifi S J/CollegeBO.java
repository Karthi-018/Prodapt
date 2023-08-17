package college;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class CollegeBO {
    private static Connection getConnect()throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/shifi","root","root");
    }
        public List<college> findCollege(List<String> nameList)throws Exception{
        ArrayList<college> al = new ArrayList<>();
        Connection con = getConnect();
        for(String s : nameList)
        {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM college where name = ?;");
            ps.setString(1,s);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                al.add(new college(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
            }
}
        				
	{
		public List<college> findCollege(Date startingDate)throws Exception{
	        ArrayList<college> arr = new ArrayList<>();
	        Connection con = getConnect();
	        PreparedStatement ps = con.prepareStatement("SELECT * FROM college1 where startDate = ?;");
	        ps.setObject(1,startingDate);
	        ResultSet rs = ps.executeQuery();
	        while (rs.next())
	        {
	            arr.add(new college(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
	        }
	        
	        
		public List<college> findCollege1(String location)
		{
		List<college> search = new ArrayList<>();
		Connection con = jdbc.getConnection();
		PreparedStatement ps = con.prepareStatement(" select * from college where location = ? ");
		ps.setString(1, location);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
		search.add(new college(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6), null));
		}
				
		public void displayChoice() {
			
		System.out.println("1. Search college by name");
		System.out.println("2. Search college by startingDate");
		System.out.println("3. Search college by location");
		System.out.println("Select the option");
		Scanner sc;
		int opt  = sc.nextInt();
		switchCase(opt);
			
		}
		
		
		public void switchCase(int opt) {
			
			Object sc;
			switch(opt) {
									
						
			case 1:
						
			    ArrayList<String> a = new ArrayList<>();
	                    String[] collegeNames = sc.next().split(",");
	                    for(String g : collegeNames){
	                        a.add(g);
	                    }
	                    List<college> collegeList = new CollegeBO().findCollege(a);
	                    for(college c : collegeList){
	                        System.out.println(c);
	                    }
	                    break;
						
						
					
				
		    case 2:
						
			System.out.println("Enter the startingDate");
			List<college> startingDate = findCollege(new Date(((Object) sc).nextDate()));
			display(startingDate);
			displayChoice();
			break;
						
						
		   case 3:
						
			System.out.println("Enter the location");
			List<college> itemType = findCollege1(sc.next());
			display(collegeName);
			displayChoice();
			break;
						
						
						
		 default:
						
			System.out.println("Invalid choice");
						
			}
					
		}
		
		
		private void display(List<college> startingDate) {
			
		}
		public static void main1(String[] args) {
			
			CollegeBO id = new CollegeBO();
			id.displayChoice();
			
		}

	}
		
		
	
	
	
	
	
	
	
	
	
	
	
