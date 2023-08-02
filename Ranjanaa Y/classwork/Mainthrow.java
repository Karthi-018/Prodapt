class demo
{
	void myfun(int n1,int n2,int size,String str)throws Exception
	{
		int arr[] = new int[size];
		if(str == null)
		{
			throw new NullPointerException();
		}
		else
		{
			System.out.println(str.length());
		}
		if(n2==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println(n1/n2);
		}
		System.out.println(str.length());
		System.out.println(n1/n2);
		for(int i=0;i<size;i++)
		{
			arr[i]=i+1;
		}
		for(int j:arr)
		{
			System.out.println(j);
		}
	}
}
class Mainthrow
{
	public static void main(String args[])
	{
		demo d = new demo();
		try
		{
			d.myfun(10,0,5,"hi");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}