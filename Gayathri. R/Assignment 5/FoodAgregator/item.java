package edu.prodapt.jdbc;

public class item {
	private String name;
	private Double price;
	private String type;
	
	
	public item()
	{
		
	}
	
	public item(String name,Double price,String type)
	{
		this.name=name;
		this.price=price;
		this.type=type;
	}
    void setname(String name)
    {
    	this.name=name;
    }
    String getname()
    {
    	return name;
    }
    void setprice(Double price)
    {
         this.price=price;
    }
    Double getprice()
    {
    	return price;
    	
    }
    void settype(String type)
    {
    	this.type=type;
    }
    String gettype()
    {
    	return type;
    }
    public String toString()
    {
    	return name+" "+price+" "+type;
    }
    }
