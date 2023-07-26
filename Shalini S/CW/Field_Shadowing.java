import java.util.*;
class Demo_FieldShadowing{
    String s="parent";
    public void show(){
        System.out.println("Executing parent method");
    }
}
class Child extends Demo_FieldShadowing{
    private String s="child";
    public void show(){
        System.out.println("Executing child method");
    }
}
class Field_Shadowing{
    public static void main(String args[]){
        Demo_FieldShadowing obj=new Child();
        obj.show();
        System.out.println(obj.s);
    }
}