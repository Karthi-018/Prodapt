interface Calculator
{

	default void add(int n1,int n2)
	{
		System.out.println(n1+n2);
	}


	static void sub(int n1,int n2)
	{
		System.out.println(n1-n2);
	}

	private default void div(int n1,int n2)
	{
		System.out.println(n1/n2);
	}

	private static void mul(int n1,int n2)
	{
		System.out.println(n1*n2);
	}


}

class MainCls
{
	public static void main(String[] args)
	{
		MainCls m = new MainCls();
		m.mul(6,3);
	}
}