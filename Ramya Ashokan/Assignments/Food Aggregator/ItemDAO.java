package com.foodagregator;

import java.util.*;
import java.sql.*;
import java.text.DecimalFormat;
public class ItemDAO {
    public void addItem(Item item)
    {
    	try
    	{
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
        String queries="select *from food1 where name=?";
        PreparedStatement add=con.prepareStatement(queries);
        add.setString(1, item.getName());
        ResultSet r=add.executeQuery();
        
        if(!r.next())
        {
    	String query="insert into food1 values(?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, item.getName());
        ps.setDouble(2,item.getPrice() );
        ps.setString(3, item.getType());
        int temp=ps.executeUpdate();
        if(temp==1)
        {
        	System.out.println("Item added successfully");
        }
        else
        {
        	System.out.println("please provide valid item");
        }
        }
        else
        {
        	//System.out.println("Sorry Item with same name already present");
        }
        
    }
    	catch(ClassNotFoundException|SQLException  e)
    	{
    	System.out.println(e);	
    	}
    	
    }
    public void bulkCopy(List<Item> itemList)
    {
    for(Item i:itemList)
    {
        addItem(i);
    }
    }
    public List<Item> findItem(String type)
    {
    	List<Item> result=new ArrayList<>();
    	try
    	{
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
    	String query="select * from food1 where type=?";
    	PreparedStatement ps=con.prepareStatement(query);
    	ps.setString(1, type);
    	ResultSet rs=ps.executeQuery();
    	while(rs.next())
    	{
    	String name=rs.getString("name");
    	Double price=rs.getDouble("price");
    	result.add(new Item(name,price,type));
    	}
    	
    	}
    	catch(ClassNotFoundException|SQLException  e)
    	{
    	System.out.println(e);	
    	}
    	return result;
    }
    public List<Item> findItem(Double price)
    {
    	
        List<Item> result1=new ArrayList<>();
    	try
    	{
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
    	String query="select * from food1 where price=?";
    	PreparedStatement ps=con.prepareStatement(query);
    	ps.setDouble(1,price);
    	ResultSet rs=ps.executeQuery();
    	while(rs.next())
    	{
    	String name=rs.getString("name");
    	String type=rs.getString("type");
    	result1.add(new Item(name,price,type));
    	}
    	}
    	catch(ClassNotFoundException|SQLException  e)
    	{
    	System.out.println(e);	
    	}
    	return result1;
    }
   }

