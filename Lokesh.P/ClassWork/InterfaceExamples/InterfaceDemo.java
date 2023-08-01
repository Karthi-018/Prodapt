interface Shapes
{
    void area();
}

class Square implements Shapes
{
    int l;
    Square(int l)
    {
        this.l=l;
    }
    public void area()
    {
        System.out.println("Area of a Square: "+(l*l));
    }
}

class Rectangle implements Shapes
{
    int l,b;
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        System.out.println("Area of a Rectangle: "+(l*b));
    }
}

class Triangle implements Shapes
{
    int l,b;
    Triangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        System.out.println("Area of a Triangle: "+(0.5*l*b));
    }
}

public class InterfaceDemo
{
    public static void main(String args[])
    {
        Shapes s = new Square(4);
        s.area();

        s = new Rectangle(7,8);
        s.area();

        s = new Triangle(4,6);
        s.area();
    }
}