package org.example;

import java.util.Scanner;
import java.util.*;
import java.sql.*;

class ItemDAO
{
	Scanner sc = new Scanner(System.in);
	
	public void addItem(Item item)
	{
		
		try
		{
                 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodaggregator", "root", "root");	
	         PreparedStatement ps = con.prepareStatement("insert into food_table values(?, ?, ?)");
	         ps.setString(1,item.getName());
	         ps.setDouble(2,item.getPrice());
	         ps.setString(3,item.getType());
	         ps.executeUpdate();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	
	public void bulkCopy(List<Item> itemList)
	{
		for(Item i : itemList)
		{
			addItem(i);
		}
			  
	}
	public List<Item> findItem(String stype) throws Exception
	{
		List<Item> itemList = new ArrayList<>();
		
		try
		{
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodaggregator", "root", "root");	
		    PreparedStatement ps = con.prepareStatement("select * from food_table where type = ?" );
		    ps.setString(1,stype);
		    ResultSet rs = ps.executeQuery();
		    
		    while(rs.next())
		    {
		    	itemList.add(new Item(rs.getString(1), rs.getDouble(2),rs.getString(3)));
		    }
		    if(itemList.isEmpty())
		    {
		    	System.out.println("No Item is present");
		    }
		}
		
		catch(Exception e)
		{
			 System.out.println(e);
		}
		
		finally
		{
			return itemList;
		}
		
	}

	public List<Item> findItem(Double sprice) throws Exception
	{
		List<Item> itemList = new ArrayList<>();
		
		try
		{
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodaggregator", "root", "root");	
		    PreparedStatement ps = con.prepareStatement("select * from food_table where price = ?" );
		    ps.setDouble(1,sprice);
		    ResultSet rs = ps.executeQuery();
		    
		    while(rs.next())
		    {
		    	itemList.add(new Item(rs.getString(1), rs.getDouble(2),rs.getString(3)));
		    }
		    if(itemList.isEmpty())
		    {
		    	System.out.println("No Item is present");
		    }
		}
	
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			return itemList;
		}
	}
}
