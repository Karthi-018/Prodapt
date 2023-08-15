package FoodAggregator;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemDAO {
    public void addItem(Item item) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
        PreparedStatement ps= c.prepareStatement("INSERT INTO items VALUES(?,?,?);");
        ps.setString(1,item.getName());
        ps.setDouble(2,item.getPrice());
        ps.setString(3,item.getType());
        ps.executeUpdate();
    }

    public void bulkCopy(List<Item> itemList) throws SQLException, ClassNotFoundException
    {
        for (Item item : itemList)
        {
            addItem(item);
        }
    }

    public List<Item> findItem(String type) throws ClassNotFoundException, SQLException
    {

        List<Item> matchItemList=new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
        PreparedStatement ps=c.prepareStatement("SELECT * FROM items WHERE type=?;");
        ps.setString(1,type);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String name=rs.getString("name");
            Double price=rs.getDouble("price");
            String type1=rs.getString("type");

            matchItemList.add(new Item(name,price,type1));
        }

        return matchItemList;
    }

    public List<Item> findItem(Double price) throws ClassNotFoundException, SQLException
    {
        List<Item> matchItemList=new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
        PreparedStatement ps=c.prepareStatement("SELECT * FROM items WHERE price=?;");
        ps.setDouble(1,price);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String name=rs.getString("name");
            Double price1=rs.getDouble("price");
            String type=rs.getString("type");

            matchItemList.add(new Item(name,price1,type));
        }

        return matchItemList;
    }

}
