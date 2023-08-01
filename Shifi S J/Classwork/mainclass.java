interface DemoInterface1
{
default void display()
{
System.out.println("Hi");
}

}

interface DemoInterface2
{
default void display()
{
System.out.println("Hello");
}
}

class mainclass implements DemoInterface1,DemoInterface2
{
public void display()
{
System.out.println("WORLD");

}
public static void main (String[] args)
{
mainclass obj=new mainclass();
obj.display();
}
}
