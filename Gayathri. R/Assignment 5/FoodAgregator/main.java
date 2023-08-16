package edu.prodapt.jdbc;
import java.util.*;
public class main {
	static Scanner s=new Scanner(System.in);
	static itemDAO Item=new itemDAO();
	public static void main(String a[])
	{
		useroptions();
		
		
	}
	static void useroptions()
	{
		System.out.println("1.create\n2.find based on price\n3.find based of type\n4.exit");
		int choice=s.nextInt();
		userchoice(choice);
	}
	static void userchoice(int choice)
	{
		switch(choice) 
		{
		case 1:System.out.println("To create data's.pls enter the name,price and type of food seperated by comma");
		//Scanner s=new Scanner(System.in);
		String line=s.next();
		//itemDAO Item=new itemDAO();
		Item.additem(line);
		useroptions();
		break;
		case 2:System.out.println("to find item based on cost,enter cost of food");
		Double cost=s.nextDouble();
		Item.findItem(cost);
		useroptions();
		break;
		case 3:System.out.println("to find item based on type,enter the type of food");
		String Type=s.next();
		Item.findItem(Type);
		useroptions();
		break;
		case 4:System.out.println("exiting the database");
			break;
		default:System.out.println("invalid choice");
		}
	}

}
