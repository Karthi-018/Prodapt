package crud;

import java.sql.*;
import java.util.*;

public class ItemDAO {
	static Scanner s=new Scanner(System.in);
	static List<Item> itemList=new ArrayList<Item>();
	public void addItem(Item item)throws SQLException {
		System.out.print("Enter name :");
        String name = s.next();
        System.out.print("Enter price :");
        double price = s.nextDouble();
        System.out.print("Enter type:");
        String type = s.next();
        Item item1=new Item(name,price,type);
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food", "root", "root");
        		PreparedStatement ps = con.prepareStatement("insert into item values (?, ?, ?)")) {
            ps.setString(1,item1.getName());
            ps.setDouble(2,item1.getPrice());
            ps.setString(3,item1.getType());
            ps.executeUpdate();
            System.out.println("item added successfully.");
        }
	}
	
	public void bulkCopy(List<Item> itemList) throws SQLException {
		for(Item i:itemList) {
			addItem(i);
		}
	}
	
	public List<Item> findItem(String type) throws SQLException {
	    String sql = "select * from item where type = ?";
	    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food", "root", "root");
	        PreparedStatement ps = con.prepareStatement(sql)) {
	        ps.setString(1, type);
	        ResultSet resultSet = ps.executeQuery();
	        while (resultSet.next()) {
	            String name = resultSet.getString("name");
	            double price = resultSet.getDouble("price");
	            String itm = resultSet.getString("type");
	            Item item = new Item(name, price, itm);
	            itemList.add(item);	            
	        } 
	    } 
	    return itemList; 
	}

	public List<Item> findItem(Double price) throws SQLException{
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food", "root", "root");
       try (PreparedStatement ps = con.prepareStatement("select * from item where price = ?")){
        ps.setDouble(1, price);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
		    String name = resultSet.getString("name");
		    double pric = resultSet.getDouble("price");
		    String type = resultSet.getString("type");
		    Item item = new Item(name, pric, type);
            itemList.add(item);	            
		}

    } 
	return itemList;  
}
}