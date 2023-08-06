class A
{
    public void show1()
    {
        System.out.println("A Show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("B show");
    }

}
public class Casting {
    public static void main(String[] args) {
        //upcasting
        A obj = new B();
        obj.show1();
        //downcasting
        B obj1=(B)obj;
        obj1.show2();
    }

}
