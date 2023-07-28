class Father
{
	public void display(int n)
	{
		System.out.println("Father age is : "+n);
	
	}
}

class Child1 extends Father
{
	public void display(int n)
	{
		super.display(50);
		System.out.println("Child1 age is : "+n);
	
	}
}
class Child2 extends Child1
{
	public void display(int n)
	{
		super.display(13);
		System.out.println("Child2 age is : "+n);
	
	}
}


class MainClass
{
	public static void main(String a[])
	{
		Child2 c = new Child2();
		c.display(2);
	}
}
