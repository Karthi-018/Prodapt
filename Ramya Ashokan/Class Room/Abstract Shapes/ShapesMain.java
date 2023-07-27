import java.util.*;
class ShapesMain
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the length");
float length=sc.nextFloat();
System.out.println("Enter the breadth");
float breadth=sc.nextFloat();
Shapes s=new Rectangle();
s.area(length,breadth);
Shapes s1=new Triangle();
s1.area(length,breadth);
Shapes s2=new Square();
s2.area(length,length);
}
}