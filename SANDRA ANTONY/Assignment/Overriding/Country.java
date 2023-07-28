class Country
{
	public void currency(String cur)
	{
		System.out.println("World currency is: "+cur);
	}
}

class India extends Country
{
	public void currency(String cur)
	{
		super.currency("US doller");
		System.out.println("Soon the world currency will be: "+cur);
	}
}

class test 
{
	public static void main(String args[])
	{
		India c = new India();
		c.currency("Indian Rupees");
	}
}

	