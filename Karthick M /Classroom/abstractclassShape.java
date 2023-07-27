abstract class Shape
{
 int l= 5;
 int b= 6;
 abstract void area();
}

class Square extends Shape{
void area()
{
System.out.println(l*l);
}
}

class Rectangle extends Shape{
void area()
{
System.out.println(l*b);
}
}

class Triangle extends Shape{
void area()
{
System.out.println(0.5*(l*b));
}
}

class Main
{
public static void main(String args[])
{
Shape s=new Square();
s.area();
}
}

