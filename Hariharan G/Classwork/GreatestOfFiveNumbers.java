import java.util.*;
class GreatestOfFiveNumbers
{
	public static void main(String args[])
	{

	int n1,n2,n3,n4,n5;
	Scanner sc=new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();
	n3=sc.nextInt();
	n4=sc.nextInt();
	n5=sc.nextInt();
	
	if(n1>n2 && n1>n3 && n1>n4 && n1>n5)
		System.out.println("n1 greatest");
	if(n2>n1 && n2>n3 && n2>n4 && n2>n5)
		System.out.println("n2 greatest");
	if(n3>n1 && n3>n2 && n3>n4 && n3>n5)
		System.out.println("n3 greatest");
	if(n4>n1 && n4>n2 && n4>n3 && n4>n5)
		System.out.println("n4 greatest");
	if(n5>n1 && n5>n2 && n5>n3 && n5>n4)
		System.out.println("n5 greatest");
	}
}