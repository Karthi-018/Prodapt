class calculation
{
	public void sum(int a)
	{
		System.out.println("The sum integer is "+a);
	}
	public void sum(double a, double b)
	{
		System.out.println("The sum double is "+(a+b));
	}
	public void sum(float a, float b, float c)
	{
		System.out.println("The sum of Float is " +(a+b+c));
	}

	public static void main(String a[])
	{
		calculation c = new calculation();
		c.sum(10);
		c.sum(7.844,18.556);
		c.sum(10.0f, 20.0f, 30.0f);
	}
}