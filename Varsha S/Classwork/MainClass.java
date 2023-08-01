interface DemoInterface1
{
static void display() //to access this method, declare it as static
{
System.out.println("Hii");
}
}
interface DemoInterface2
{
default void display() /*by default, it is public abstract. For abstract class, we need to declare. So, to define we use default keyword. Here deafult is not an access sepcifier.*/
{
System.out.println("Hello");
}
}

class MainClass implements DemoInterface1, DemoInterface2
{
public void display()
{
System.out.println("World");
}
public static void main(String args[])
{
MainClass obj = new MainClass();
obj.display();

DemoInterface1.display();


}
}

