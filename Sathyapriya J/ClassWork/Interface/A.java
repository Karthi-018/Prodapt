interface A
{
	default void display()
	{
		System.out.println("Hi");
	}
}

interface B
{
	static void display()
	{
		System.out.println("Hello");
	}
}

class MainClass implements A,B
{
	public void display()
	{
		System.out.println("World");	
	}
	public static void main(String a[])
	{
		MainClass mc = new MainClass();
		mc.display();
		B.display();
	}
}