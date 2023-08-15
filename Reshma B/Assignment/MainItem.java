package FoodAggregate;

import java.sql.*;
import java.util.*;

public class MainItem {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		int choice=0;
		while(choice!=5) 
		{
			System.out.println("WELCOME TO THE FOOD AGGREGATOR APPLICATION");
			System.out.println("-------------------------------------------");
			System.out.println("PRESS 1 TO ADD THE ITEM YOU REQUIRE");
			System.out.println("PRESS 2 TO ADD REQUIRED ITEMS IN BULK");
			System.out.println("PRESS 3 TO SEARCH BY THE FOOD TYPE");
			System.out.println("PRESS 4 TO SEARCH BY THE FOOD PRICE");
			System.out.println("PRESS 5 TO EXIT THE APPLICATION");
			System.out.println("-------------------------------------------");
			System.out.println("NOW ENTER YOUR CHOICE: ");
			choice=sc.nextInt();
			ItemDAO item = new ItemDAO();
			switch(choice) 
			{
				case 1:
					System.out.println("ENTER THE FOOD NAME: ");
					String name=sc.next();
					System.out.println("ENTER THE FOOD PRICE: ");
					Double price=sc.nextDouble();
					System.out.println("ENTER THE FOOD TYPE: ");
					String type=sc.next();
					item.addItem(new FoodItem(name,price,type));
					break;
				
				case 2:
					System.out.println("ENTER THE NUMBER OF ITEMS TO BE ADDED: ");
					int num=sc.nextInt();
					List<FoodItem> fl=new ArrayList<>();
					for(int i=0;i<num;i++) 
					{
						System.out.println("ENTER THE FOOD NAME: ");
						String name1=sc.next();
						System.out.println("ENTER THE FOOD PRICE: ");
						Double price1=sc.nextDouble();
						System.out.println("ENTER THE FOOD TYPE: ");
						String type1=sc.next();
						FoodItem it=new FoodItem(name1,price1,type1);
						fl.add(it);
					}
					item.bulkItem(fl);
					break;
					
				case 3:
					System.out.println("ENTER TYPE TO BE SEARCHED BY: ");
					String type2=sc.next();
					item.findItem(type2);
					break;
					
				case 4:
					System.out.println("ENTER PRICE TO BE SEARCHED BY: ");
					Double price2=sc.nextDouble();
					item.findItem(price2);
					break;
					
				case 5:
					System.out.println("THANK YOU");
					System.exit(0);
					break;
			}
		}
		
		

	}

}
