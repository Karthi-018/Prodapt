import java.util.Scanner;
class Shape
{
	public void area(int side)
	{
		System.out.println("Area of Square is "+(side*side));
	}
	public void area(double length, double width)
	{
		System.out.println("Area of Rectangle is "+(length*width));
	}
	public void area(int base,int height)
	{
		System.out.println("Area of Triangle is "+((base*height)/2));
	}
	public void area(double radius)
	{
		System.out.println("Area of Circle is "+(3.14*radius*radius));
	}
}
public class Shapes
{
	public static void main(String a[])
	{
		Shape s= new Shape();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of side ");
		int side=sc.nextInt();
		System.out.println("Enter the value of length ");
		double length=sc.nextDouble();
		System.out.println("Enter the value of width ");
		double width=sc.nextDouble();
		System.out.println("Enter the value of base ");
		int base=sc.nextInt();
		System.out.println("Enter the value of height ");
		int height=sc.nextInt();
		System.out.println("Enter the value of radius ");
		double radius=sc.nextDouble();
		System.out.println("**************************");
		s.area(side);
		s.area(length,width);
		s.area(base,height);
		s.area(radius);
	}
}
