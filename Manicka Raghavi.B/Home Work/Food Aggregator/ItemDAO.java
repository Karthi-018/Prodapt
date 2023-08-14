package items;
import java.sql.*;
import java.util.*;

public class ItemDAO 
{

   static Scanner sc=new Scanner(System.in); 
   static ItemDAO obj=new ItemDAO();
 
   PreparedStatement ps;
   ResultSet rs;
 
   //Method to add an Item to the database 
   public void addItem(Item item) throws SQLException
   { 
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itemslist","root","root"); 
	   ps=con.prepareStatement("insert into item values(?,?,?)"); 
	   ps.setString(1,item.getName());
	   ps.setDouble(2,item.getPrice());
	   ps.setString(3,item.getType());  
	   ps.executeUpdate();
   }
 
   //Method to add a bulk copy of items
   public void bulkCopy(List<Item> itemList) throws SQLException
   {
	   for(Item item:itemList)
	   { 
		   obj.addItem(item);
	   } 
	   System.out.println("Items added successfully\n"); 
   }
 
   //Method to find items based on type
   public List<Item> findItem(String type) throws SQLException
   {   
	   ArrayList<Item>typeList=new ArrayList<>();
	   
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itemslist","root","root"); 
           ps=con.prepareStatement("select*from item where type=?");
           ps.setString(1,type);
	   rs= ps.executeQuery();   
	   while(rs.next())
	   {
		   typeList.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3))); 
	   }
           return typeList;
   }
 
   //Method to find items based on price 
   public List<Item> findItem(double price) throws SQLException
   {
	   ArrayList<Item>priceList=new ArrayList<>();
	 
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itemslist","root","root"); 
           ps=con.prepareStatement("select*from item where price=?");
           ps.setDouble(1,price);
	   rs= ps.executeQuery();  
	   while(rs.next())
	   {
		   priceList.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
	   }
           return priceList;
   }
 
   //Main Method
   public static void main(String[]args) throws ClassNotFoundException, SQLException
   {  
	   int flag=1;
	
	   System.out.println("WELCOME TO FOOD AGGREGATOR"); 
	
	   Class.forName("com.mysql.cj.jdbc.Driver"); 
	
	   while(flag==1)
	   {
		   System.out.println("ENTER\n1->ADDING AN ITEM\n2->ADDING BULK COPY OF ITEMS\n3->FINDING THE ITEM BASED ON TYPE\n4->FINDING ITEM BASED ON PRICE");
		   int choice=sc.nextInt(); 
		   switch(choice)
		   {
		     case 1:
				   System.out.println("OPTION 1-ADDING AN ITEM\n");
			           System.out.println("Enter the item to be added in the database-name,price,type");  
		                   obj.addItem(Item.itemObject(sc.next())); 
		                   System.out.println("Item added successfully\n");  
			           break;
			   
		     case 2:
				   System.out.println("OPTION 2-ADDING BULK COPY OF ITEMS\n");
		                   System.out.println("Enter the number of items to be added");
		                   int number=sc.nextInt();
		                   ArrayList<Item> itemList=new ArrayList<>();
		                   for(int i=0;i<number;i++) 
				   {
					   System.out.println("Enter the item to be added in the database-name,price,type");  
		    	                   itemList.add(Item.itemObject(sc.next()));
		                   }
		                   obj.bulkCopy(itemList);
			           break;
			   
		     case 3:
				   System.out.println("OPTIONS 3- FINDING THE ITEMS BASED ON TYPE\n"); 
			           System.out.print("Enter the type:");
			           List<Item> typeList=obj.findItem(sc.next()); 
			           if(typeList.size()==0)
					   System.out.println("No such item is present");
			           else
			           {
					   System.out.format("%-20s %5s %s\n","Name","Price","Type");
				           for(Item item:typeList)
					   {
						   System.out.format("%-20s %5s %s\n",item.getName(),item.getPrice(),item.getType());
				           }
			           }
			        break;
			  
		     case 4:
				   System.out.println("OPTIONS 4- FINDING THE ITEMS BASED ON PRICE\n"); 
			           System.out.println("Enter the price:");
			           List<Item> priceList=obj.findItem(sc.nextDouble()); 
			           if(priceList.size()==0)
					   System.out.println("No such item is present");
			           else
			           {   
					   System.out.format("%-20s %5s %s\n","Name","Price","Type"); 
				           for(Item item:priceList)
					   {
						   System.out.format("%-20s %.1f %s\n",item.getName(),item.getPrice(),item.getType());
				           }
			           }
			           break;
			   
		     default:
				   System.out.println("Invalid Choice");
			    
		}
		System.out.println("WISH TO CONTINUE ->1 EXIT->0");
		flag=sc.nextInt();
	 }
    }
}
