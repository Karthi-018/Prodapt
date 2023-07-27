public class Properties
{	

	public static void prop(int a)
	{
		System.out.println("1) a*0 is always equal to zero");
		System.out.println("   Here, a*0 is equal to "+a*0);
		System.out.println("   This is the Zero Property.");
		System.out.println("2) a*1 is always equal to one");
		System.out.println("   Here, a*0 is equal to "+a*1);
		System.out.println("   This is the Identity Property.");
	}

	public static void prop(int a, int b)
	{
		System.out.println("3) (a*b) should be equal to (b*a)");
		System.out.println("   Here, (a*b) and (b*a) are equal to "+a*b);
		System.out.println("   This is the Commutative Property.");
	}

	public static void prop(int a, int b, int c)
	{
		System.out.println("4) a*(b*c) should be equal to (a*b)*c");
		System.out.println("   Here, a*(b*c) and (a*b)*c are equal to "+(a*b)*c);
		System.out.println("   This is the Associative Property.");
	}

}
