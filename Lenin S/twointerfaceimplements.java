interface DemoInterface1

{

default void display()

{
System.out.println("HI");
}
}

interface DemoInterface2


{
default void display()
{


System.out.println("HELLO");
}
}

class mainclass implements DemoInterface1, DemoInterface2

{
public void display()

{
System.out.println("WORLD");
}
public static void main(String a[])

{

mainclass obj = new mainclass();

obj.display();
}
}

