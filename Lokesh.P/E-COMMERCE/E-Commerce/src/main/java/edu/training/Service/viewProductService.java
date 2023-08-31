package edu.training.Service;



import java.io.IOException;
import java.sql.*;
import java.util.*;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import edu.training.Model.ProductPojo;





public class viewProductService extends HttpServlet
{
   private static final long serialVersionUID = 1L;
   Connection con=DAOClass.getConnect();

   public List<ProductPojo> getAllProducts() throws SQLException 
   {
       System.out.println(22);
       List<ProductPojo> products = new ArrayList<>();

       PreparedStatement ps = con.prepareStatement("SELECT * FROM product;");
       ResultSet rs = ps.executeQuery();
       while (rs.next()) {
           int Product_id = rs.getInt(1);
           String Product_Name= rs.getString(2);
           String Product_Desc = rs.getString(3);
           int Product_price= rs.getInt(4);
           int Quantity = rs.getInt(5);
           System.out.println(Product_id );
           ProductPojo p = new ProductPojo(Product_id , Product_Name, Product_Desc, Product_price, Quantity);
           products.add(p);
       }
       System.out.println(products);

       return products;
   }



}

