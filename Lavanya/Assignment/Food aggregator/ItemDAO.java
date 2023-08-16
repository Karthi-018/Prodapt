package edu.prodapt.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ItemDAO {
	static Scanner scan=new Scanner(System.in);
	static List<Item> itemList=new ArrayList<Item>();
		//adding items
	public void addItem(Item item)throws SQLException {
		System.out.print("Enter item name :");
        String name = scan.next();
        System.out.print("Enter item price :");
        double price = scan.nextDouble();
        System.out.print("Enter item type:");
        String type = scan.next();
        Item item1=new Item(name,price,type);
        String sql = "insert into item_details values (?, ?, ?)";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1,item1.getName());
            ps.setDouble(2,item1.getPrice());
            ps.setString(3,item1.getType());
            ps.executeUpdate();
            System.out.println("item added successfully.");
        }
	}
	
	//add items to the list
	public void bulkCopy(List<Item> itemList) throws SQLException {
		for(Item i:itemList) {
			addItem(i);
		}
	}
	
	//finding item based on the item type
	public List<Item> findItem(String type) throws SQLException {
	    String sql = "select * from item_details where type = ?";
	    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
	        PreparedStatement ps = con.prepareStatement(sql)) {
	        ps.setString(1, type);
	        ResultSet resultSet = ps.executeQuery();
	        while (resultSet.next()) {
	            String name = resultSet.getString("name");
	            double price = resultSet.getDouble("price");
	            String item1 = resultSet.getString("type");
	            Item item = new Item(name, price, item1);
	            itemList.add(item);	            
	           // System.out.println("Item name: " + name + ", Price: " + price + ", Type: " + item1);
	        } 
//	        else {
//	            throw new ItemNotFoundException();
//	        }
	    } 
	    return itemList; 
	}

	//finding item based on the item price
	public List<Item> findItem(Double price) throws SQLException{
	String sql = "select * from item_details where price = ?";
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
       try (PreparedStatement ps = con.prepareStatement(sql)){
        ps.setDouble(1, price);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
		    String name = resultSet.getString("name");
		    double price1 = resultSet.getDouble("price");
		    String type = resultSet.getString("type");
		    Item item = new Item(name, price1, type);
            itemList.add(item);	            
           // System.out.println("Item name: " + name + ", Price: " + price1 + ", Type: " + type);
		}
//        else {
//    		throw new ItemNotFoundException();		
//        }
    } 
	return itemList;  
}
	
	
	
	}
	
