package foodassignment;
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
	        //List<Item> it = new ArrayList<>();
	        ItemDAO i = new ItemDAO();
	        System.out.println("Welcome to Food Database!!");
	        System.out.println("1. Add details");
	        System.out.println("2. Bulk Copy");
	        System.out.println("3. Search items based on type");
	        System.out.println("4. Search items based on price");
	        
	        System.out.println("Enter your choice: ");
	        int n = sc.nextInt();
	        
	        switch (n) 
	        
	        {
	            //adding details
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
	        		
	        		System.out.println("Details added successfully");
	        		
	        		break;
	        		
	            }
	            
	            //bulk copy
	            case 2:
	            {
	            	
	            	System.out.println("How many items do you want to add?");
	            	int no = sc.nextInt();
	            	List<Item> l1 = new ArrayList<>();
	      			
	            	for(int x=0;x<no;x++)
	            	{
	            		System.out.println("Enter name: ");
	            		String name1 = sc.next();
	            		System.out.println("Enter price: ");
	            		Double price1 = sc.nextDouble();
	            		System.out.println("Enter type: ");
	            		String type1 = sc.next();
	            		l1.add(new Item(name1, price1, type1));
	            	}
	            	
					System.out.println("Done!!");
					
	            	i.bulkCopy(l1);
	            	
	            	break;
	       
        		}
        		
	            //to search items based on type
	            case 3:
	            {
	            	
	            	List<Item> itemList = new ArrayList<>();
	            	ItemDAO i1 = new ItemDAO();
	            	System.out.println("Enter the type: ");
	            	String stype = sc.next();
	                
	            	itemList = i1.findItem(stype);
	            	
	            	for(Item b : itemList)
	            	{
	            		System.out.format("%-20s %-5s %s\n", b.getName() + "," + b.getPrice() + "," + b.getType());
	            	}
	            	
	            	break;
	            	
	            }
	            
	            //to search items based on price
	            case 4:
	            {
	            	
	            	List<Item> itemList = new ArrayList<>();
	            	ItemDAO i2 = new ItemDAO();
	            	System.out.println("Enter the price: ");
	            	Double sprice = sc.nextDouble();
	            	
	            	itemList = i2.findItem(sprice);
	            	
	            	for(Item c : itemList)
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
