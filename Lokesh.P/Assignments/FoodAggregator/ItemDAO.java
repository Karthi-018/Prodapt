import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemDAO {
    Scanner sc = new Scanner(System.in);
    static List<Item> itemList = new ArrayList<>();

    public static Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");

    }

    public void addItem(Item item) throws SQLException, ClassNotFoundException {
        Connection con = getConnect();
        PreparedStatement ps = con.prepareStatement("insert into Item values(?,?,?)");
        ps.setString(1, item.getName());
        ps.setDouble(2, item.getPrice());
        ps.setString(3, item.getType());
        int x = ps.executeUpdate();
        System.out.println("Item added Successfully");
        ps.close();
        con.close();


    }

    public void bulkCopy(List<Item> itemList) throws SQLException, ClassNotFoundException {
        for (Item item : itemList) {
            addItem(item);
        }

    }

    public List<Item> findItem(String type) throws SQLException, ClassNotFoundException {
        int flag=0;
        List<Item> l = new ArrayList<>();
        Connection con = getConnect();
        PreparedStatement ps = con.prepareStatement("select * from Item where type=?");
        //Item i=new Item();
        ps.setString(1, type);
        ResultSet rs = ps.executeQuery();
        System.out.format("%-20s %-5s %s\n","Name","Price","Type");
        while (rs.next()) {

            System.out.format("%-20s %-5s %s\n",rs.getString(1),rs.getDouble(2),rs.getString(3));
            flag=1;
        }
        if(flag==0)
        {
            System.out.println("No such item is present");
        }
        return l;


    }

    public List<Item> findItem(Double price) throws SQLException, ClassNotFoundException {
        int flag=0;
        List<Item> l = new ArrayList<>();
        Connection con = getConnect();
        PreparedStatement ps = con.prepareStatement("select * from Item where price=?");
        //Item i=new Item();
        ps.setDouble(1, price);
        ResultSet rs = ps.executeQuery();
        System.out.format("%-20s %-5s %s\n","Name","Price","Type");
        while (rs.next()) {
            System.out.format("%-20s %-5s %s\n",rs.getString(1),rs.getDouble(2),rs.getString(3));
            flag=1;
        }
        if(flag==0)
        {
            System.out.println("No such item is present");
        }
        return l;
    }
}
