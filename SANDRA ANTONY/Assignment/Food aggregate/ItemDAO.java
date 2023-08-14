package Food;

import java.sql.*;
import java.util.*;


public class ItemDAO 
{
	Scanner s = new Scanner(System.in);
	public void addItem(Item iobj)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps = con.prepareStatement("insert into food values (?,?,?)");
		
//			System.out.println("Enter the food name");
//			String name = s.next();
//			System.out.println("Enter the price");
//			Double price = s.nextDouble();
//			System.out.println("Enter the type");
//			String type = s.next();
			
			ps.setString(1, iobj.getName());
			ps.setDouble(2, iobj.getPrice());
			ps.setString(3, iobj.getType());
			int temp = ps.executeUpdate();
			if(temp == 1)
			{
				System.out.println("Added the food into table successfully");
			}
			else
			{
				System.out.println("Failed to add the food into table");
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
	public void bulkCopy(List<Item> itemList)
	{
		for(Item i:itemList)
		{
			ItemDAO item = new ItemDAO();
			item.addItem(i);
		}
			
	}
	
	public List<Item> findItem(String type)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps = con.prepareStatement("select * from food where type = ?");
			ps.setString(1,type);
			ResultSet rs = ps.executeQuery();
			List<Item> itemList = new ArrayList<>();
			while(rs.next())
			{	
				Item obj1 = new Item(rs.getString(1), rs.getDouble(2),rs.getString(3));
				itemList.add(obj1);
				
				//System.out.println(rs.getString(1)+" "+rs.getDouble(2)+" "+rs.getString(3));
			}
			return itemList;
		} 
		catch (ClassNotFoundException e) 
		{	
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	return null;	
		
	}
	
	
	public List<Item> findItem(Double price)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps = con.prepareStatement("select * from food where price = ?");
			ps.setInt(1,price.intValue());
			ResultSet rs = ps.executeQuery();
			List<Item> itemList = new ArrayList<>();
				
			while(rs.next())
			{
				Item obj1 = new Item(rs.getString(1), rs.getDouble(2),rs.getString(3));
				itemList.add(obj1);
				//System.out.println(rs.getString(1)+" "+rs.getDouble(2)+" "+rs.getString(3));
			}
			return itemList;
		}
		catch (ClassNotFoundException e) 
		{	
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	return null;	
	}

}
