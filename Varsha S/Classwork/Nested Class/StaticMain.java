import java.util.*;
class Car1
{
public void model()
{
String model = "Audi";
System.out.println("Name : " + model);
}

static class Engine1
{
public void details()
{
System.out.println("Number : 123abc");
}
}

}

class StaticMain
{
public static void main(String args[])
{
Car1.Engine1 e = new Car1.Engine1();  //child object
Car1 c = new Car1(); // parent object
c.model();
e.details();
}
}

