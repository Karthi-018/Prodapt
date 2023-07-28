class Calcu
{
	
	public void add(int a, int b, int c)
	{
		System.out.println("The sum integer is "+(a+b+c));
	}
	public void add(double a, double b, double c)
	{
		System.out.println("The sum double is "+(a+b+c));
	}
	public void add(String a, String b, String c)
	{
		System.out.println("The sum of String is " +(a+b+c));
	}

	public static void main(String a[])
	{
		Calcu opr = new Calcu();
		opr.add(10,20,30);
		opr.add(7.844,18.556,91.777);
		opr.add("hi ","hey ","hola");
	}
}
