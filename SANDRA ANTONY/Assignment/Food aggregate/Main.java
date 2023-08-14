package Food;

import java.util.*;

public class Main
{ 
	static Scanner s=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("*******Welcome_to_food_aggregatition*******");
		boolean loop = true;
		do 
		{
			System.out.println("1.Add an item");
			System.out.println("2.Add items in bulk");
			System.out.println("3.Search by type");
			System.out.println("4.Search by price");
			System.out.println("5.To exit");
			System.out.println("Enter an option");
			int option = s.nextInt();
			
			ItemDAO call = new ItemDAO();
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter the food name");
				String name = s.next();
				System.out.println("Enter the price");
				Double price = s.nextDouble();
				System.out.println("Enter the type");
				String type = s.next();
				
				call.addItem(new Item(name,price,type));
			}
			break;	
				
			case 2:
			{
				List<Item> l = new ArrayList<>();
				System.out.println("Enter number of items to be added");
				int num = s.nextInt();
				for(int i=0; i<num; i++)
				{
					System.out.println("Enter the food name");
					String name = s.next();
					System.out.println("Enter the price");
					Double price = s.nextDouble();
					System.out.println("Enter the type");
					String type = s.next();
					Item obj = new Item(name,price,type);
					l.add(obj);
					
				}
				call.bulkCopy(l);
			}
			break;
			
			case 3:
			{
				System.out.println("Enter the food type to search");
				String type = s.next();
				List<Item> items =call.findItem(type);
				for(Item i:items)
				{
					System.out.println(i.getName()+" "+i.getPrice()+" "+i.getType());
				}	
			}
			break;
			
			case 4:
			{
				System.out.println("Enter the food price to seach");
				Double price = s.nextDouble();
				List<Item> items = call.findItem(price);
				if(items == null)
				{
					System.out.println("Nothing");
				}
				else 
				{
					for(Item i:items)
					{
						System.out.println(i.getName()+" "+i.getPrice()+" "+i.getType());
					}
					
				}
				
			}
			break;
			
			case 5:
			{
				loop = false;
			}
			break;
			
			}
		}
		while(loop);
		
		
		
		
		
	}

}
