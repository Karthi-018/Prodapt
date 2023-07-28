class Car
{
String model="abc";
private String eno="a12";

class Engine
{
 void cardetail()
 {
 System.out.println(model);
 System.out.println(eno);
 }
}

public static void main(String a[])
{
Car c=new Car();
Car.Engine eng=c.new Engine();
eng.cardetail();
}
}