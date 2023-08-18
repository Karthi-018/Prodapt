import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class CollegeBO {
    public CollegeBO(String name, String website, String mobile, String founder, int numberOfDept, String location, Date startingDate) {
    }


    public static CollegeBO createCollege(String l) throws Exception {
        String[] s=l.split(",");
        String name=s[0];
        String website=s[1];
        String mobile=s[2];
        String founder=s[3];
        int numberOfDept=Integer.parseInt(s[4]);
        String location=s[5];
        DateFormat df=new SimpleDateFormat("DD:MM:YY");
        Date startingDate=df.parse(s[6]);
        return new CollegeBO(name,website,mobile,founder,numberOfDept,location,startingDate);
    }

    public List<College> findCollege(List<String> nameList) throw Exception
        {
            try {
                List<College> search = new ArrayList<>();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:localhost//3306/prodapt", "root", "root");
                PreparedStatement ps = c.prepareStatement("Select * from colleges where nameList = ?");
                ps.setString(1, nameList.toString());
                //ps.executeQuery();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("name");
                    String website = rs.getString("website");
                    String mobile = rs.getString("mobile");
                    String founder = rs.getString("founder");
                    int numberOfDept = rs.getInt("numberofDept");
                    String location = rs.getString("location");
                    Date startingDate = rs.getDate("startingDate");
                    search.add(new College(name, website, mobile, founder, numberOfDept, location, startingDate));
                }
                return search;
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
            return null;
        }


        public List<College> findCollege(Date startingDate) throws Exception
        {
            try {
                List<College> dateSearch = new ArrayList<>();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:localhost//3306/prodapt", "root", "root");
                PreparedStatement ps = c.prepareStatement("Select * from colleges where startingDate = ?");
                ps.setDate(2, (java.sql.Date) startingDate);
                //ps.executeQuery();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("name");
                    String website = rs.getString("website");
                    String mobile = rs.getString("mobile");
                    String founder = rs.getString("founder");
                    int numberOfDept = rs.getInt("numberOfDept");
                    String location = rs.getString("location");
                    startingDate = rs.getDate("startingDate");
                    dateSearch.add(new College(name, website, mobile, founder, numberOfDept, location, startingDate));
                }
                return dateSearch;
            }
                catch (SQLException  | ClassNotFoundException e) {
                System.out.println(e);
            }
            return null;
        }

        public List<College> findCollege(String location) throws Exception
        {
            try {
                List<College> locationSearch = new ArrayList<>();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql:localhost//3306/prodapt", "root", "root");
                PreparedStatement ps = c.prepareStatement("Select * from colleges where location = ?");
                ps.setDate(3, location());
                //ps.executeQuery();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("name");
                    String website = rs.getString("website");
                    String mobile = rs.getString("mobile");
                    String founder = rs.getString("founder");
                    int numberOfDept = rs.getInt("numberOfDept");
                    location = rs.getString("location");
                    Date startingDate = rs.getDate("startingDate");
                    locationSearch.add(new College(name, website, mobile, founder, numberOfDept, location, startingDate));
                }
                return locationSearch;
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }

            return null;
        }
    }
