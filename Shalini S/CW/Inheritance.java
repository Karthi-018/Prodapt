import java.util.*;
class Parent{
    String s;
    void display(String s1){
        System.out.println("Hello "+s1);
    }
}
class Child1 extends Parent{
    void show(){
        System.out.println("From child1-Welcome to inheritance");
    }
}
class Child2 extends Child1{
    void show_this(){
        System.out.println("From child2-Welcome to inheritance");
    }
}
class Inheritance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Child1 obj=new Child1();
        obj.display(s);
        obj.show();
    }
}
