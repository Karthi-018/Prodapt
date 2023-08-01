
interface Shapes {
	
	int l=10;
	int b=5;
	void area(int a,int b);
	
}

class Rectangle implements Shapes
{
	
	
	public void area(int a,int b)
	{
		
		System.out.println("area =" +(l*b));
	}
	
	
}


public class ShapeMain {
	
	public static void main (String[] args) {
	
		
		Rectangle rectangle = new Rectangle();		
		
		System.out.println("Rectangle present state :");

		rectangle.area(Shapes.l,Shapes.b);
		
		
		
	}
}
