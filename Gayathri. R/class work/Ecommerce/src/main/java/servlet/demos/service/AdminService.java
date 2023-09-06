package servlet.demos.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import servlet.demos.connection.databaseConnection;
import servlet.demos.model.ProductDataModel;
import servlet.demos.model.UserDataModel;

public class AdminService {
	databaseConnection dc=new databaseConnection();
	public String AddProduct(ProductDataModel p) throws ClassNotFoundException, SQLException 
	{
		    Connection con=dc.GetConnection();
			PreparedStatement ps=con.prepareStatement("insert into productlist values(?,?,?,?,?)");
			ps.setString(1,p.getPname());
			ps.setString(2,p.getPdes());
			ps.setDouble(3,p.getPrice());
			ps.setInt(4,p.getQuan());
			ps.setInt(5,p.getPid());
			ps.executeUpdate();
			return "added success";
	}
	public List<ProductDataModel> viewproduct()
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
	public List<UserDataModel> ViewUser()
	{
		
		ArrayList<UserDataModel> userlist=new ArrayList<>();
		try {
			Connection con=dc.GetConnection();
			PreparedStatement ps=con.prepareStatement("select * from userdata ");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				userlist.add(new UserDataModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
			}
			System.out.println(userlist);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return userlist;
	}
	
	
	    public String EditUser(String email,String status) throws Exception, SQLException
	    {
	    	Connection con=dc.GetConnection();
	    	PreparedStatement ps=con.prepareStatement("update userdata set status=? where email=?");
	    	ps.setString(1, status);
	    	ps.setString(2, email);
	    	ps.executeUpdate();
			return "success";
		
	    }

}
