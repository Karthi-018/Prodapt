package foodAggregator;
import java.util.*;
import java.sql.*;
public class foodMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// creating object for itemDao(service class)
		itemDao id = new itemDao();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded succesfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			System.out.println("Connection succesfull");
			int choice =0 ;
			List<Item> l = new ArrayList<>();
			while(choice !=5)
			{
				System.out.println("\nWelcome to food aggregator\n");
				System.out.println("Enter 1 to add an item to table: ");
				System.out.println("Enter 2 to bulkcopy: ");
				System.out.println("Enter 3 to search item based on type: ");
				System.out.println("Enter 4 to search item based on price: ");
				System.out.println("Enter 5 to exit: ");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1 : 
				
				System.out.println("Enter items to add: ");
				String item = sc.next();
				String[] input = item.split(",");
				String name = input[0];
				Double price = Double.parseDouble(input[1]);
				String type = input[2];
				Item it = new Item(name,price,type);
				id.additem(con, it);
				System.out.println("Added");
				break;
				
				case 2 : 
				
				System.out.println("Enter no of items to add : ");
				int no = sc.nextInt();
				for(int i=0;i<no;i++)
				{
					System.out.println("Enter items to add in a list");
					String item1 = sc.next();
					String[] input1 = item1.split(",");
					String uname = input1[0];
					Double uprice = Double.parseDouble(input1[1]);
					String utype = input1[2];
					// adding pojo class attributes as object to a list
					l.add(new Item(uname,uprice,utype));
				}
				// calling bulk method to add
				System.out.println("Added bulk items");
				id.bulkcopy(l,con);
				break;
				
				case 3 :
					
				System.out.println("Enter item to search by type: ");
				String utype = sc.next();
				List<Item> l1= id.findItem(utype,con);
				for(Item i : l1)
				{
					System.out.format("%-20s %-20s %s\n",i.getName(),i.getPrice(),i.getType());
				}
				break;
				
				case 4 : 
				System.out.println("Enter item to search by price: ");
				Double uprice = sc.nextDouble();
				List<Item> l2=id.findPrice(uprice,con);
				for(Item i : l2)
				{
					System.out.format("%-20s %-20s %s\n",i.getName(),i.getPrice(),i.getType());
				}
				break;
				
				case 5 : 
				System.out.println("Thank you !!!!!!");
				System.exit(0);
				
				default: System.out.println("Invalid choice");
				
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	

}
