class Car_Local
{
String car_model = "hyundai";
String car_number = "123hyu";

public void myCar()
{
class Engine_Local
{

void car_details()
{
System.out.println("Model - " + car_model);
System.out.println("Number - " + car_number);
}
}

Engine_Local e = new Engine_Local();
e.car_details();
}
}

class LocalMain
{
public static void main(String args[])
{
Car_Local c = new Car_Local();
c.myCar();
}
}

