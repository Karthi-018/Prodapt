class Demo1
{
	String str="Demo";
}
class Test extends Demo1
{
	private String str="Test";
}
public class FieldShadowing
{
	public static void main(String args[])
	{
	Demo1 d=new Test();
	System.out.println(d.str);
	}
}


