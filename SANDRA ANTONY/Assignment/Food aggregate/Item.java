package Food;

public class Item 
{
	private String name;
	private Double price;
	private String type;
	
	public Item()
	{}
	
	public Item(String name, Double price, String type) 
	{
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Double getPrice() 
	{
		return price;
	}

	public void setPrice(Double price) 
	{
		this.price = price;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	@Override
	public String toString() 
	{
		return "Item [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
	public static Item item(String food) 
	{
		
		String arr[]=food.split(",");
		String name = arr[0]; 
		Double price =Double.parseDouble(arr[1]);
		String type = arr[3];
	
		Item obj = new Item(name,price,type);

		return obj;
		
		
	}
	
	
	

}
