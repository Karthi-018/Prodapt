import java.util.*;
abstract class Shapes{
    int length,breadth;
    abstract void square(int length,int breadth);
    abstract void rectangle(int length,int breadth);
    abstract void triangle(int length,int breadth);
}
class Area extends Shapes{
    
    void square(int length,int breadth){
        int a=length*breadth;
        System.out.println("Area of square "+(a));
    }
    void rectangle(int length,int breadth){
        int a=length*breadth*1;
        System.out.println("Area of rectangle "+(a));
    }
    void triangle(int length,int breadth){
        double a=(0.5)*length*breadth;
        System.out.println("Area of triangle "+(a));
    }
}
class Abstraction{
    public static void main(String args[]){
        Area ob=new Area();
        ob.square(5,5);
        ob.rectangle(6,2);
        ob.triangle(4,3);
    }
}