public class Properties
{	

	public static void prop(int a)
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("1) a*0 is always equal to zero");
		System.out.println("   a is equal to "+a);
		System.out.println("   Here, a*0 is equal to "+a*0);
		System.out.println("   This is the Zero Property.");
		System.out.println("--------------------------------------------------------");
		System.out.println("2) a*1 is always equal to one");
		System.out.println("   a is equal to "+a);
		System.out.println("   Here, a*1 is equal to "+a*1);
		System.out.println("   This is the Identity Property.");
		System.out.println("--------------------------------------------------------");
	}

	public static void prop(int a, int b)
	{
		System.out.println("3) (a*b) should be equal to (b*a)");
		System.out.println("   a is equal to "+a+" and b is equal to "+b);
		System.out.println("   Here, (a*b) and (b*a) are equal to "+a*b);
		System.out.println("   This is the Commutative Property.");
		System.out.println("--------------------------------------------------------");
	}

	public static void prop(int a, int b, int c)
	{
		System.out.println("4) a*(b*c) should be equal to (a*b)*c");
		System.out.println("   a is equal to "+a+", b is equal to "+b+" and c is equal to "+c);
		System.out.println("   Here, a*(b*c) and (a*b)*c are equal to "+(a*b)*c);
		System.out.println("   This is the Associative Property.");
		System.out.println("--------------------------------------------------------");
	}

}
