package edu.prodapt.demos.threaddemo;

public class Demo  implements Runnable {
	HitCount hc = new HitCount();
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			hc.getCount();
//				System.out.println(HitCount.count);
		}
	}
	
//	public int getObj()
//	{
//		return hc.count;
//	}
	
	

}
