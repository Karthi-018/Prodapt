package edu.training.Model;

public class ProductPojo {
	
	int Product_id;
	String Product_Name;
	String Product_Desc;
	int Product_price;
	int Quantity;
	public ProductPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	public ProductPojo(int product_id, String product_Name, String product_Desc, int product_price, int quantity) {
		super();
		Product_id = product_id;
		Product_Name = product_Name;
		Product_Desc = product_Desc;
		Product_price = product_price;
		Quantity = quantity;
	}




	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getProduct_Desc() {
		return Product_Desc;
	}
	public void setProduct_Desc(String product_Desc) {
		Product_Desc = product_Desc;
	}
	public int getProduct_price() {
		return Product_price;
	}
	public void setProduct_price(int product_price) {
		Product_price = product_price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductPojo [Product_id=" + Product_id + ", Product_Name=" + Product_Name + ", Product_Desc="
				+ Product_Desc + ", Product_price=" + Product_price + ", Quantity=" + Quantity + "]";
	}
	
}
