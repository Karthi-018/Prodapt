public class StaticDemo{

	static String strStatic="Static Variable";
	String strInstance="Instance Variable";

	static void display()
	{
		System.out.println(strStatic);
	}


public static void main(String[] args)
{
//	System.out.println(StaticDemo.strStatic);
	System.out.println(strStatic);
	StaticDemo.display();

	StaticDemo sd=new StaticDemo();

	System.out.println(sd.strInstance);
	sd.strStatic="ABC";
	System.out.println(sd.strStatic);
	System.out.println(StaticDemo.strStatic);
}



static
{
	System.out.println("I am static block");
	strStatic="Init in static block";
}

}