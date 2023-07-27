class methodoverloading2 {
    double area(double l, double b)
    {
        return (l*b);
    }
    double area(double s)
    {
        return (s*s);
    }
 
    public static void main(String[] args) {
        methodoverloading2 m = new methodoverloading2();
        System.out.println("Area of Rectangle: " +m.area(5.55, 6)); 
        System.out.println("Area of Square: " +m.area(3)); 
    }
}
