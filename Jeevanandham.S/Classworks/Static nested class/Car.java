class Car
{
	String model = "Ford";
	private static String engineNum = "123xyz";
	static class Engine
	{
		void display()
		{
			Car c = new Car();
			System.out.println("Model Name: "+c.model);
			System.out.println("Engine Number: "+c.engineNum);
		}
	}
}