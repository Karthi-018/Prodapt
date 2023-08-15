package FoodAggregate;

import java.sql.*;
import java.util.*;

public class ItemDAO 
{	
	public void addItem(FoodItem obj) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root"); 
		String query="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, obj.getName());
		ps.setDouble(2, obj.getPrice());
		ps.setString(3, obj.getType());
		int flag=ps.executeUpdate();
		if(flag==1) 
		{
			System.out.println("ITEM ADDED SUCCESSFULLY");
		}
		else 
		{
			System.out.println("ITEM COULD NOT BE ADDED");
		}
	}
	
	public void bulkItem(List<FoodItem> FoodList) throws SQLException, ClassNotFoundException
	{
		for(FoodItem i : FoodList)
		{
			ItemDAO dao=new ItemDAO();
			dao.addItem(i);
		}
	} 
	
	public List<FoodItem> findItem(String type) throws SQLException, ClassNotFoundException
	{
		int flag=0;
		List<FoodItem> f = new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		PreparedStatement ps = con.prepareStatement("select * from foodlist where type = ?");
		ps.setString(1,type);
		ResultSet rs = ps.executeQuery();
		System.out.format("%-20s %-5s %s\n","Name","Price","Type");
	    while (rs.next()) 
	    {
	        System.out.format("%-20s %-5s %s\n",rs.getString(1),rs.getDouble(2),rs.getString(3));
	        flag=1;
	    }
	    if (flag==0)
	    {
	    	System.out.println("ITEM NOT FOUND");
	    }
		return f;	
	}
	
	public List<FoodItem> findItem(Double price) throws SQLException, ClassNotFoundException
	{
		int flag=0;
		List<FoodItem> f = new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		PreparedStatement ps = con.prepareStatement("select * from foodlist where price = ?");
		ps.setDouble(1,price);
		ResultSet rs = ps.executeQuery();
		System.out.format("%-20s %-5s %s\n","Name","Price","Type");
	    while (rs.next()) 
	    {
	        System.out.format("%-20s %-5s %s\n",rs.getString(1),rs.getDouble(2),rs.getString(3));
	        flag=1;
	    }
	    if (flag==0)
	    {
	    	System.out.println("ITEM NOT FOUND");
	    }
		return f;	
	}
		
}

