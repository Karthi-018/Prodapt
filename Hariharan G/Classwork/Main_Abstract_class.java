abstract class Shape
{
int length;
int breadth;
abstract void area();
}

class Triangle extends Shape
{
Triangle(int base,int height)
{
this.length=base;
this.breadth=height;
}
void area()
{
System.out.println("Area of triangle is: "+(((double)1/2)*length*breadth));
}
}

class Rectangle extends Shape
{
Rectangle(int length,int breadth)
{
this.length=length;
this.breadth=breadth;
}
void area()
{
System.out.println("Area of rectangle is : "+(length*breadth));
}
}

class Main_Abstract_class
{
public static void main(String args[])
{
//Shape s=new Shape();
Shape s=new Triangle(10,20);
s.area();
s=new Rectangle(10,20);
s.area();

}
}