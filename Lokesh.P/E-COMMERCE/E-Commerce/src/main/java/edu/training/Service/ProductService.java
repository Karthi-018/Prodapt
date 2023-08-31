package edu.training.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.Model.ProductPojo;

public class ProductService extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con=DAOClass.getConnect();
	public String addProduct(ProductPojo p) throws SQLException
	{
		PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?,?);");
		ps.setInt(1,p.getProduct_id());
		ps.setString(2, p.getProduct_Name());
		ps.setString(3,p.getProduct_Desc());
		ps.setInt(4, p.getProduct_price());
		ps.setInt(5, p.getQuantity());
		int temp=ps.executeUpdate();
		return "product added";
		
	}
	public String edit(int eid,int eprice,int eqty)
    {
        Connection con=DAOClass.getConnect();

        PreparedStatement ps=null;
        try {

            ps = con.prepareStatement("update product set Product_price=?,Quantity=? where Product_id=?");

            ps.setInt(1,eprice );
            ps.setInt(2, eqty);
            ps.setInt(3, eid);
            ps.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();

        }
        return "Edited successfully";
    }
	public String deleteProduct(int Product_id) throws SQLException
	{
		PreparedStatement ps = con.prepareStatement("delete from product where Product_id=?");
		ps.setInt(1,Product_id);
		int temp=ps.executeUpdate();
		return "deleted";
	}
	
	public ArrayList<ProductPojo> viewProduct() throws SQLException
	{
		PreparedStatement ps = con.prepareStatement("select * from  product");
		ResultSet rs=ps.executeQuery();
		ArrayList<ProductPojo> products = new ArrayList<ProductPojo>();
		while(rs.next())
		{
			products.add(new ProductPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)));
		}
		return products;
		
	}

}
