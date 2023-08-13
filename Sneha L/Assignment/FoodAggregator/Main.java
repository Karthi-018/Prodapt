package edu.foodAggregator.example;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		List<Item> items=new ArrayList<>();
		ItemDAO itdao=new ItemDAO();
		boolean a=true;
		while(a) {
			List<Item> itemArr=new ArrayList<>();
			
			System.out.println(" 1. ADD ITEM\n 2. BULK COPY\n 3. FIND ITEM BY TYPE\n 4. FIND ITEM BY PRICE\n 5.DISPLAY ITEMLIST");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter item name:");
				String name=sc.next();
				System.out.println("Enter item price:");
				Double price=sc.nextDouble();
				System.out.println("Enter item type:");
				String type=sc.next();
				Item obj=new Item(name,price,type);
				items.add(obj);
				itdao.addItem(obj);
				break;
			case 2:
				System.out.println("Enter number of items to add:");
				int n=sc.nextInt();
				for(int i=1;i<=n;i++)
				{
					System.out.println("Enter details to add for item"+i);
				
				System.out.println("Enter item name to add:");
				String addname=sc.next();
				System.out.println("Enter item price to add:");
				Double addprice=sc.nextDouble();
				System.out.println("Enter item type to add:");
				String addtype=sc.next();
				Item obj1=new Item(addname,addprice,addtype);
				
				itemArr.add(obj1);
				itdao.bulkCopy(itemArr);
				items.addAll(itemArr);
				itemArr.clear();
				}
				break;
			 case 3: 
				 System.out.println("Enter item to search based on type"); 
				 String ty=sc.next(); 
				 itemArr=itdao.findItem(ty); 
				 displayItems(itemArr);
				 break;
			 
			
			case 4:
				System.out.println("Enter item to search based on price"); 
				Double pri=sc.nextDouble(); 
				 itemArr=itdao.findPrice(pri); 
				 displayItems(itemArr);
				 break;
			case 5:
				System.out.println("List of Items");
				itemArr=itdao.displayAll();
				displayItems(itemArr);
//				System.out.println();
				break;
			case 6:
				a=false;
				System.out.println("EXIT..................");
				break;
				
				
		}
		}
		
	}
	static void displayItems(List<Item> items) throws ItemNotFoundException {
		if(items.isEmpty()) {
			throw new ItemNotFoundException("No Found in Database");
		}
		else {
			System.out.format("%-20s %-5s %s\n","NAME","PRICE","TYPE");
			for(Item item:items)
			{
				System.out.format("%-20s %-5s %s\n",item.getName(),item.getPrice(),item.getType());
			}
		
		}
	}

}
