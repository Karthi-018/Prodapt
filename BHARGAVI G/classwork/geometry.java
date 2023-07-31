interface Allshapes
{

void area(int l,int b);

}

class rectangle implements Allshapes
{

public void area(int l,int b)
{	
	System.out.println("The area of rectangle is:" +(l*b));
}
}
class square implements Allshapes
{

public void area(int a,int b)
{	
	System.out.println("The area of square is:" +(a*b));
}
}

class triangle implements Allshapes
{
public void area(int l,int b)
{	
	System.out.println("The area of triangle is:" +(l*b/2));
}
}

class Geometricalshapes
{
public static void main(String args[])
{
	Allshapes a=new rectangle();
	a.area(2,3);
	Allshapes b=new square();
	b.area(2,2);
	Allshapes c=new triangle();
	c.area(2,9);
}
}
