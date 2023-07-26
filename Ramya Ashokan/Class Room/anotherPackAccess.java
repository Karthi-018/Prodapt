package access1;
import access.*;
class anotherPackAccess
{
	public static void main(String args[])
	{
		AccessDemoClass dc = new AccessDemoClass();
		
		System.out.println(dc.pubStr);
		//System.out.println(dc.proctStr);
		//System.out.println(dc.priStr);
		//System.out.println(dc.defStr);
	}
}
class anotherPackAccess1 extends anotherPackAccess
{
public static void main(String args[])
	{
		AccessDemoClass dc1 = new AccessDemoClass();
		
		System.out.println(dc1.pubStr);
		//System.out.println(dc1.proctStr);
		//System.out.println(dc1.priStr);
		//System.out.println(dc1.defStr);
	}
}