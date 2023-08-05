class Demo extends Thread 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Java");
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
class Test extends Thread 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("CPP");
			try
			{
				sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
class mainThread1 
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		Test t = new Test();
		d.start();
		t.start();
		try{
			d.join();
			t.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		System.out.println(t.getPriority());
		
	}
}