package edu.prodapt.search_items;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemDAO {
	
	
	Scanner sc = new Scanner(System.in);
	DbConnection db = new DbConnection();
	Connection con  = db.createConnection();
	PreparedStatement ps;
	ResultSet rs;
	List<Item> itemList = new ArrayList<>();
	
	
	public void addItem(Item item) {
		
		try {
			
			ps = con.prepareStatement("insert into items values(?,?,?)");
			ps.setString(1, item.getName());
			ps.setDouble(2, item.getPrice());
			ps.setString(3, item.getType());
			ps.executeUpdate();
			
		}
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	public void bulkCopy(List<Item> itemList) {
		
		for (Item item : itemList) {
			
			addItem(item);
			
		}
	}
	
	
	
	public List<Item> findItem(String type){
		
		List<Item> itemType = new ArrayList<>();
		
		try {
			
			ps = con.prepareStatement("select * from items where type = ?");
			ps.setString(1, type);
			rs = ps.executeQuery();
			
			if(rs.next() == false) {
				
				System.out.println("No such item is present");
				
			}
			
			else {
				
				
				
				do {
					
					itemType.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
					
				}
				while(rs.next());
				
			}
				
			
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return itemType ;
		
	}
	
	
	
	public List<Item> findItem(double price){
		
		List<Item> itemPrice = new ArrayList<>();
		
		try {
			
			ps = con.prepareStatement("select * from items where price = ?");
			ps.setDouble(1, price);
			rs = ps.executeQuery();
			
			if(rs.next() == false) {
				System.out.println("No such item is present");
			}
			
			else {
				
				do {
					
					itemPrice.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
					
				}
				while(rs.next());
				
			}	
			
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return itemPrice ;
		
	}
	
	
	
	public void display(List<Item> items) {
		
		for (Item item : items) {
			
			System.out.format("%-20s %-5s %s\n",item.getName(),item.getPrice(),item.getType());
	
		}
		
	}
	
	
	
//	public void initialiseList(List<Item> itemList) {
//		
//		itemList.add(Item.createItems("Tomato,150.0,vegitables"));
//		itemList.add(Item.createItems("Potato,30.5,vegitables"));
//		itemList.add(Item.createItems("Onion,20.5,vegitables"));
//		itemList.add(Item.createItems("Maaza,40.0,cooldrinks"));
//		itemList.add(Item.createItems("7up,30.0,cooldrinks"));
//		itemList.add(Item.createItems("Pepsi,40.0,cooldrinks"));
//		itemList.add(Item.createItems("Lassi,20.0,cooldrinks"));
//		itemList.add(Item.createItems("Tan,10.0,cooldrinks"));
//		itemList.add(Item.createItems("Goodday,10.0,biscuits"));
//		itemList.add(Item.createItems("Marygold,10.0,biscuits"));
//		itemList.add(Item.createItems("Darkfantasy,50.0,biscuits"));
//		itemList.add(Item.createItems("Bourbon,40.0,biscuits"));
//		itemList.add(Item.createItems("Kurkurae,10.0,snacks"));
//		itemList.add(Item.createItems("Popcorn,30.0,snacks"));
//		itemList.add(Item.createItems("Pringles,80.0,snacks"));
//		//bulkCopy(itemList);
//		
//		
//	}
	
	public void displayChoice() {
		
		System.out.println("1. Add a item");
		System.out.println("2. Add a bulk of items");
		System.out.println("3. Search items by type");
		System.out.println("4. Search items by price");
		System.out.println("5. Exit");
		System.out.println("Select the option");
		int opt  = sc.nextInt();
		switchCase(opt);
		
	}
	
	
	public void switchCase(int opt) {
		
		switch(opt) {
				
				case 1:
					
					System.out.println("Enter item name,price,type");
					addItem(Item.createItems(sc.next()));
					System.out.println("Item added successfully");
					displayChoice();
					break;
					
					
				case 2:
					
					System.out.println("Enter the number of items to be added");
					int n = sc.nextInt();
					for(int i=1; i<=n;i++) {
						System.out.println("Enter item"+i+" name,price,type");
						itemList.add(Item.createItems(sc.next()));
					}
					bulkCopy(itemList);
					System.out.println("Items added successfully");
					displayChoice();
					break;
				
					
				case 3:
					
					System.out.println("Enter the type");
					List<Item> itemType = findItem(sc.next());
					display(itemType);
					displayChoice();
					break;
					
					
				case 4:
					
					System.out.println("Enter the price");
					List<Item> itemPrice = findItem(new Double(sc.nextDouble()));
					display(itemPrice);
					displayChoice();
					break;
					
					
				case 5:
					System.exit(0);
					
					
					
				default:
					
					System.out.println("Invalid choice");
					
				}
				
	}
	
	
	public static void main(String[] args) {
		
		ItemDAO id = new ItemDAO();
		id.displayChoice();
		
	}

}
