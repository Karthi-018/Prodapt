import java.util.*;
class Greatest
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		if (a>b && a>c && a>d && a>e)
		{
			System.out.println(a + " is greatest");
		}
		else if (b>c && b>d && b>e)
		{
			System.out.println("The greatest is: " + b);
		}
		else if (c>d && c>e)
		{
			System.out.println("The greatest is: " + c);
		}
		else if (d>e)
		{
			System.out.println("The greatest is: " + d);
		}
		else 
		{
			System.out.println("The greatest is: " + e);
		}
		
	}
}
