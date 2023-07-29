import java.util.*;
class Nested_Class{
    String name="sha";
    int id=100;
    class Inner_Class{
        int id=101;
        void display(){
            System.out.println("Name:"+name);
            System.out.println("ID:"+id);
        }
    }
}
class Nested_Main{
    public static void main(String args[]){
        Nested_Class o=new Nested_Class();
        Nested_Class.Inner_Class ob=o.new Inner_Class();
        ob.display();
    }
}