import java.util.*;
interface InterfaceA{
    final int x=10;
    void show(String name);
}
interface InterfaceB extends InterfaceA {
    void display();

    void display1(long sal);
}
class Interface_Main implements InterfaceB{
    @Override
    public void show(String name){
        System.out.println("Hello "+name);
    }
    @Override
    public void display() {
        System.out.println("Welcome to Prodapt");
    }
    @Override
    public void display1(long sal){
        System.out.println("Your salary is "+sal);
    }
    public static void main(String args[]){
        Main obj=new Main();
        obj.show("vani");
        obj.display();
        obj.display1(10000);
    }
}
