package edu.prodapt.demo;

public class Item {
	private String name;
	private Double price;
	private String type;
	
	public Item()
	{
		
	}
	
	public Item(String name,Double price,String type)
	{
		this.name=name;
		this.price=price;
		this.type=type;
	}
	
	public void setname(String Name)
	{
		name=Name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setprice(Double Price)
	{
		price=Price;
	}
	public Double getprice()
	{
		return price;
	}
	
	public void settype(String Type)
	{
		type=Type;
	}
	public String gettype()
	{
		return type;
	}
	
	public String toString()
	{
		return name+" "+price+" "+type;
	}
	

}
