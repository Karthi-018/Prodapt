import java.sql.*;
import java.util.*;

public class ItemDAO 
{
	public void addItem(Item item) throws SQLException
	{
		Connection con = jdbc.getConnection();
		PreparedStatement ps = con.prepareStatement("Insert into food values (?,?,?)");
		ps.setString(1, item.getName());
		ps.setDouble(2, item.getPrice());
		ps.setString(3, item.getType());
		ps.executeUpdate();
	}
	
	public void bulkCopy(List<Item> itemList) throws SQLException
	{
		ItemDAO d = new ItemDAO();
		for(Item i:itemList)
		{
			d.addItem(i);
		}
	}
	
	public List<Item> findItem(String type) throws SQLException
	{
		List<Item> search = new ArrayList<>();
		Connection con  = jdbc.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from food where type = ? ");
		ps.setString(1, type);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			search.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
		}
		return search;
	}
	
	public List<Item> findItem(Double price) throws SQLException
	{
		
		List<Item> search = new ArrayList<>();
		Connection con  = jdbc.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from food where price = ? ");
		ps.setDouble(1, price);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			search.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
		}
		return search;	
	}
	
}