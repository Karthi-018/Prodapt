class Car_Instance
{
String car_model = "hyundai";
String car_number = "123hyu";

class Engine
{
void car_details()
{
System.out.println("Model - " + car_model);
System.out.println("Number - " + car_number);
}
}

public static void main(String args[])
{
Car_Instance c = new Car_Instance();
Car_Instance.Engine e = c.new Engine();
e.car_details();
}

}