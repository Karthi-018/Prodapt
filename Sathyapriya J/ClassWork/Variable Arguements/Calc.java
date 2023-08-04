class Calc 
{
	public void add(int...i)
	{
		int sum = 0;
		for(int n : i)
		{
			sum=sum+n;
		}
		System.out.println("The total is "+sum);
	}
	public static void main(String a[])
	{
		Calc c = new Calc();
		c.add(13,2);
		c.add(1,2,3,4,5);
		c.add(10,10,10);
	}
}
