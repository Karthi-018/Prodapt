interface Demo1
{
	default void display()
	{
		System.out.println("Demo1");
	}
}

class Demo2
{
	public void display()
	{
		System.out.println("Demo2");
	}
}

class MainCls extends Demo2 implements Demo1
{
	public static void main(String[] args)
	{
		Demo1 m = new MainCls();
		m.display();
	}
}