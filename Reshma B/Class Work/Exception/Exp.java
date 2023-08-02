class Exp
{
	void divide(int a, int b)
	{
		int result=0;
		int array[]=new int[6];
		try
		{
			result=a/b;
			array[6]=20;
			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}


	public static void main (String args[])
	{
		Exp m = new Exp();
		m.divide(0,10);
	}
}