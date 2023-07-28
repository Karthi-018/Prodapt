class Truck
{
	public void run(String vehicle)
	{
		System.out.println(vehicle+" is running");
	}
}
class Engine extends Truck
{
	public void run(String Vehicle)
	{
		super.run("Truck");
		System.out.println(Vehicle+" is operating so Truck is running");
	}
}
class MainTruck
{
	public static void main(String[] arg)
	{
		Engine m=new Engine();
		m.run("Engine");
	}
}