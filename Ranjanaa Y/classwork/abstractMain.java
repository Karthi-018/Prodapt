abstract class shape
{
int l,b;
abstract int rectangle(int l,int b);
abstract int square(int l);
abstract double triangle(int l,int b);
}

class area extends shape
{
int rectangle(int l,int b)
{
return l*b;
}
int square(int l)
{
return l*l;
}
double triangle(int l,int b)
{
double a = 0.5*l*b;
return a;
}
}

class abstractMain
{
public static void main(String args[])
{
area a = new area();
System.out.println(a.rectangle(3,4));
System.out.println(a.square(3));
System.out.println(a.triangle(3,4));
}
}