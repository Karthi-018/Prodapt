package item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception 
	{
		userChoice();
	}
	
	public static void userChoice() throws Exception
	{
		int choice;
		ItemDAO dao = new ItemDAO();
		do
		{
			System.out.println("\n1. Add item \n2. To Add many item \n3.Find item based on type \n4.Find item based on price");
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter the name: ");
					String name = s.next();
					System.out.print("Enter the price: ");
					double price = s.nextDouble();
					System.out.print("Enter the type: ");
					String type = s.next();
					Item items = new Item(name,price,type);
					dao.addItem(items);
					break;
					
				case 2:
					System.out.print("\nNumber of list to added: ");
					int bulk = Integer.parseInt(s.next());
					List<Item> itemList = new ArrayList<Item>();
					for(int i=0;i<bulk;i++)
					{
						System.out.print("Enter the name: ");
						name = s.next();
						System.out.print("Enter the price: ");
						price = s.nextDouble();
						System.out.print("Enter the type: ");
						type = s.next();
						itemList.add(new Item(name,price,type));
						
					}
					dao.bulkCopy(itemList);
					break;
					
				case 3:
					System.out.print("\nEnter the type to search:  ");
					String search_type = s.next();
					System.out.format("%-20s %-5s %s\n","Name","Price","Type");
					List<Item> disp1 = dao.findItem(search_type);
					for(Item li:disp1)
					{
						System.out.format("%-20s %-5s %s\n",li.getname(),li.getprice(),li.gettype());
					}
					break;
					
				case 4:
					System.out.print("Enter the price to search: ");
					double search_price = s.nextDouble();
					System.out.format("%-20s %-5s %s\n","Name","Price","Type");
					List<Item> disp = dao.findItem(search_price);
					for(Item li:disp)
					{
						System.out.format("%-20s %-5s %s\n",li.getname(),li.getprice(),li.gettype());
					}
					System.out.println();
					break;
					
				default:
					System.out.println("EXIT");
			}
		}while(choice>0 && choice<5);
	}
	

}
