abstract class shape
{
	int l;
	int b;
	abstract void area();

	void setl(int l)
	{
		this.l=l;
	}
	int getl()
	{
		return l;	
	}
	void setb(int b)
	{
		this.b=b;
	}
	int getb()
	{
		return b;	
	}
}

class abstract_main
{

	public static void main(String[] args)
	{
		shape obj=new square();
		obj.setl(5);
		obj.setb(9); 
		obj.area();
	}
}


class square extends shape
{
	void area()
	{
		int area=l*l;
		System.out.println(area);
	}
}


class rectangle extends shape
{
	void area()
	{
		int area=l*b;
		System.out.println(area);

	}
}