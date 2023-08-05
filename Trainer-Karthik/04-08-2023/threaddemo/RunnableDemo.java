package edu.prodapt.demos.threaddemo;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		HitCount hc = new HitCount();
		
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<1000;i++)
				{
					hc.getCount();
				}
			}
		};
		
Runnable t2 = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<1000;i++)
				{
					hc.getCount();
//					System.out.println(hc.count);
				}
				
			}
		};
		Thread newt1 = new Thread(t1);
		Thread newt2 = new Thread(t2);
		
		newt1.start();
		newt2.start();
		try {
			newt1.join();
			newt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(hc.count);
		
		Test t = new Test();
		
		System.out.println(t.getPriority());
		t.setPriority(8);
		System.out.println(t.getPriority());
		
	}

}
