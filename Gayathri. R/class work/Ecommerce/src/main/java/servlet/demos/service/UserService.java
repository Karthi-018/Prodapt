package servlet.demos.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import servlet.demos.connection.databaseConnection;
import servlet.demos.model.ProductDataModel;
import servlet.demos.model.UserDataModel;

public class UserService {
	static databaseConnection dc=new databaseConnection();
	static String password;
	//String password;
	public static String UserValidation(String uname,String pw) throws ClassNotFoundException, SQLException
	{
		
		Connection con=dc.GetConnection();
		System.out.println(uname+pw);
		PreparedStatement ps=con.prepareStatement("select * from userdata where email=? and password=?");
		ps.setString(1, uname);
		ps.setString(2, pw);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{password=rs.getString(5);
		String op=createtables(rs.getString(7),rs.getString(5));
		 return rs.getString(7);
		}
		return "no";
	}
	public String AddUser(UserDataModel data) throws ClassNotFoundException, Exception
	{
		Connection con=dc.GetConnection();
		PreparedStatement ps=con.prepareStatement("insert into userdata values(?,?,?,?,?,?,?)");
		ps.setString(1,data.getName());
		ps.setString(2,data.getDob());
		ps.setString(3,data.getEmail());
		ps.setString(4,data.getMobNo());
		ps.setString(5,data.getPassword());
		ps.setString(6,data.getGender());
		ps.setString(7,data.getStatus());
		ps.executeUpdate();
		return "success";
		
	}
	public List<ProductDataModel> WebProductDisplay()
	{
		ArrayList<ProductDataModel> productlist=new ArrayList<>();
		try {
			Connection con=dc.GetConnection();
			PreparedStatement ps=con.prepareStatement("select * from productlist ");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				productlist.add(new ProductDataModel(rs.getInt(5),rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4)));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return productlist;
		
	}
	   public List<ProductDataModel> BuyProduct(int id)
	   {
		   ArrayList<ProductDataModel> buylist=new ArrayList<>();
			try {
				System.out.println(id);
				Connection con=dc.GetConnection();
				PreparedStatement ps=con.prepareStatement("select * from productlist where product_id=?;");
				ps.setInt(1, id);
				System.out.println("brs"+id);
				ResultSet rs=ps.executeQuery();
				System.out.println("ars"+id);
//				int quan=rs.getInt(4);
//				System.out.println(quan);
				while(rs.next())
				{
					if(rs.getInt(4)!=0)
					{
					buylist.add(new ProductDataModel(rs.getInt(5),rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4)));
					reducequantity(id,rs.getInt(4));
					return buylist;
					}
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
		   
	   }
	    public void reducequantity(int id,int quan)
	    {
	    	try
	    	{
	    		System.out.println(id);
	    		System.out.println(quan);
	    		int quantity=quan-1;
	    	Connection con=dc.GetConnection();
			PreparedStatement ps=con.prepareStatement("update productlist set quantity=? where product_id=? ");
			ps.setInt(1,quantity );
			ps.setInt(2, id);
			ps.executeUpdate();
	    	}catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    }
	    public List<ProductDataModel> GetSearhList(String operator) throws Exception, SQLException
	    {   ArrayList<ProductDataModel> searchlist=new ArrayList<>();
	    	Connection con=dc.GetConnection();
	    	PreparedStatement ps=con.prepareStatement("select * from productlist where product_name=?;");
	    	ps.setString(1,operator);
	    	ResultSet rs=ps.executeQuery();
	    	while(rs.next())
	    	{
				searchlist.add(new ProductDataModel(rs.getInt(5),rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4)));

	    	}
	    	return searchlist;
	    	
	    }
	    
	    public static void Addcarttables(ProductDataModel cl) throws ClassNotFoundException, SQLException
	    {int id=cl.getPid();
	    	try
	    	{
	    	System.out.println(UserService.password);
	    	Connection con=dc.GetConnection();
		    	PreparedStatement ps=con.prepareStatement("insert into"+" "+password+"cart"+" "+"values(?,?,?,?,?);");
		    	ps.setString(1,cl.getPname());
		    	ps.setString(2,cl.getPdes());
		    	ps.setDouble(3,cl.getPrice());
		    	ps.setInt(4,1);
		    	ps.setInt(5,cl.getPid());
		    	ps.executeUpdate();
	    	}catch(SQLIntegrityConstraintViolationException e)
		    {
		    	 int quan=0;
		    	Connection con=dc.GetConnection();
		    	PreparedStatement ps=con.prepareStatement("select * from"+" "+password+"cart"+" "+"where product_id=?;");
		    	ps.setInt(1, id);
		    	ResultSet rs=ps.executeQuery();
		    	while(rs.next())
		    	{
		    	    quan=rs.getInt(4)+1;
		    	}
		    	System.out.println(quan);
		    	PreparedStatement ps1=con.prepareStatement("update "+" "+password+"cart"+" "+"set quantity=? where product_id=?;");
		    	ps1.setInt(1, quan);
		    	ps1.setInt(2, id);
		    	ps1.executeUpdate();
		
		    }
	    }
	    
