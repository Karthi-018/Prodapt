import java.util.Scanner;
public class MainShape
{
public static void main(String a[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter length");
	int l=sc.nextInt();
	System.out.println("Enter breadth");
	int b=sc.nextInt();
	Shape s=new Rectangle();
	s.area(l,b);
}
}