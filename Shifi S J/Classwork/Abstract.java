abstract class Shapes
{
int l;
int b;
abstract void area();
}

class Square extends Shapes
{
Square(int l)
{
this.l=l;
}
void area()
{
System.out.println("Square area: "+(l*l));
}
}

class Rectangle extends Shapes
{
Rectangle(int l,int b)
{
this.l=l;
this.b=b;
}
void area()
{
System.out.println("Rectangle area: "+(l*b));
}
}

class Triangle extends Shapes
{
Triangle(int l,int b)
{
this.l=l;
this.b=b;
}
void area()
{
System.out.println("Triangle area: "+(0.5*l*b));
}
}
 
public class Abstract
{
public static void main(String args[])
{
Shapes ob = new Square(2);
ob.area();

ob = new Rectangle(3,5);
ob.area();

ob = new Triangle(2,8);
ob.area();
}
}



