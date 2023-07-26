class FoodOrder{
	public void order(int num,String food)
	{
		System.out.println("Order Taken");
		System.out.println("Preparing Your Order:\n"+num+" "+food );
	}
		
	public void order(int num,String food,String addons)
	{
		System.out.println("Order Taken");
		System.out.println("Preparing Your Order:\n"+num+" "+food+" with "+ addons );
	}
  
	public void order(int num,String food,String addons1,String addons2)
	{
		System.out.println("Order Taken");
		System.out.println("Preparing Your Order:\n"+num+" "+food+" with "+ addons1+" and "+addons2 );
	}
}

	public class MainFood
	{
		public static void main(String args[])
		{
			FoodOrder items=new FoodOrder();
			items.order(1,"Shawarma","Peri Peri Sauce");
			items.order(3,"Brownie","Vanilla Icecream");
			items.order(1,"Burger");
			items.order(2,"Pizza","Double Cheese","Veggies");	
		}
	}
