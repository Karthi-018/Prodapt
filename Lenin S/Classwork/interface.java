
interface DemoInterface1
{
default void display()
{
System.out.println(" Di1");
}
}

interface DemoInterface2
{
default void display()
{		
System.out.println("Di2");
}
}

class InterfaceDemo implements DemoInterface1, DemoInterface2
{

    public void display()
{
        System.out.println("interfaced");
}

    public static void main(String[] args)
    
{
        InterfaceDemo interObj= new InterfaceDemo();

        interObj.display();
}


}