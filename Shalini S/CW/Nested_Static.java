import java.util.*;
class Nested{
    int id=10;
    static String name="Riya";
    void display(){
        System.out.println("Hello"+name+" "+id);
    }
    static class Static{
        int id=11;
        Nested obj=new Nested();
        void show(){
            System.out.println("id:"+obj.id+" name:"+name);
        }
    }
}
class Nested_Static{
    public static void main(String args[]){
       Nested o=new Nested();
       Nested.Static ob=new Nested.Static();
       o.display();
       ob.show();
   }
}