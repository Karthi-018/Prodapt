class Demo implements Runnable 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Java");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
class Test implements Runnable 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("CPP");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
class mainThread2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		Test t = new Test();
		
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(t);
		t1.start();
		t2.setPriority(8);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t2.start();
	}
}