import java.util.*;
class Food_Menu{
    public void my_order(String kfc1,String kfc2){
        System.out.println("You ordered the combo of "+kfc1+" and "+kfc2+" from KFC");
    }
    public void my_order(String dominos1,String dominos2,String dominos3){
        System.out.println("You ordered the combo of "+dominos1+" ,"+dominos2+" and "+dominos3+" from Dominos");
    }
    public void my_order(String a2b){
        System.out.println("You ordered "+a2b+" from A2B");
    }
    public void my_order(){
        System.out.println("You prepared your own food");
    }
}
class Order{
    public static void main(String args[]){
        Food_Menu obj=new Food_Menu();
        obj.my_order("chicken wings","chicken burger");
        obj.my_order("meals");
        obj.my_order("pizza","mousse","coke");
        obj.my_order();
    }
}
        
    