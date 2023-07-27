// method overloading 3

class Typecasting
{
public void convert(int a)
{
double d = a;
System.out.println("Integer value: "+a);
System.out.println("Int to decimal : "+d);
}
public void convert(double b)
{
int i = (int)b;
System.out.println("Decimal value: "+b);
System.out.println("decimal to int : "+i);
}
public void convert(String s)
{
int c = Integer.parseInt(s);
System.out.println("String value: "+s);
System.out.println("String to int : "+c);
}
}

class TypecastingMain
{
public static void main(String args[])
{
Typecasting tc = new Typecasting();
tc.convert(10);
tc.convert(10.1);
tc.convert("10");
}
}
