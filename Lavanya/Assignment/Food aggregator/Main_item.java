package edu.prodapt.demos;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main_item {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		List<Item> itemList=new ArrayList<Item>();
		Item item=new Item();
		ItemDAO obj=new ItemDAO();
		System.out.println("Enter your choice:");
		int choice=scan.nextInt();
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root")) {
	            switch (choice) {
	                case 1:
	                	obj.addItem(item);
	                	break;
	                case 2:
	                	obj.bulkCopy(itemList);
	                	obj.addItem(item);
	                	break;
	                case 3:
	                	System.out.print("Enter item type to search: ");
	                    String type = scan.next();
	                    List<Item> typeItemList = obj.findItem(type);
	                    displayItems(typeItemList);
	                break;
	                case 4:
	                	System.out.print("Enter item price to search: ");
	                    double price = scan.nextDouble();
	                    List<Item> priceItemList = obj.findItem(price);
		                displayItems(priceItemList);
		                break;
	                default:
	                	System.out.println("Invalid choice");
		               
	            }
        }	
}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} 
}



public static void displayItems(List<Item> itemList) {
    if (!itemList.isEmpty()) {
        System.out.format("%-20s %-5s %s\n", "Name", "Price", "Type");
        for (Item item : itemList) {
           System.out.format("%-20s %-5.1f %s\n", item.getName(), item.getPrice(), item.getType());
        }
    } else {
        System.out.println("No such item is present.");
    }
}
}