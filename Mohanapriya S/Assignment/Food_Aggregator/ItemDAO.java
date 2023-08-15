package edu.prodapt.demo;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ItemDAO {
	public void addItem(Item item)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement p1=con.prepareStatement("select * from food where name=?");
			p1.setString(1, item.getname());
			ResultSet r=p1.executeQuery();
			
			if(!r.next())
			{
				PreparedStatement ps=con.prepareStatement("Insert into food values (?,?,?)");
				ps.setString(1,item.getname());
				ps.setDouble(2,item.getprice());
				ps.setString(3,item.gettype());
				ps.executeUpdate();
				System.out.println("Food Items Updated Successfully");
				
			}
			else
			{
				System.out.println("Name of the food item is already present");
			}
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	public void bulkCopy(List<Item>itemList)
	{
		for(Item i:itemList)
			System.out.println(i);
		
	}
	public List<Item> findItem(String type)
	{
		List<Item>result=new ArrayList<>();
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		PreparedStatement p2=c2.prepareStatement("select * from food where type=?");
		p2.setString(1,type);
		ResultSet rs1=p2.executeQuery();
		while(rs1.next())
		{
			String name=rs1.getString("name");
			Double price=rs1.getDouble("price");
			result.add(new Item(name,price,type));	
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public List<Item> findItem(Double price)
	{
		List<Item>result1=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c3=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement p3=c3.prepareStatement("select * from food where price=?");
			p3.setDouble(1,price);
			ResultSet rs2=p3.executeQuery();
			while(rs2.next())
			{
				String name=rs2.getString("name");
				String type=rs2.getString("type");
				result1.add(new Item(name,price,type));
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return result1;
	}
	
	public List<Item> displayAll()
	{
		List<Item>out=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c4=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement p4=c4.prepareStatement("select * from food");
			ResultSet rs3=p4.executeQuery();
			while(rs3.next())
			{
				out.add(new Item(rs3.getString("name"),rs3.getDouble("price"),rs3.getString("type")));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return out;
	}
	
	
	
	
	
	
	
		

}
