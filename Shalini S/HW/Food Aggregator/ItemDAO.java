package food.assignment;
import java.sql.*;
import java.util.*;
public class ItemDAO {
	Scanner sc=new Scanner(System.in);
	//----------------------------------------------------Main Method------------------------------------------------------------------------------
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		ItemDAO obj=new ItemDAO();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("1->Add item\n2->Bulk Copy\n3->Find Item using type\n4->Find item using price\n");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		//-------------------------------------------------Asking the user for choice--------------------------------------------------------------
		switch (choice) {
        case 1:
        	System.out.println("Enter the item name:");
    		String name=sc.next();
    		System.out.println("Enter the price of item");
    		Double price=sc.nextDouble();
    		System.out.println("Enter the item type:");
    		String type=sc.next();
    		Item ob=new Item(name,price,type);
            obj.addItem(ob);
            break;
            
        case 2:
            System.out.println("Enter the number of items to be added:");
            int num=sc.nextInt();
            ArrayList<Item> itemList=new ArrayList<>();
            
            for(int i=0;i<num;i++) {
            	System.out.println("Enter the item name:");
        		String n=sc.next();
        		System.out.println("Enter the price of item:");
        		Double p=sc.nextDouble();
        		System.out.println("Enter the item type:");
        		String t=sc.next();
        		Item ob1=new Item(n,p,t);
        		itemList.add(ob1);
            }
            obj.bulkCopy(itemList);
            break;
            
        case 3:
            System.out.println("Enter the type of item to be searched:");
            String t=sc.next();
            List<Item> x=obj.findItem(t);
            if(x.isEmpty()){
            	System.out.println("No such item is present");
            }
            else {
            	System.out.format("%-20s %-5s %s\n","Name","Price","Type");
            	for(Item i:x) {
            		System.out.format("%-20s %-5s %s\n",i.getName(),i.getPrice(),i.getType());
            	}
            	
            }
            break;
            
        case 4:
        	System.out.println("Enter the price of item to be searched:");
            Double p=sc.nextDouble();
            List<Item> y=obj.findItem(p);
            if(y.isEmpty()){
            	System.out.println("No such item is present");
            }
            else {
            	System.out.format("%-20s %-5s %s\n","Name","Price","Type");
            	for(Item i:y) {
            		System.out.format("%-20s %-5s %s\n",i.getName(),i.getPrice(),i.getType());
            	}
            	
            }
        	break;
        	
        default:
            System.out.println("Invalid choice");
            break;
    }
		
	}
	//-----------------------------------method to add single item---------------------------------------------------------------------------------
	public void addItem(Item item) throws Exception{
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
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
	//--------------------------------------method to add bulk copies of items using addItem()-----------------------------------------------------
	public void bulkCopy(List<Item> itemList)throws Exception {
		for(Item item:itemList) {
			addItem(item);
		}
	}
	//---------------------------------------method to search item using the item type-------------------------------------------------------------
	public List<Item> findItem(String type){
		ArrayList<Item> list=new ArrayList<>();
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			PreparedStatement ps=con.prepareStatement("select * from food where type=?");
			ps.setString(1,type);
			ResultSet rs=ps.executeQuery();
			
	        while(rs.next()) {
	        	String n1=rs.getString(1);
	        	Double p1=rs.getDouble(2);
	        	String t1=rs.getString(3);
	        	Item o=new Item(n1,p1,t1);
	        	list.add(o);
	        }
		
	    }
		catch(Exception e){
			System.out.println(e);
		}
		return list;
	}	
	//------------------------------------------------method to search item using the price of item------------------------------------------------
	public List<Item> findItem(Double price){
		ArrayList<Item> list=new ArrayList<>();
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			PreparedStatement ps=con.prepareStatement("select * from food where price=?");
			ps.setDouble(1,price);
			ResultSet rs=ps.executeQuery();
			
	        while(rs.next()) {
	        	String n1=rs.getString(1);
	        	Double p1=rs.getDouble(2);
	        	String t1=rs.getString(3);
	        	Item o=new Item(n1,p1,t1);
	        	list.add(o);
	        }
	        
		
	    }
		catch(Exception e){
			System.out.println(e);
		}
		return list;
	}
	//-----------------------------------------------------------------END-------------------------------------------------------------------------
}
