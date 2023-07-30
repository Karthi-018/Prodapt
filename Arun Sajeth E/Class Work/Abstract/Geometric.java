abstract class Geometric
{
	int Length;
	int breadth;
	
	Geometric()
	{
	
	}
	public void setlen(int Length)
	{
		this.Length=Length;
	}
	public void setbre(int breadth)
	{
		this.breadth=breadth;
	}
	public int getlen()
	{
		return Length;
	}
	public int getbre()
	{
		return breadth;
	}
	abstract public void area(int Length,int breadth);
	
}