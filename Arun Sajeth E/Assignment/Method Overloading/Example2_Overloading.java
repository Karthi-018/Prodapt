class Example2_Overloading
{
	public void Volume(int Length)
	{
		System.out.println("Volume of cube:"+(Length*Length*Length));
	}
	public void Volume(int Length,int Height)
	{
		System.out.println("Volume of cyclinder:"+(3.14*Length*Height));
	}
	public void Volume(int Length,int Breadth,int Height)
	{
		System.out.println("Volume of Cuboid:"+(Length*Breadth*Height));
	}
	public static void main(String a[])
	{
		Example2_Overloading exp2=new Example2_Overloading();
		exp2.Volume(5);
		exp2.Volume(6,3);
		exp2.Volume(8,4,7);
	}
}