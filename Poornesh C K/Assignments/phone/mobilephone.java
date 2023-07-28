import java.util.Scanner;
class mobilephone{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter call type");
	System.out.println("1.voice call");
	System.out.println("2.conference call");
	System.out.println("3.video call");
	int type =sc.nextInt();
	Calltype c=new Calltype();
	
	switch(type){
		case 1:
			String p1 = sc.next();
			String p2 = sc.next();
			c.call(p1,p2);
			break;
		case 2:
			String o1 = sc.next();
			String o2 = sc.next();
			String o3 = sc.next();
			c.call(o1,o2,o3);
			break;
		case 3:
                        String u1 = sc.next();
			String u2 = sc.next();
			String u3 = sc.next();
			String u4 = sc.next();
			c.call(u1,u2,u3,u4);
			break;
	}
	
	
		
	}
}