abstract class Shapes
{
	int length;
	int breadth;

	Shapes()
	{
		
	}
	public void getLength(int length)
	{
		this.length = length;
	}
	public int setLength()
	{
		return length;
	}
	public void getBreadth(int breadth)
	{
		this.breadth = breadth;
	}
	public int setBreadth()
	{
		return breadth;
	}
	
	abstract public void Area(int length,int breadth);
	//abstract int SquareArear(int length);
		
}
	