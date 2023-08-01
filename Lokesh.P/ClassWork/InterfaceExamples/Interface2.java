interface A
{
default public void fun()
{
    System.out.println("Hi");
}
}
interface B
{
    default public void fun()
    {
        System.out.println("Hello");
    }
}
public class Interface2 implements A,B
{
    @Override
    public void fun() {
        System.out.println("welcome ");
    }
    public static void main(String[] args) {
        Interface2 i = new Interface2();
        i.fun();
    }



}
