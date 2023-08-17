package University;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CollegeBo
{
    public List<College> findCollege(List<String> nameList) throws ClassNotFoundException, SQLException
    {
        List<College> searchlist=new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
        PreparedStatement ps=c.prepareStatement("SELECT * from colleges WHERE nameList=?;");
        ps.setString(1, nameList.toString());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String name=rs.getString("name");
            String website=rs.getString("website");
            String mobile=rs.getString("mobile");
            String founder=rs.getString("founder");
            int numberofDept=rs.getInt("numberofDept");
            String location=rs.getString("location");
            Date startingDate=rs.getDate("startingDate");
            searchlist.add(new College(name,website,mobile,founder,numberofDept,location,startingDate));
        }
        return searchlist;
    }


    public List<College> findCollege(Date startingDate) throws ClassNotFoundException, SQLException
    {
        List<College> datelist=new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
        PreparedStatement ps=c.prepareStatement("SELECT * from colleges WHERE location=?;");
        ps.setDate(1,startingDate);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String name=rs.getString("name");
            String website=rs.getString("website");
            String mobile=rs.getString("mobile");
            String founder=rs.getString("founder");
            int numberofDept=rs.getInt("numberofDept");
            String location=rs.getString("location");
            Date startingDate1=rs.getDate("startingDate");
            datelist.add(new College(name,website,mobile,founder,numberofDept,location,startingDate1));
        }
        return datelist;
    }

    public List<College> findCollege(String location) throws ClassNotFoundException, SQLException
    {
        List<College> locationlist=new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
        PreparedStatement ps=c.prepareStatement("SELECT * from colleges WHERE location=?;");
        ps.setString(1,location);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String name=rs.getString("name");
            String website=rs.getString("website");
            String mobile=rs.getString("mobile");
            String founder=rs.getString("founder");
            int numberofDept=rs.getInt("numberofDept");
            String location1=rs.getString("location");
            Date startingDate=rs.getDate("startingDate");
            locationlist.add(new College(name,website,mobile,founder,numberofDept,location1,startingDate));
        }
        return locationlist;
    }

}
