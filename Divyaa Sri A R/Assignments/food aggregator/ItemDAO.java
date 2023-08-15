package foodaggregator;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ItemDAO {
	static Item itm=new Item();
	static Scanner sc =new Scanner(System.in);
	static int choice;
	public void addItem(Item item)
	{
		System.out.println("Enter name");
		item.setName(sc.next());
		System.out.println("Enter price");
		item.setPrice(sc.nextDouble());
		System.out.println("Enter type");
		item.setType(sc.next());
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
			PreparedStatement ps=con.prepareStatement("insert into items values(?,?,?)");
			ps.setString(1, item.getName());
			ps.setDouble(2,item.getPrice());
			ps.setString(3,item.getType());
			ps.executeUpdate();
			System.out.println("Item detail inserted successfully");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	public void bulkCopy(List<Item> itemList) throws Exception
	{
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
			PreparedStatement ps=con.prepareStatement("insert into items values(?,?,?)");
			for (Item item : itemList)
			{
				ps.setString(1, item.getName());
				ps.setDouble(2,item.getPrice());
				ps.setString(3,item.getType());
				ps.executeUpdate();
			}
				System.out.println("All Item details inserted successfully");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}
	List<Item> findItem(String sname) throws Exception{
		List<Item> findItem=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
			
			PreparedStatement ps1= con.prepareStatement("select * from items where type=?;");
			ps1.setString(1,sname);
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				findItem.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return findItem;
	}
	public List<Item> findItem(Double sprice) throws Exception
	{
		List<Item> findItem=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
			
			PreparedStatement ps1= con.prepareStatement("select * from items where price=?;");
			ps1.setDouble(1,sprice);
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				findItem.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return findItem;
	}
	
	
}
			
