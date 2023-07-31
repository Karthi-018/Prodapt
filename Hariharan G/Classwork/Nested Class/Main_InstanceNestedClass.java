import java.util.*;
// nested class 
class Car
{
final static String company="Volkswagon\n";
final static String fueltype="Petrol\n";
final static String wheels="Alloy wheels\n";
final static String chasis="Titanium frame chasis\n";
final static String lights="DRL with LED lamps\n";

public void car()
{
System.out.println("Class Car .... Car is the outer class\n");
}


class Engine 
{
String engine="Hybrid Engine";
public void engine()
{
System.out.println("Class Engine... Engine is the inner class of class Car!\n");
}
}

}


class Main_InstanceNestedClass
{
public static void main(String args[])
{
Car c=new Car();                                                           // class Car object
System.out.println(Car.company + Car.fueltype + Car.wheels + Car.chasis + Car.lights);   // static attributes can be accessed with class names

c.car();          // accessing car method


Car.Engine e= c.new Engine();                     // Engine class is completely dependent on class Car
                                                  // Object of Engine class can be created only using the Car class object 'c'

System.out.println(e.engine);
e.engine();
 




}
}