import java.util.*;
class Shapes_area{
    public void area(int side){
        int x=side*side;
        System.out.println("The area of Square is:"+(x));
    }
    public void area(int length,int breadth){
        int x=length*breadth;
        System.out.println("The area of Rectangle is:"+(x));
    }
    public void area(double base,double height){
        double x=(0.5)*base*height;
        System.out.println("The area of triangle is:"+(x));
    }
    public void area(int base1,int base2,int height){
        int x=((base1+base2)/2)*height;
        System.out.println("The area of trapezium is:"+(x));
    }
}
class Overloading{
    public static void main(String args[]){
        Shapes_area obj=new Shapes_area();
        obj.area(7);
        obj.area(4,2,1);
        obj.area(8.0,6.0);
        obj.area(9,10);
    }
}
        