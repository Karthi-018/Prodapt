class Grocery
{
	public void item(String chocolate_name,int quantity,int price)
	{
		System.out.println("The price of "+quantity+ " bar of " +chocolate_name+" chocolates is Rs. "+(quantity*price));
	}
	public void item(String pulse_name,double quantity,int price)
	{
		System.out.println("The price of "+quantity+" kg "+pulse_name+ " pulses is Rs. "+(quantity*price));
	}
	public void item(int price,String Milk,int quantity)
	{
		System.out.println("The price of "+quantity+" packet of "+Milk+ " milk is Rs. "+(quantity*price));
	}
	public void item(int price,double quantity)
	{
		System.out.println("The price of "+quantity+" kg apple is Rs. "+(quantity*price));
	}

}
public class GroceryShop
{
	public static void main(String args[])
	{
		Grocery g= new Grocery();
		g.item("dairymilk",5,10);
		g.item("moondal",2.5,50);
		g.item(35,"aavin",3);
		g.item(100,1.5);
	}
}
		

