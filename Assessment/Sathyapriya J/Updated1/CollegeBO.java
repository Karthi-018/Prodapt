package test1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.sql.ResultSet;





public class CollegeBO 
{
	
	PreparedStatement ps;
	ResultSet rs;
	public void createCollege(College c) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		ps = con.prepareStatement("insert into college values(?,?,?,?,?,?,?)");
		ps.setString(1, c.getName());
		ps.setString(2, c.getWebsite());
		ps.setString(3, c.getMobile());
		ps.setString(4, c.getFounder());
		ps.setInt(5, c.getNumberOfDept());
		ps.setString(6, c.getLocation());
		java.util.Date utilDate = c.getStartingDate();
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		ps.setDate(7,sqlDate);
		
		int update = ps.executeUpdate();
		if(update == 1)
		{
			System.out.println("Details added successfully.");
		}
		else
		{
			System.out.println("Details failed to add.");
		}
		
		
	}
	
	public List<College> findCollege(Date startingDate) throws SQLException {

        List<College> colleges = new ArrayList<>();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
        String query = "SELECT * FROM college WHERE startingdate = ?";
        ps = con.prepareStatement(query);
        ps.setDate(1, startingDate);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            College college = CollegeFromResultSet(rs);

            colleges.add(college);
            

        }
        return colleges;

    }
	 public List<College> findCollegeByName(List<String> name) throws SQLException {

	        List<College> colleges = new ArrayList<>();

			for(int i=0;i<name.size();i++) {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
				ps = con.prepareStatement("select * from college where name = ?");
				ps.setString(1,name.get(i));
				rs = ps.executeQuery();
				while(rs.next()) {
					colleges.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
				}
			}
	        return colleges;

	    }

    public List<College> findCollege(String location) throws SQLException {

        List<College> colleges = new ArrayList<>();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
        String query = "SELECT * FROM college WHERE location = ?";
        ps = con.prepareStatement(query);
        ps.setString(1, location);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) 
        {
        	College college = CollegeFromResultSet(rs);
        	colleges.add(college);
        }
        return colleges;

    }

 

    private College CollegeFromResultSet(ResultSet rs) throws SQLException 
    {

    	String name = rs.getString("name");
    	String website = rs.getString("website");
    	String mobile = rs.getString("mobile");
    	String founder = rs.getString("founder");
    	int numberOfDept = rs.getInt("numberOfdept");
    	String location = rs.getString("location");
    	Date startingDate = rs.getDate("startingdate");
    	return new College(name, website, mobile, founder, numberOfDept, location, startingDate);

    }
    public void displayColleges(List<College> colleges) 
    {

        String format = "%-15s %-20s %-15s %-15s %-8s %-20s %-15s%n";
        for (College college : colleges) 
        {
        	System.out.format(format,college.getName(),college.getWebsite(),college.getMobile(),college.getFounder(),college.getNumberOfDept(),college.getLocation(),college.getStartingDate() );

        }

    }
    public static List<College> sortByName(List<College> colleges)
    {
        Collections.sort(colleges, (o1,o2) -> (o1.getName().compareTo(o2.getName())<0)? -1 : (o1.getName().compareTo(o2.getName())>0)? 1:0);
        return colleges;
    }

    public static List<College> sortByDate(List<College> colleges)
    {
        Collections.sort(colleges, (o1,o2) -> (o1.getStartingDate().compareTo(o2.getStartingDate())<0)? -1 : (o1.getStartingDate().compareTo(o2.getStartingDate())>0)? 1:0);
        return colleges;
    }

    public static List<College> sortByNoOfDept(List<College> colleges)
    {
        Collections.sort(colleges, (o1,o2) -> (o1.getNumberOfDept()<o2.getNumberOfDept())? -1 : (o1.getNumberOfDept()<o2.getNumberOfDept())? 1:0);
        return colleges;
    }
   
}
