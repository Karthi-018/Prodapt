import java.util.*;
interface Shape
{
int i=10;                                            // public final to attributes by default
void area(int length,int breadth);                  //interface by default assigns public and abstract to methods
}


interface Length
{
int length(int n);
}


interface Breadth
{
int breadth(int n);
}


class Triangle implements Shape
{
static int a=10,b=10;
public void area(int base,int height)
{
System.out.println("Area of triangle is : "+ (float)1/2*base*height);
}
}


class Rectangle extends Triangle implements Length,Breadth,Shape 
{
public int implementExtend()
{
return Triangle.a*Triangle.b;
}
public void area(int length,int breadth)
{                                                                           //Multiple Inheritance using interface is done here .... one child many parent
System.out.println("Rectangle area is : "+ length*breadth);
}
public int length(int l)
{
return l;
}
public int breadth(int b)
{
return b;
}
}


//class Square 

class Main
{
public static void main(String args[])
{
Triangle t=new Triangle();
t.area(10,20);
Rectangle r=new Rectangle();
r.area(5,5);
System.out.println("Area of rectangle using extends and implements :"+ r.implementExtend());
System.out.println("Area of rectangle is : "+ r.length(5) * r.breadth(5));
}
}