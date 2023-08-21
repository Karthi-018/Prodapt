import java.sql.*;
import java.util.*;




public class ItemDAO {
	//------------------------------------------------------------------------------------------------------
	void addItem(Item item) throws Exception {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
		PreparedStatement ps=con.prepareStatement("INSERT INTO itemList values(?,?,?)");
		ps.setString(1,item.getName());
		ps.setDouble(2, item.getPrice());
		ps.setString(3,item.getType());
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	//-----------------------------------------------------------------------------------------------------
	void bulkCopy(List<Item> itemList) throws Exception
	{
		for(Item i:itemList)
		{
			addItem(i);
		}
	}
	//-----------------------------------------------------------------------------------------------------
	List<Item> findItem(String ty) throws Exception{
		List<Item> items=new ArrayList<>();		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
			PreparedStatement ps=con.prepareStatement("select *from itemList where type=?");
			ps.setString(1,ty);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				items.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return items;
		
	}
	//----------------------------------------------------------------------------------------------------
	List<Item> findPrice(Double pri) throws Exception{
		List<Item> items=new ArrayList<>();		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
			PreparedStatement ps=con.prepareStatement("select *from itemList where price=?");
			ps.setDouble(1,pri);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				items.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
			}
			if(items.isEmpty()) {
				throw new Exception("no items found with the specific price");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return items;
		
	}
	//-----------------------------------------------------------------------------------------------------
List<Item> displayAll(){
	  List<Item> items=new ArrayList<>();
	 try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item","root","root");
		PreparedStatement ps=con.prepareStatement("select * from itemList");
			ResultSet rs=ps.executeQuery();
			
				
				while(rs.next())
				{
					items.add(new Item(rs.getString(1),rs.getDouble(2),rs.getString(3)));
				}
				
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return items;
	}
}
