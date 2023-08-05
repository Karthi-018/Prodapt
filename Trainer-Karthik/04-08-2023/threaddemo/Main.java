package edu.prodapt.demos.threaddemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		Child c = new Child();
//		p.setPriority(8);
		c.start();
		p.start();
		
		try {
			c.wait();
			c.join();
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
