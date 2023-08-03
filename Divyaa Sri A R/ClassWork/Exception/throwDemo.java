class throwDemo
{
	void myfun(int n1,int n2,int size, String str)throws Exception
	{
		int arr[]= new int[size];
		System.out.println(str);
		System.out.println(n1/n2);
		if(str==null)
		{
			throw new NullPointerException();
		}
		else
		{
			System.out.println(str.length());
		}
		
		for(int i=0;i<size;i++)
		{
			arr[i]=i+1;
		}
		for(int i: arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String a[])
	{
		throwDemo d= new throwDemo();
		try
		{
			d.myfun(10,0,5,null);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
		