interface Shapes
{
void area();
}

class Square implements Shapes
{
int l;
Square(int l)
{
this.l=l;
}
public void area()
{
System.out.println("Square area: "+(l*l));
}
}

class Rectangle implements Shapes
{
int l,b;
Rectangle(int l,int b)
{
this.l=l;
this.b=b;
}
public void area()
{
System.out.println("Rectangle area: "+(l*b));
}
}

class Triangle implements Shapes
{
int l,b;
Triangle(int l,int b)
{
this.l=l;
this.b=b;
}
public void area()
{
System.out.println("Triangle area: "+(0.5*l*b));
}
}
 
public class MainInterface
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