//package assignment;
import java.util.*;
class Vehicle
{
String tyre="MRF";
String engine="VOLKSWAGON";
String steering="POWER STEERING";
public void display()
{
System.out.println("Basics");
}
}

class Car extends Vehicle
{


String ac="AIR CONDITIONING";

public void display()
{
Vehicle v = new Car();
Car obj=new Car();
System.out.println("A car has "+v.tyre+" tyres and "+v.engine+" engine with "+v.steering+" along with "+obj.ac+" features");
}
public static void main(String args[])
{
Vehicle obj=new Car();
obj.display();
Vehicle v1=new Vehicle();
v1.display();

}
}