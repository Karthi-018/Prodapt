package Employee.src;

interface DemoInterface1
{
    default void display()
    {
        System.out.println("In DI1");
    }
}
interface DemoInterface2
{
    default void display()
    {
        System.out.println("In DI2");
    }
}
class InterfaceDemo implements DemoInterface1, DemoInterface2
{
    public void display()
    {
        System.out.println("over");
    }

    public static void main(String[] args)
    {
        InterfaceDemo interObj= new InterfaceDemo();
        interObj.display();
    }


}
