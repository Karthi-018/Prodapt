class Demo
{
	void myfun(int n,int n2,int size,String str) throws Exception
		{
			int arr[]=new int[size];
			if(str == null)
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
			for(int i:arr)
			{
				System.out.println(i);
			}
		}
}

class ExceptionHandling
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		try 
		{
			d.myfun(10,5,5,"Hi");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 
	}
}


