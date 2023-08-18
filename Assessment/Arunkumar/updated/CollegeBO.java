package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.*;
public class CollegeBO {
    private static Connection getConnect()throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
    }
    public List<College> findCollege(List<String> nameList)throws Exception{
        ArrayList<College> al = new ArrayList<>();
        Connection con = getConnect();
        for(String s : nameList){
            PreparedStatement ps = con.prepareStatement("SELECT * FROM college1 where name = ?;");
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
        PreparedStatement ps = con.prepareStatement("SELECT * FROM college1 where DATE(startDate) = ?;");
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
        PreparedStatement ps = con.prepareStatement("SELECT * FROM college1 where location = ?;");
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
    static void save(College c) throws Exception{
        Connection con = getConnect();
        PreparedStatement ps = con.prepareStatement("INSERT INTO COLLEGE1 VALUES(?,?,?,?,?,?,?)");
        ps.setString(1,c.getName());
        ps.setString(2,c.getWebsite());
        ps.setString(3,c.getMobile());
        ps.setString(4,c.getFounder());
        ps.setInt(5,c.getNoOfDept());
        ps.setString(6,c.getLocation());
        ps.setObject(7, (Date) c.getStartingDate());
        ps.executeUpdate();
    }
    static ArrayList<College> sortDept()throws Exception{
        ArrayList<College> al = new ArrayList<>();
        Connection con = getConnect();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM college1 order by noOfdept;");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            al.add(new College(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),(Date)rs.getObject(7)));
        }
        al.sort((o1,o2)-> {
                    if(o1.getNoOfDept()>o2.getNoOfDept()){
                        return 1;
                    }
                    else return -1;
                }
        );
        return al;
    }
}
