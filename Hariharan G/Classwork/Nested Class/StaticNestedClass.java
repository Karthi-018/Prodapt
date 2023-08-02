import java.util.*;
class Car
{
String car="Volkswagon Virtus";

static class Engine
{
String engine="Petrol Engine";
Car c=new Car();
public void engine()
{
System.out.println("Petrol Engine");
}
}
}

class StaticNestedClass
{
public static void main(String args[])
{
Car.Engine e = new Car.Engine();                            // e independent of c
Car c=new Car();
System.out.println(c.car);
e.engine();
}
}