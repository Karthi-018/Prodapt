import java.util.*;

class OlShapes 
{
public void area(int side)
{
int area_of_square=side*side;
System.out.println("The area of square is" + area_of_square);
}
public void area(double length,double breadth)
{
double area_of_rectangle=length*breadth;
System.out.println("The area of Rectangle is" + area_of_rectangle);
}
public void area(int height,double  breadth)
{
double area_of_triangle=0.5*height*breadth;
System.out.println("The area of Triangle is" + area_of_triangle);
}
  public static void main(String[] args) 
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Side:");
int side=sc.nextInt();

System.out.println("Enter Length:");
double length=sc.nextDouble();

System.out.println("Enter Breadth:");
double breadth=sc.nextDouble();

System.out.println("Enter Height:");
int height=sc.nextInt();

OlShapes s=new OlShapes();
s.area(side);
s.area(length,breadth);
s.area(height,breadth);

}
        
}