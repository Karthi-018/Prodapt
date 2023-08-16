package org.example;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.*;

public class ItemMain 
{
	 public static void main(String[] args) throws Exception 
	 { 
		    Class.forName("com.mysql.cj.jdbc.Driver");
	        Scanner sc = new Scanner(System.in);
	        System.out.println("1. Add details");
	        System.out.println("2. Bulk Copy");
	        System.out.println("3. Search items based on type");
	        System.out.println("4. Search items based on price");
	        
	        System.out.println("Enter your choice: ");
	        int n = sc.nextInt();
	        
	        switch (n) 
	        
	        {
	            case 1:
	            {
	            	
	            	System.out.println("Enter name: ");
	        		String name = sc.next();
	        		System.out.println("Enter price: ");
	        		double price = sc.nextDouble();
	        		System.out.println("Enter type: ");
	        		String type = sc.next();
	        		
	        		Item item = new Item(name, price, type);
	        		i.addItem(item);
	        		break;
	        		
	            }
	            
	            case 2:
	            {
	            	
	            
	            	int no = sc.nextInt();
	            	List<Item> l = new ArrayList<>();
	      			
	            	for(int x=0;x<no;x++)
	            	{
	            		System.out.println("Enter name: ");
	            		String name1 = sc.next();
	            		System.out.println("Enter price: ");
	            		Double price1 = sc.nextDouble();
	            		System.out.println("Enter type: ");
	            		String type1 = sc.next();
	            		l.add(new Item(name1, price1, type1));
	            	}
	            	
					
					
	            	i.bulkCopy(l);
	            	
	            	break;
	       
        		}
     
	            case 3:
	            {
	            	
	            	List<Item> itemList = new ArrayList<>();
	            	ItemDAO d1 = new ItemDAO();
	            	System.out.println("Enter the type: ");
	            	String stype = sc.next();
	                
	            	itemList = d1.findItem(stype);
	            	
	            	for(Item it2: itemList)
	            	{
	            		System.out.format("%-20s %-5s %s\n", b.getName() + "," + b.getPrice() + "," + b.getType());
	            	}
	            	
	            	break;
	            	
	            }
	            

	            case 4:
	            {
	            	
	            	List<Item> itemList = new ArrayList<>();
	            	ItemDAO d2 = new ItemDAO();
	            	System.out.println("Enter the price: ");
	            	Double sprice = sc.nextDouble();
	            	
	            	itemList = d2.findItem(sprice);
	            	
	            	for(Item it2 : itemList)
	            	{
	            		System.out.format("%-20s %-5s %s\n", c.getName() + "," + c.getPrice() + "," + c.getType());
	            	}
	            	
	            	break;
	            	
	            }
	            
	            default:
	            	System.out.println("Invalid choice");
	            
	    }
	}

}