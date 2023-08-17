import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class CollegeBO {
    static List<College> c = new ArrayList<>();
    public Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");

    }
    public void createCollege(College college) throws SQLException, ClassNotFoundException {
        Connection con = getConnect();
        PreparedStatement ps = con.prepareStatement("insert into Item values(?,?,?,?,?,?,?)");
        ps.setString(1,college.getName());
        ps.setString(2, college.getWebsite());
        ps.setString(3,college.getMobile());
        ps.setString(4, college.getFounder());
        ps.setInt(5,college.getNumberOfDept());
        ps.setString(6,college.getLocation());
        ps.setDate(7, (java.sql.Date) college.getStartingDate());
        int x=ps.executeUpdate();
        System.out.println("Details added successfully");
    }
    public List<College> findCollege(List<String> nameList) throws SQLException, ClassNotFoundException {
        int flag=0;
        Connection con=getConnect();
        PreparedStatement ps = con.prepareStatement("select * from college where name=?");
        ps.setString(1, nameList.toString());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7));
            flag=1;
        }
        if(flag==0)
        {
            System.out.println("No College Found in Database");
        }

        return c;
    }
    public List<College> findCollege(Date StartingDate) throws SQLException, ClassNotFoundException {

        int flag=0;

        Connection con=getConnect();
        PreparedStatement ps = con.prepareStatement("select * from college where startdate=?");
        ps.setString(1, String.valueOf(StartingDate));
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7));
            flag=1;
        }
        if(flag==0)
        {
            System.out.println("No College Found in Database");
        }

        return c;
    }
    public List<College> findCollege(String location) throws SQLException, ClassNotFoundException {

        int flag=0;
        Connection con=getConnect();
        PreparedStatement ps = con.prepareStatement("select * from college where location=?");
        ps.setString(1, location);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7));
            flag=1;
        }
        if(flag==0)
        {
            System.out.println("No College Found in Database");
        }

        return c;
    }
}
