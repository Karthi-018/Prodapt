package com.foodagregator;
import java.text.DecimalFormat;
public class Item {
	 private String name;
	    private double price;
	    private String type;
	public Item(){}
	    public Item(String name, double price, String type) {
	        this.name = name;
	        this.price = price;
	        this.type = type;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }
	    public static Item itemSplit(String item)
	    {
	    	
	     String [] items=item.split(",");
	     String name=items[0];
	     double price=Double.parseDouble(items[1]);
	     String type=items[2];
	        //DecimalFormat decimalFormat=new DecimalFormat("#.#");
	        //String formattedPrice=decimalFormat.format(price);
	     return new Item(name,price,type);
	    }
	    public String toString()
	    {
	        return name+" "+price+" "+type;
	    	 
	    }
}
