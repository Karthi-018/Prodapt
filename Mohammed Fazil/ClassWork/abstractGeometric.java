abstract class Geometric
{
int l= 10;
int b= 20;
abstract void area();
}

 

class Square extends Geometric{
void area()
{
System.out.println(l*l);
}
}

 

class Rectangle extends Geometric{
void area()
{
System.out.println(l*b);
}
}

 

class Triangle extends Geometric{
void area()
{
System.out.println(0.5*(l*b));
}
}

 

class Main
{
public static void main(String args[])
{
Geometric s=new Rectangle();
s.area();
}
}
