interface Calc{
    default void add(int n1,int n2){
        System.out.println("Sum is:"+(n1+n2));
    }
    static void sub(int n1,int n2){
        System.out.println("Difference is:"+(n1-n2));
    }
    private static void mul(int n1,int n2){
        System.out.println("Product is:"+(n1*n2));
    }
    default void div(int n1,int n2){
        System.out.println("Divided value is:"+(n1/n2));
        mul(2,3);
    }
}


public class Interface_Calculator implements Calc{
    public static void main(String args[]){
        Interface_Calculator obj=new Interface_Calculator();
        obj.add(10,5);
        obj.div(10,2);
    }
}
