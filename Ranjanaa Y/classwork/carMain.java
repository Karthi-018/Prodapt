import java.util.*;
class car
{
String model = "xyz";
private String EngNum = "123xyz";

static class engine
{
void displayDetails()
{
car c = new car();
System.out.println(c.model+" "+c.EngNum);
}
}
}

class carMain
{
public static void main(String args[])
{
car.engine ce = new car.engine();
ce.displayDetails();
}
}