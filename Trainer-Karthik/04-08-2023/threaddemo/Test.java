package edu.prodapt.demos.threaddemo;

public class Test extends Thread {
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("World");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
