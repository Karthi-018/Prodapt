
 abstract class GeometricShape{
    int length;
    int breadth;
     abstract double area();

}
class Triangle extends GeometricShape{
    double area()
    {
        return (0.5)*length*breadth;
    }
 }
class Rectangle extends GeometricShape{
    double area()
    {
      return length*breadth;
    }
}
class Square extends GeometricShape{
  double area()
  {
    return length*length;
  }
}
public  class AbstractDemo{
  public static  void main(String[] args){
    Triangle t=new Triangle();
    t.length=100;
    t.breadth=50;
    System.out.println("Area of Triangle:"+t.area());
    GeometricShape sq=new Square();
    sq.length=25;
    System.out.println("Area of Square:"+sq.area());
    Rectangle rect=new Rectangle();
    rect.length=18;
    rect.breadth=6;
    System.out.println("Area of Rectangle:"+rect.area()); 
  }
}
