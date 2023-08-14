package com.foodagregator;

import java.util.*;
public class ItemMain {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Item> list = new ArrayList<>();
        list.add(Item.itemSplit("Gulab jamun,300.55,dessert"));
        list.add(Item.itemSplit("Pani puri,100.342,chat"));
        list.add(Item.itemSplit("Biriyani,250.1234,Meal"));
        list.add(Item.itemSplit("Bread Halwa,300.78,Sweet"));
        list.add(Item.itemSplit("hot and sour,350.89,soup"));
        list.add(Item.itemSplit("Masala dosa,100,breakfast"));
        list.add(Item.itemSplit("Cookies,50.50,Snacks"));
        list.add(Item.itemSplit("Apple,120.20,Fruits"));
        list.add(Item.itemSplit("choclate Milkshake,155.90,milkshake"));
        list.add(Item.itemSplit("Slice,60.50,Cooldrink"));
        //list.add(Item.itemSplit("choclate Milkshake,155.90,milkshake"));
        ItemDAO itemdao=new ItemDAO();
        System.out.println(list);
        itemdao.bulkCopy(list);
        System.out.println("---------------Welcome to Food Aggregator System!:)-----------------");
        
        int choice;
        do
        {
        	System.out.println("1.Search by type\n2.Search by price\nEnter your choice");
        	choice=sc.nextInt();
        	switch(choice)
        	{
        	
        	case 1:
        		System.out.println("Enter the type of the item");
        		String type=sc.next();
        		List<Item> foundItem=itemdao.findItem(type);
        		
        		if(!foundItem.isEmpty()) {
        		System.out.format("%-20s %-5s %s\n","Name","Price","Type");
        		for(Item fi:foundItem)
        		{
        			System.out.format("%-20s %-5.1f %s\n",fi.getName(),fi.getPrice(),fi.getType());
        		}}
        		else
        		{
        			System.out.println("No such Item is present");
        		}
        	  break;
        	case 2:
        	System.out.println("Enter the price of the item");
        	double price=sc.nextDouble();
        	List<Item> foundItem1=itemdao.findItem(price);
        	
        	if(!foundItem1.isEmpty())
        	{
        	System.out.format("%-20s %-5s %s\n","Name","Price","Type");
        	for(Item fi:foundItem1)
        	{
        	  System.out.format("%-20s %-5.1f %s\n",fi.getName(),fi.getPrice(),fi.getType());
        	}
        	}
        	else
        	{
        		System.out.println("No such Item is present");	
        	}
        	break;
        default:
        	System.out.println("Invalid choice");
        }
        		
        }while(choice<3);
     

    }
        }
