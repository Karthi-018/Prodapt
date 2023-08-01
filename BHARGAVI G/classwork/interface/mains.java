interface DemoInterface1
{
default void display()
{	
	System.out.println("hi");
}
}
class DemoInterface2
{
public void display()
{
	System.out.println("hello");
}
}
class mains extends DemoInterface2 implements DemoInterface1
{
	/*public void display()
{
	System.out.println("world");
}*/
public static void main(String args[])
{
	mains m=new mains();
	m.display();
}
}