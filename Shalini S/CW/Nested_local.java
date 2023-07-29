import java.util.*;
class Nested_Class{
    String name="sha";
    int id=100;
    void n_method(){
        class Inner_Class{
            int id=101;
            void display(){
                System.out.println("Name:"+name);
                System.out.println("ID:"+id);
            }
        }
        Inner_Class obj=new Inner_Class();
        obj.display();
    }
}
class Nested_local{
    public static void main(String args[]){
        Nested_Class o=new Nested_Class();
        o.n_method();
    }
}