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

class DiMainClass implements DemoInterface1,DemoInterface2
{
public void display()
{
System.out.println("World");
}

public static void main(String args[])
{
DiMainClass obj=new DiMainClass();
obj.display();
}
}
 