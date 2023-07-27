public class AbstractDemo {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.height = 10;
        triangle.breath = 30;
        System.out.println("Area of triangle : "+triangle.area());

        Shape square = new Square();
        square.length = 10;
        System.out.println("Area of square : "+square.area());

        Shape rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.breath = 5;
        System.out.println("Area of Rectangle : "+rectangle.area());

    }
}

abstract class Shape{
    int length;
    int breath;
    int height;
    abstract double area();
}

class Triangle extends Shape{
    @Override
    double area() {
        return (0.5)*breath*height;
    }
}

class Square extends Shape{
    @Override
    double area() {
        return length*length;
    }
}
class Rectangle extends Shape{
    @Override
    double area() {
        return length*breath;
    }
}