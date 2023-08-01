class Throws
{

	public void myFun(int n1, int n2, String str) throws Exception
	{
		if(str == null)
		{
			throw new NullPointerException();
		}
		else
		{
			System.out.println(str.length());
		}
		
		System.out.println(n1/n2);
	}


	public static void main(String[] args)
	{

		Throws  d = new Throws();

		try	
		{
			d.myFun(10,0,null);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}