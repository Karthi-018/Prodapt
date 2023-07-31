interface Shapes{
    void square_area(int length,int breadth);
    void rectangle_area(int length,int breadth);
    void triangle_area(int length,int breadth);
}
class Area implements Shapes{

    public void square_area(int length,int breadth){
        int a=length*breadth;
        System.out.println("Area of square "+(a));
    }
    public void rectangle_area(int length,int breadth){
        int a=length*breadth*1;
        System.out.println("Area of rectangle "+(a));
    }
    public void triangle_area(int length,int breadth){
        double a=(0.5)*length*breadth;
        System.out.println("Area of triangle "+(a));
    }
}
class Interface{
    public static void main(String args[]){
        Area ob=new Area();
        ob.square_area(4,4);
        ob.rectangle_area(2,3);
        ob.triangle_area(4,6);
    }
}