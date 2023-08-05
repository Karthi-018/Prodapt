package edu.prodapt.demos.threaddemo;

public class HitCount {
	
	static int count;
	
	public synchronized void getCount()
	{
		count++;
	}
}
