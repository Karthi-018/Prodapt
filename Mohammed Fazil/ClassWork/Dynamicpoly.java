class Dynamicpoly
{
String str = "Mohammed";
}
class Test extends Dynamicpoly
{
String str = "Fazil";
}
class Main
{
public static void main(String[] args)
{
Dynamicpoly d= new Test();
System.out.println(d.str);
}
}
