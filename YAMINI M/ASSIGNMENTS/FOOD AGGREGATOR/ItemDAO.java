package Food;

import java.util.*;
import java.text.DecimalFormat;

public class ItemDAO
{
	
	Scanner sc=new Scanner(System.in);
	
	  public static void main(String[] args) throws Exception
	  {
	
		Scanner sc=new Scanner(System.in);
		ItemDAO itemd=new ItemDAO();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		 {
			System.out.println(e);
		}
		System.out.println("1.To Add item\n");
		System.out.println("2.Bulk Copy\n");
		System.out.println("3.Find Item using type\n");
		System.out.println("4.Find item using price\n");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		switch (choice) 
		{
        case 1:
        	System.out.println("Enter the Item Name:");
    		String name=sc.next();
    		System.out.println("Enter the Price of an Item");
    		Double price=sc.nextDouble();
    		System.out.println("Enter the Item Type:");
    		String type=sc.next();
    		Item it =new Item(name,price,type);
            itemd.addItem(it);
            break;
            
        case 2:
            ArrayList<Item> itemDetails=new ArrayList<>();
            System.out.println("Enter the number of items to be added:");
            int num=sc.nextInt();
            for(int i=0;i<num;i++)
             {
            	System.out.println("Enter the item name:");
        		String name1=sc.next();
        		System.out.println("Enter the price of item:");
        		Double price1=sc.nextDouble();
        		System.out.println("Enter the item type:");
        		String type1=sc.next();
        		Item itemdet=new Item(name1,price1,type1);
        		itemDetails.add(itemdet);
            }
            itemd.bulkCopy(itemDetails);
            break;
            
        case 3:
            List<Item> itemInfo=itemd.findItem(type);
            System.out.println("Enter the type of item to be searched:");
            String type1=sc.next();
            
            if(itemInfo.isEmpty())
            {
            	System.out.println("No such item is present");
            }
            else
             {
            	System.out.format("%-20s %-5s %s\n","Name","Price","Type");
            	for(Item i:itemInfo) {
            		System.out.format("%-20s %-5s %s\n",i.getName(),i.getPrice(),i.getType());
            	}
            	
            }
            break;
            
        case 4:
        	List<Item> itemIn =itemd.findItem(price);
        	System.out.println("Enter the price of item to be searched:");
            Double price1=sc.nextDouble();
            
            if(itemIn.isEmpty()){
            	System.out.println("No such item is present");
            }
            else {
            	System.out.format("%-20s %-5s %s\n","Name","Price","Type");
            	for(Item i:itemIn) {
            		System.out.format("%-20s %-5s %s\n",i.getName(),i.getPrice(),i.getType());
            	}
            	
            }
        	break;
        	
        default:
            System.out.println("Invalid choice");
            break;
    }
		
	}
	
	public void addItem(Item item) throws Exception{
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("INSERT INTO food (name,price,type) VALUES (?, ?, ?)");
			ps.setString(1,item.getName());
            ps.setDouble(2,item.getPrice());
            ps.setString(3,item.getType());
            ps.executeUpdate();
            System.out.println("Success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public void bulkCopy(List<Item> itemDetails)throws Exception {
		for(Item item:itemDetails) {
			addItem(item);
		}
	}
	
	public List<Item> findItem(String type){
		ArrayList<Item> itemList=new ArrayList<>();
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("select * from food where type=?");
			ps.setString(1,type);
			ResultSet rs=ps.executeQuery();
			
	        while(rs.next()) {
	        	String name1=rs.getString(1);
	        	Double price1=rs.getDouble(2);
	        	String type1=rs.getString(3);
	        	Item o=new Item(name1,price1,type1);
	        	itemList.add(o);
	        }
		
	    }
		catch(Exception e){
			System.out.println(e);
		}
		return itemList;
	}	

	public List<Item> findItem(Double price){
		ArrayList<Item> itemList1=new ArrayList<>();
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("select * from food where price=?");
			ps.setDouble(1,price);
			ResultSet rs=ps.executeQuery();
			
	        while(rs.next()) {
	        	String name1=rs.getString(1);
	        	Double price1=rs.getDouble(2);
	        	String type1=rs.getString(3);
	        	Item o=new Item(name1,price1,type1);
	        	itemList1.add(o);
	        }
	        
		
	    }
		catch(Exception e){
			System.out.println(e);
		}
		return itemList1;
	}
	
}



