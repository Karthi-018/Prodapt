import java.util.*;
class Hotel{
    String starter;
    public void welcome(){
        System.out.println("Eat healthy stay healthy");
    }
    public void orders(String starter){
        System.out.println("Your order for starter is "+(starter));
    }
}
class Swiggy extends Hotel{
    String starter,main_course;
    public void orders(String starter){
        System.out.println("Your order for starter from swiggy is "+(starter));
    }
    public void swiggy_orders(String main_course){
        System.out.println("Your order for main course from swiggy is "+(main_course));
    }
}
class Food{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String mc=sc.next();
        Hotel obj=new Swiggy();
        obj.welcome();
        obj.orders(s);
        Swiggy ob=new Swiggy();
        ob.swiggy_orders(mc);
    }
}