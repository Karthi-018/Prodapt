package edu.prodapt.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Item_main {
	static Scanner s=new Scanner(System.in);
	static ItemDAO items=new ItemDAO();
	static List<Item> list=new ArrayList<>();
	public static void main(String []args)
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		userchoice();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void userchoice()
	{
		System.out.println("Enter your choice");
		System.out.println("1.To add items/n2.To add bulk items /n3.To display items/n4.To Search items by type/n5.To search items by price");
		int n=s.nextInt();
		s.nextLine();
		choiceloop(n);
		
	}
	
	static void choiceloop(int n)
	{
		switch(n)
		{
		case 1:
			
			System.out.println("Enter the Name");
			String name=s.nextLine();
			System.out.println("Enter the Price");
			Double price=s.nextDouble();
			s.nextLine();
			System.out.println("Enter the type");
			String type=s.nextLine();
			Item item=new Item(name,price,type);
			items.addItem(item);
			break;	
			
		case 2:
			List<Item>temp=new ArrayList<>();
			System.out.println("Enter the number of items to be added");
			int num=s.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("Enter the Name");
				String m_name=s.next();
				System.out.println("Enter the Price");
				Double m_price=s.nextDouble();
				//s.nextLine();
				System.out.println("Enter the type");
				String m_type=s.next();
				//Item item=new Item(m_name,m_price,m_type);
				temp.add(new Item(m_name,m_price,m_type));
			}
			items.bulkCopy(temp);
			break;
			
		case 3:
			list=items.displayAll();
			display(list);
			break;
			
		case 4:
			System.out.println("Enter the type to be searched");
			String typ=s.nextLine();
			List<Item>find=items.findItem(typ);
			display(find);
			break;
			
		case 5:
			System.out.println("Enter the price to be searched");
			Double pri=s.nextDouble();
			List<Item>findpri=items.findItem(pri);
			display(findpri);
			break;
			
		default:
			System.out.println("Invalid Choice");
				
		}
	}
	public static void display(List<Item>list)
	{
		if(!list.isEmpty())
    	{
    	System.out.format("%-20s %-5s %s\n","Name","Price","Type");
    	for(Item fi:list)
    	{
    	  System.out.format("%-20s %-5.1f %s\n",fi.getname(),fi.getprice(),fi.gettype());
    	}}
    	else
    	{
    		System.out.println("No such Item is present");	
    	}
	}
	

}
