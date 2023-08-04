interface A1
{
	//void display();
}
interface A2
{
	default void display()
	{
		System.out.println("A2");
	}
}
class MainClass implements A1,A2
{
	public void display()
	{
		System.out.println("hiiii");
        }
	public static void main(String a[])
	{
		MainClass mc = new MainClass();
		mc.display();
	}
}


	
		
	