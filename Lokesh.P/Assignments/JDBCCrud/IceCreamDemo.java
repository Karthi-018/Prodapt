import java.net.ConnectException;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class IceCreamDemo {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IceCreamDemo id = new IceCreamDemo();
        int choice;
        System.out.println("Enter your choice:");
        do {
            System.out.println("1.Insert the Data");
            System.out.println("2.Displaying the Data");
            System.out.println("3.Updating the Data");
            System.out.println("4.Delete the Date");
            System.out.println("5.Exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    id.insertData();
                    break;
                case 2:
                    id.displayData();
                    break;
                case 3:
                    id.updateData();
                    break;
                case 4:
                    id.deleteData();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE ->");
            }
        }while (choice!=5);

    }
    public Connection getConnect()
    {
        try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
            return con;
        }
        catch (Exception e)
        {
            return null;
        }
    }

    private void deleteData() {
        try
        {
            int id1;
            System.out.println("Enter the id number to delete:");
            id1= sc.nextInt();
            IceCream id = new IceCream();
            id.setIc_no(id1);
            Connection con = getConnect();
            PreparedStatement ps = con.prepareStatement("delete from icecream where ic_no=?");
            ps.setInt(1,id.getIc_no());
            int x=ps.executeUpdate();
            ps.close();
            con.close();
            if(x==1)
            {
                System.out.println("Deleted Data Successfully");
            }
            else {
                System.out.println("Data Not Found");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateData() {
        IceCream id = new IceCream();
        System.out.println("Enter the iceno:");
        int ino = sc.nextInt();
        id.setIc_no(ino);
        System.out.println("Enter the icname:");
        String iname=sc.next();
        id.setIc_name(iname);
        System.out.println("Enter the icflavor:");
        String iflavor=sc.next();
        id.setIc_flavor(iflavor);
        System.out.println("Enter the icprice:");
        Double price = sc.nextDouble();
        id.setIc_price(price);


        try{
            Connection con = getConnect();
            String str="update icecream set iname=?,iflavor=?,price=? where ic_no=?";
            PreparedStatement ps = con.prepareStatement(str);
            ps.setString(1,id.getIc_name());
            ps.setString(2,id.getIc_flavor());
            ps.setDouble(3,id.getIc_price());
            ps.setInt(4,id.getIc_no());
            int x=ps.executeUpdate();
            ps.close();
            con.close();
            if(x==1)
            {
                System.out.println("Data Updated Successfully");
            }
            else {
                System.out.println("Data not found");
            }

        }
        catch(Exception e)
        {

        }

    }

    private void displayData() {
        try
        {
            Connection con=getConnect();
            PreparedStatement ps = con.prepareStatement("select* from icecream");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString(1)+ " "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
            }
            rs.close();
            ps.close();
            con.close();
        }
        catch(Exception e)
        {

        }
    }

    private void insertData()
    {
        IceCream i = new IceCream();
        System.out.println("Enter the IceCream Name:");
        String iname=sc.next();
        i.setIc_name(iname);
        System.out.println("Enter IceCream Flavor:");
        String iflavor=sc.next();
        i.setIc_flavor(iflavor);
        System.out.println("Enter IceCream Cost:");
        double iprice=sc.nextDouble();
        i.setIc_price(iprice);
        try
        {
            Connection con = getConnect();
            PreparedStatement ps = con.prepareStatement("insert into icecream (ic_name,ic_flavor,ic_price) values(?,?,?)");
            ps.setString(1,i.getIc_name());
            ps.setString(2, i.getIc_flavor());
            ps.setDouble(3,i.getIc_price());
            int x = ps.executeUpdate();
            ps.close();
            con.close();
            if(x==1)
            {
                System.out.println("Inserted Data Successfully");
            }
        }
        catch(Exception e)
        {

        }


    }

}
