interface Shape {
    
    double area(int length,int breadth);  
}
class Triangle implements Shape{
    public double area(int length,int  breadth){
        return (0.5)*length*breadth;
    }
}
class Rectangle implements Shape{
    public double area(int length,int  breadth){
        return length*breadth;
    }
}
class Square implements Shape{
    public double area(int length,int breadth){
        return length*length;
    }
}
class ShapeInterface{
    public static void main(String[] args) {
    Triangle tr=new Triangle();
    System.out.println("Area of Triangle:"+tr.area(10,20));
    Square sq=new Square();
    System.out.println("Area of Square:"+sq.area(5, 30));
    Rectangle rc=new Rectangle();
    System.out.println("Area of Rectangle:"+rc.area(20, 45));

    }
}
