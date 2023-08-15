package foodaggregator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ItemMain {
		static Item itm=new Item();
		static ItemDAO itmd=new ItemDAO();
		static Scanner sc =new Scanner(System.in);
		static List<Item> items=new ArrayList<>();
		static int choice;
		public static void main(String a[])
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("sucess");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
				System.out.println("Connection Successful");
				do {
				System.out.println("1. Create your item");
				System.out.println("2. add more items");
				System.out.println("3. Display your item by type");
				System.out.println("4. Display your item by price");
				System.out.println("5. Exit");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice) {
				case 1:{
					//Item itm=new Item();
					itmd.addItem(itm);
					break;
				}
				case 2:{
					List<Item> itemList = new ArrayList<Item>();
					System.out.println("Enter number of items to add");
					int n=sc.nextInt();
					for(int i=1;i<=n;i++)
					{
					System.out.println("Enter details of item "+i);
					System.out.println("Enter name");
					String name=sc.next();
					System.out.println("Enter price");
					Double price=sc.nextDouble();
					System.out.println("Enter type");
					String type=sc.next();
					Item newItem=new Item(name,price,type);
					itemList.add(newItem);
					//d.addItem(newItem);
					}
					itmd.bulkCopy(itemList);
					break;
				}
				case 3:{
					System.out.println("Enter item type to search ");
					String sname=sc.next();
					List<Item> findit = itmd.findItem(sname);
					if(findit.isEmpty())
					{
						System.out.println("Item type not found");
					}
					else
					{
						System.out.format("%-20s %-5s %s\n","Name","Price","Type");
						System.out.println("-----------------------------------");
						for(Item f:findit)
						{
							System.out.format("%-20s %-5s %s\n",f.getName(),f.getPrice(),f.getType());
						}
					}
					break;
					
				}
				case 4:{
					System.out.println("Enter item price to search ");
					double sprice=sc.nextDouble();
					List<Item> findit = itmd.findItem(sprice);
					if(findit.isEmpty())
					{
						System.out.println("Item is not found with the searched price");
					}
					else
					{
						System.out.format("%-20s %-5s %s\n","Name","Price","Type");
						System.out.println("-----------------------------------");
						for(Item f:findit)
						{
							System.out.format("%-20s %-5s %s\n",f.getName(),f.getPrice(),f.getType());
						}
					}
					break;
				}
				}
				}while(choice<=4);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}


}
