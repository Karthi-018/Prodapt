interface Demo1
{
	default void displya()
	{
		System.out.println("Demo1");
	}
}


interface Demo2
{
	default void display()
	{
		System.out.println("Demo2");
	}
}



class MainCls implements Demo1,Demo2
{

	public void display()
	{
		System.out.println("Main class");
	}


	public static void main(String[] args)
	{
		MainCls m = new MainCls();
		m.display();
	}

}
