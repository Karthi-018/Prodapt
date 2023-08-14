package items;

public class Item 
{
	private String name;
	private String type;
	private double price;
	
	Item()
	{
		
	}
	
	Item(String name,double price,String type)
	{
		this.name=name;
		this.price=price; 
		this.type=type;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public double getPrice()
	{
		return price;
	} 
	
	public static Item itemObject(String item)
	{
		String[] itemArray=item.split(",");
		return new Item(itemArray[0],Double.valueOf(itemArray[1]),itemArray[2]);
		
	}

}
