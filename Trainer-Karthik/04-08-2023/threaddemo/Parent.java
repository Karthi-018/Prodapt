package edu.prodapt.demos.threaddemo;

public class Parent extends Thread {
	
	public synchronized void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i + " Java");
		}
	}

}
