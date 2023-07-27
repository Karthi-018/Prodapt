public class Shapes
{
	public static void area(int a)
	{
		System.out.println("The area of the square is "+a*a);
	}

	public static void area(int a, int b)
	{
		System.out.println("The area of the rectangle is is "+a*b);
	}

	public static void area(double a)
	{
		System.out.println("The area of the circle is is "+3.14*a);
	}

	public static void area(int a, int b, double h)
	{
		System.out.println("The area of the trapezium is "+((a+b)*h)/2);
	}
}