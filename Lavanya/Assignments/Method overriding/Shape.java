public class Shape {
    void draw(){
        System.out.println("Draw any shapes");
    }
    public static void main(String[] args) {
        Shape obj=new Circle();
        Shape obj1=new Shape();
        obj1.draw();
        obj.draw();
    }
}
class Circle  extends Shape{
    
    void draw(){
        super.draw();
        System.out.println("Draw circle");
    }
}
