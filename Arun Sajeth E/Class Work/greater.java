import java.util.*;

class greater
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the five numbers:");

		System.out.println("a=");
		int a=s.nextInt();

		System.out.println("b=");
		int b=s.nextInt();

		System.out.println("c=");
		int c=s.nextInt();

		System.out.println("d=");
		int d=s.nextInt();

		System.out.println("e=");
		int e=s.nextInt();

		if(a>b && a>c && a>d && a>e)
			System.out.println("a is greater");
		else if(b>c && b>d && b>e)
			System.out.println("b is greater");
		else if(c>d && c>e)
			System.out.println("c is greater");
		else if(d>e)
			System.out.println("d id greater");
		else
			System.out.println("e is greater");
	
	}

}