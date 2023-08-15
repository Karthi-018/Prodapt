package foodAggregator;
import java.util.*;
import java.sql.*;

public class itemDao 
{
	// creating object for item(pojo class) to make use of getter and setter
	static Item it = new Item();
	
	public static void additem(Connection con,Item it)
	{
		
		try
		{
			PreparedStatement ps = con.prepareStatement("insert into fooditem values(?,?,?)");
			ps.setString(1,it.getName());
			ps.setDouble(2,it.getPrice());
			ps.setString(3,it.getType());
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public void bulkcopy(List<Item> l, Connection con) 
	{
		// TODO Auto-generated method stub 
		// It will add each object item to table by calling additem()
		
		try {
			for(Item s : l)
			{
				additem(con,s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Item> findItem(String utype, Connection con) {
		// TODO Auto-generated method stub
		boolean flag = false;
		List<Item> l1 = new ArrayList<>();
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from fooditem where type=?");
			ps.setString(1,utype);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				l1.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
				flag = true;
			}
			if(flag==false)
			{
				System.out.println("No such item is present");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return l1;
	}
	

	public List<Item> findPrice(Double uprice, Connection con) {
		// TODO Auto-generated method stub
		boolean flag = false;
		List<Item> l2 = new ArrayList<>();
		try
		{
			//PreparedStatement ps = con.prepareStatement("select * from fooditem where price=?)");
			PreparedStatement ps = con.prepareStatement("select name,round(price,1) price,type from fooditem where price = ?;");
			ps.setDouble(1,uprice);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				l2.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
				flag = true;
			}
			if(flag==false)
			{
				System.out.println("No such item is present");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return l2;
	}

	
}
