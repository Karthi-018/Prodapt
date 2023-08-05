package edu.prodapt.demos.threaddemo;

public class MainClass {

	public static void main(String[] args) {
		
//		Demo t1 =new Demo();
//		Test t2 = new Test();
//		t1.start();
//		t2.start();
////		t2.setDaemon(true);
//		System.out.println(t1.getId());
//		System.out.println(t1.getName());
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		
//		try {
//			t1.join();
//			
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Demo d = new Demo();
		
		Thread newT1 = new Thread(d);
		Thread newT2 = new Thread(d);
		
		newT1.start();
		newT2.start();
		
//		System.out.println(HitCount.c);
		
//		for(int i = 0;i<1000;i++)
//		{
//			t1.getCount();
//		}
//			
//		for(int i = 0;i<1000;i++)
//		{
//			t2.getCount();
//		}
		
		
		
		
	}

}
