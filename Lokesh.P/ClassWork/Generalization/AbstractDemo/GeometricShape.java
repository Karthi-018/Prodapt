import java.util.Scanner;

public class GeometricShape {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int length=sc.nextInt();
        int width=sc.nextInt();
        Shape t =new Rectangle();
        t.area("rectangle",length,width);
        Shape a=new Triangle();
        a.area("triangle",length,width);
        Shape s=new Square();
        s.area("square",length,width);

    }

}
