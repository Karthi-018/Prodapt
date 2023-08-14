package com.foodagregator;

import java.util.*;
public class ItemMain {
    static ItemDAO itemdao=new ItemDAO();
    static List<Item> dItems=new ArrayList<>();
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------Welcome to Food Aggregator System!:)-----------------");
        
        int choice;
        do
        {
        	System.out.println("1.Add Item\n2.Add Bulk item\n3.Display\n4.Search by type\n5.Search by price\nEnter your choice");
        	choice=sc.nextInt();
        	sc.nextLine();
        	switch(choice)
        	{
        	case 1:
        		System.out.println("Enter the name:");
        		String name=sc.nextLine();
        		System.out.println("Enter the price:");
        		double price=sc.nextDouble();
        		sc.nextLine();
        		System.out.println("Enter the type:");
        		String type=sc.nextLine();
        		Item item=new Item(name,price,type);
        		itemdao.addItem(item);
        		break;
        	case 2:
        		List<Item> list = new ArrayList<>();
        		System.out.println("Enter the number of items to add");
        		int no_items=sc.nextInt();
        		sc.nextLine();
        		for(int i=0;i<no_items;i++)
        		{
        			System.out.println("Enter the name:");
            		name=sc.nextLine();
            		System.out.println("Enter the price:");
            		price=sc.nextDouble();
            		sc.nextLine();
            		System.out.println("Enter the type:");
            		type=sc.nextLine();
            		list.add(new Item(name,price,type));
        		}
        		itemdao.bulkCopy(list);
        		break;
        case 3:

            	dItems=itemdao.displayAll();
        		display(dItems);
        		break;
        case 4:
    		System.out.println("Enter item type to search");
    		String s_type=sc.next();
    		List<Item> foundItem=itemdao.findItem(s_type);
    		display(foundItem);
    	    break;
    	case 5:
    	    System.out.println("Enter item price to search");
    	    double s_price=sc.nextDouble();
    	    List<Item> foundItem1=itemdao.findItem(s_price);
    	    display(foundItem1);
    	
    	break;
        default:
        	System.out.println("Invalid choice");
        }
        		
        }while(choice<6);
     

    }
    public static void display(List<Item> dItems)
    {
    	if(!dItems.isEmpty())
    	{
    	System.out.format("%-20s %-5s %s\n","Name","Price","Type");
    	for(Item fi:dItems)
    	{
    	  System.out.format("%-20s %-5.1f %s\n",fi.getName(),fi.getPrice(),fi.getType());
    	}}
    	else
    	{
    		System.out.println("No such Item is present");	
    	}
    }
        }
