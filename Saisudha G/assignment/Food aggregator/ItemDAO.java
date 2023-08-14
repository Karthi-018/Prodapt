package edu.prodapt.item;
import java.sql.*;
import java.util.*;

public class ItemDAO {
    Scanner sc=new Scanner(System.in);





    public void addItem(Item item){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
            System.out.println("Enter Name of the Item");
            String name=sc.next();
            System.out.println("Enter price of the Item");
            double price=sc.nextDouble();
            System.out.println("Enter type");
            String type=sc.next();
            PreparedStatement ps = con.prepareStatement("insert into Item values(?,?,?)");
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setString(3, type);
            ps.executeUpdate();
            System.out.println("successfully added to database");

        }
        catch (SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }


    }

    public void bulkCopy(List<Item> itemList){
        for(Item i:itemList) {
            addItem(i);
        }
    }

    public List<Item> findItem(String type) throws SQLException {
        List<Item> itemList=new ArrayList<>();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
        PreparedStatement ps = con.prepareStatement("select * from item where type=?");
        ps.setString(1,type);

        ResultSet rs =ps.executeQuery();
        if(rs.next()) {
            String name=rs.getString("Name");
            type=rs.getString("Type");
            double price=rs.getDouble("Price");
            System.out.println("Item details:");
            System.out.println("Name: "+name+",Type: "+type+",Price: "+price);

        }else {
            System.out.println("no such item is present");
        }
        return itemList;
    }

    public List<Item> findItem(double price) throws SQLException {
        List<Item> itemList=new ArrayList<>();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");

        PreparedStatement ps = con.prepareStatement("select * from item where price=?");
        ps.setDouble(1,price);

        ResultSet rs =ps.executeQuery();
        if(rs.next()) {
            String name=rs.getString("Name");
            String type =rs.getString("Type");
             price=rs.getDouble("Price");
            System.out.println("Item details:");
            System.out.println("Name: "+name+",Type: "+type+",Price: "+price);

        }else {
            System.out.println("no such item is present");
        }

        return itemList;
    }

}
