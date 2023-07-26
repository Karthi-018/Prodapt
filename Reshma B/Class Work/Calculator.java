class Calculator
{
	public void add(int... num)
	{
		int sum=0;
		for(int n:num)
		{
			sum+=n;
		}
		System.out.println("The sum of the given "+num.length+" values is "+sum);
	}

	public static void main(String args[])
	{
		Calculator c=new Calculator();
		c.add(10,20);
		c.add(10,20,30);
		c.add(101,102,103,104);
	}
}