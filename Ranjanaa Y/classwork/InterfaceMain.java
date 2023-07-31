interface shape
{
// attributes will act as final and methods will be public static
// dont define value here, as the final values cannot be modified.

int square(int l);
int rectangle(int l,int b);
double triangle(double l,double b);
}

class Area implements shape
{
public int square(int l)
{
return l*l;
}
public int rectangle(int l,int b)
{
return l*b;
}
public double triangle(double x,double y)
{
return 0.5*x*y;
}
}

class InterfaceMain
{
public static void main(String args[])
{
Area a = new Area();
System.out.println("square : "+a.square(3));
System.out.println("Rectangle : "+a.rectangle(3,6));
System.out.println("Triangle : "+a.triangle(3,8));
}
}