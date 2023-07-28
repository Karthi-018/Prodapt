import java.util.*;
class Shapes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length:");
int length=sc.nextInt();
System.out.println("Enter the breadth:");
int breadth=sc.nextInt();
Shapes s=new Shapes();
s.Area(length,breadth);
s.Area(length);
}
public void Area(int l,int b)
{
System.out.println("The area of rectangle: "+(l*b));
}
public void Area(int l)
{
System.out.println("The area of Square: "+(l*l));
}

}