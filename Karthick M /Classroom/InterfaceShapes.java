interface Shapes
{
 void squarearea(int l,int b);
 void rectanglearea(int l,int b);
 void trianglearea(int l,int b);
}

class Area implements Shapes
{
 public void squarearea(int l,int b)
 {
 int a=l*b;
 System.out.println("Area of square "+(a));
 }
 
 public void rectanglearea(int l,int b)
 {
 int a=l*b;
 System.out.println("Area of rectangle "+(a));
 }
    
 public void trianglearea(int l,int b)
 {
  double a=(0.5)*l*b;
  System.out.println("Area of triangle "+(a));
 }
}

class Interface
{
 public static void main(String args[]) 
 {
  Area ar=new Area();
  ar.squarearea(4,4);
  ar.rectanglearea(2,3);
  ar.trianglearea(4,6);
 }
}
