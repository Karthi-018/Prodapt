import java.util.*;
class Demo_Parent{
    String s="parent";
    public void show(){
        System.out.println("Executing parent method");
    }
}
class Child extends Demo_Parent{
    String s="child";
    public void show(){
        System.out.println("Executing child method");
    }
}
class Overriding{
    public static void main(String args[]){
        Demo_Parent obj=new Child();
        obj.show();
        System.out.println(obj.s);
    }
}