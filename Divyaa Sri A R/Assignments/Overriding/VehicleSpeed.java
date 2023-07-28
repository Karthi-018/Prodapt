class Vehicle
{
	public void speed(int minspeed,int maxspeed)
	{
		System.out.println("The minimum speed of vehicle is: "+minspeed+ "kmph \nThe maximum speed of vehicle is: "+maxspeed+ "kmph");
	}
}
class Car extends Vehicle
{
	public void speed(int minspeed,int maxspeed)
	{
		System.out.println("The minimum speed of car is: "+minspeed+ "kmph \nThe maximmum speed of car is: "+maxspeed+ "kmph");
	}
}
class Bike extends Vehicle
{
	public void speed(int minspeed,int maxspeed)
	{
		System.out.println("The minimum speed of bike is: "+minspeed+ "kmph \nThe maximmum speed of bike is: "+maxspeed+ "kmph");
	}
}
public class VehicleSpeed
{
	public static void main(String a[])
	{
		System.out.println();
		System.out.println("**********Speed of Vehicle**********");
		System.out.println();
		Vehicle v=new Vehicle();
		v.speed(20,60);
		System.out.println();
		System.out.println("**********Speed of Car**********");
		System.out.println();
		Car c=new Car();
		c.speed(50,100);
		System.out.println();
		System.out.println("**********Speed of Bike**********");
		System.out.println();
		Bike b=new Bike();
		b.speed(60,100);
	}
}