	    public ProductDataModel GetCartList(int id) throws Exception, SQLException
	    {   
	    	Connection con=dc.GetConnection();
	    	PreparedStatement ps=con.prepareStatement("select * from productlist where product_id=?;");
	    	ps.setInt(1,id);
	    	ResultSet rs=ps.executeQuery();
	    	while(rs.next())
	    	{
	    		return new ProductDataModel(rs.getInt(5),rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));

	    	}
			return null;	
	    }
	    public static String createtables(String status,String password) throws ClassNotFoundException, SQLException
	    {
	    	if(status.equals("Approve"))
	    	{   
		    	try
		    	{
		    		Connection con=dc.GetConnection();	
			    	PreparedStatement ps1=con.prepareStatement("create table"+" " +password+"wish" +" "+"like ecommerce.productlist;");
			    	ps1.execute();
		    	PreparedStatement ps=con.prepareStatement("create table"+" " +password+"cart" +" "+"like ecommerce.productlist;");
		    	ps.execute();
		    	}catch(SQLSyntaxErrorException e)
		    	{
		    		return null;
		    	}
	    	}
			return null;
	    }
	    public static void AddWishtables(ProductDataModel cl) throws ClassNotFoundException, SQLException
	    {int id=cl.getPid();
	    	try
	    {
	    	System.out.println(UserService.password);
	    	Connection con=dc.GetConnection();
		    	PreparedStatement ps=con.prepareStatement("insert into"+" "+password+"wish"+" "+"values(?,?,?,?,?);");
		    	ps.setString(1,cl.getPname());
		    	ps.setString(2,cl.getPdes());
		    	ps.setDouble(3,cl.getPrice());
		    	ps.setInt(4,1);
		    	ps.setInt(5,cl.getPid());
		    	ps.executeUpdate();
	    }catch(SQLIntegrityConstraintViolationException e)
	    {
	    	 int quan=0;
	    	Connection con=dc.GetConnection();
	    	PreparedStatement ps=con.prepareStatement("select * from"+" "+password+"wish"+" "+"where product_id=?;");
	    	ps.setInt(1, id);
	    	ResultSet rs=ps.executeQuery();
	    	while(rs.next())
	    	{
	    	    quan=rs.getInt(4)+1;
	    	}
	    	System.out.println(quan);
	    	PreparedStatement ps1=con.prepareStatement("update "+" "+password+"wish"+" "+"set quantity=? where product_id=?;");
	    	ps1.setInt(1, quan);
	    	ps1.setInt(2, id);
	    	ps1.executeUpdate();
	
	    }
	    	}
	    public ProductDataModel GetWishList(int id) throws Exception, SQLException
	    {   
	    	Connection con=dc.GetConnection();
	    	PreparedStatement ps=con.prepareStatement("select * from productlist where product_id=?;");
	    	ps.setInt(1,id);
	    	ResultSet rs=ps.executeQuery();
	    	while(rs.next())
	    	{
	    		return new ProductDataModel(rs.getInt(5),rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));

	    	}
			return null;	
	    }
	    public static void logout() throws ClassNotFoundException, SQLException
	    {
	    	try
	    	{
	    	Connection con=dc.GetConnection();	
	    	PreparedStatement ps=con.prepareStatement("drop table"+" " +password+"wish" +" "+";");
	    	ps.execute();
	    	}catch(SQLSyntaxErrorException e)
	    	{
	    		
	    	}
	    	
	    }
	    public static List<ProductDataModel> getMycart() throws ClassNotFoundException, SQLException
	    {
	    	ArrayList<ProductDataModel> mycart=new ArrayList<>();
	    	String tablename=password+"cart";
	    	System.out.println(tablename);
	    	Connection con=dc.GetConnection();
	    	PreparedStatement ps=con.prepareStatement("select * from"+" "+password+"cart"+" "+";");
	    	ResultSet rs=ps.executeQuery();
	    	while(rs.next())
	    	{
	    		 mycart.add(new ProductDataModel(rs.getInt(5),rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4)));

	    	}
	    	
			return mycart;
	    	
	    }
	    public static List<ProductDataModel> getMyWishlist() throws ClassNotFoundException, SQLException
	    {
	    	ArrayList<ProductDataModel> mywishlist=new ArrayList<>();
	    	String tablename=password+"wish";
	    	System.out.println(tablename);
	    	Connection con=dc.GetConnection();
	    	PreparedStatement ps=con.prepareStatement("select * from"+" "+password+"wish"+" "+";");
	    	ResultSet rs=ps.executeQuery();
	    	while(rs.next())
	    	{
	    		mywishlist.add(new ProductDataModel(rs.getInt(5),rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4)));

	    	}
	    	
			return mywishlist;
	    	
	    }
	    public static void removecart(int id) throws ClassNotFoundException, SQLException
	    {
	    	Connection con=dc.GetConnection();
	    	PreparedStatement ps=con.prepareStatement("delete  from"+" "+password+"cart"+" "+"where product_id=?;");
	    	ps.setInt(1, id);
	    	ps.execute();
	    }

}
