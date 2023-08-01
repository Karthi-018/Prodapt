interface Demo1
{
    default public void fun()
    {
        System.out.println("Hi");
    }
}
class Demo
{
   public void fun()
    {
        System.out.println("Hello");
    }
}

public class IntefaceClass  extends Demo implements  Demo1{
    public static void main(String[] args) {
        IntefaceClass i = new IntefaceClass();
        i.fun();


    }


}
