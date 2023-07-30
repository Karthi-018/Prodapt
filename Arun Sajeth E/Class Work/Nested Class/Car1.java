
class Car1
{
	static String model="ABC";
	private static String engineNo="123ABC";
	
	
	public static String getEngno()
	{
		return  engineNo;
	}

	static class Engine1
	{
		public static void Run()
		{
			Car1 c = new Car1();
			System.out.println("The Car Model Number is "+c.model);
			System.out.println("The Engine number for Car is "+engineNo);
		}
	}
}
class Maincar
{
	public static void main(String[] a)
	{
		Car1.Engine1 e = new Car1.Engine1();
		e.Run();
		Car1 ca=new Car1();
		System.out.println(ca.model);
		System.out.println(Car1.model);
		System.out.println(Car1.getEngno());
	}
	static
	{
		System.out.println("Car Details");
	}
}
	