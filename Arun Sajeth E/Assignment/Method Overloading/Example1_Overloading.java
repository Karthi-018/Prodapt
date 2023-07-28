class Example1_Overloading
{
	public void Addition(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public void Addition(String a, String b, String c)
	{
		System.out.println(a+b+c);
	}
	public void Addition(double a, double b, double c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String args[])
	{
		Example1_Overloading exp1 = new Example1_Overloading();
		exp1.Addition(3,5,6);
		exp1.Addition("have"," a", " goodday");
		exp1.Addition(7.5,3.7,7.9);
	}
}