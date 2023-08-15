package FoodAggregate;

public class FoodItem 
{
	private String name;
	private double price;
	private String type;
	
	public FoodItem()
	{
		
	}
	
	public FoodItem(String name, Double price, String type) 
	{
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	
	public String toString()
	{
		return name+"  "+price+"  "+type;
	}
	
	public static FoodItem item(String food) 
	{
		
		String arr[]=food.split(",");
		String name = arr[0]; 
		Double price =Double.parseDouble(arr[1]);
		String type = arr[3];
	
		FoodItem fi = new FoodItem(name,price,type);

		return fi;
				
	}

}
