// method overloading 2

class Shape
{
public void perimeter(int a)
{
System.out.println("The perimeter of Square : "+(4*a));
}
public void perimeter(int x,int y)
{
System.out.println("The perimeter of Rectangle : "+(2*(x+y)));
}
public void perimeter(int n1,int n2,int n3)
{
System.out.println("The perimeter of Triangle : "+(n1+n2+n3));
}
public void perimeter(int p,int q,int r,int s)
{
System.out.println("The perimeter of Trapezium : "+(p+q+r+s));
}
}
class ShapeMain
{
public static void main(String args[])
{
Shape p = new Shape();
p.perimeter(2);
p.perimeter(3,4);
p.perimeter(6,3,3);
p.perimeter(6,4,5,7);
}
}