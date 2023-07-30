class Truck
{
	public void Display()
	{
		System.out.println("Truck is running");
	}
}
class Motor extends Truck
{
	public void Display()
	{
		super.Display();
		System.out.println("Motor is running");
	}
}
class MainTruck
{
	public void main(String args[])
	{
		Motor m=new Motor();
		m.Display();
	}
}