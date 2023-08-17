import java.sql.*;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class CollegeBO {
    public List<College>findCollege(List<String>nameList) throws SQLException
    {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql:localhost//3306/prodapt", "root", "root");
            PreparedStatement ps = c.prepareStatement("Select * from College");
            ps.setString(0, nameList.toString());
            //Scanner s=new Scanner(System.in);
            //ResultSet rs=ps.getResultSet();
            ps.executeQuery();
        }
        catch(SQLException e){System.out.println(e);}
        return null;
    }


    public List<College>findCollege(Date startingDate) throws SQLException
    {
        try{
            Connection c= DriverManager.getConnection("jdbc:mysql:localhost//3306/prodapt","root","root");
            PreparedStatement ps= c.prepareStatement("Select startingDate from College");
            ps.setDate(0, (java.sql.Date) startingDate);
            ps.executeQuery();

        }
        catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }

    public List<College>findCollege(String location)throws SQLException
    {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql:localhost//3306/prodapt", "root", "root");
            PreparedStatement ps = c.prepareStatement("Select name from college");
            ps.setString(0,location);
            ps.executeQuery();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
