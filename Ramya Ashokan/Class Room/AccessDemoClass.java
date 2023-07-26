
package access;
public class AccessDemoClass
{
	public String pubStr="Public";
	protected String proctStr ="Protected";
	private String priStr="Private";
	String defStr="Default";
	
	public static void main(String args[])
	{
		AccessDemoClass a = new AccessDemoClass();
		
		System.out.println(a.pubStr);
		System.out.println(a.proctStr);
		System.out.println(a.priStr);
		System.out.println(a.defStr);
	}
}

class AccessDemoClass1
{
public static void main(String args[])
{
AccessDemoClass a1 = new AccessDemoClass();
System.out.println(a1.pubStr);
System.out.println(a1.proctStr);
//System.out.println(a1.priStr);
System.out.println(a1.defStr);
	}
}