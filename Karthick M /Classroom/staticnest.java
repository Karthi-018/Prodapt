class Car
{
static String eno="a12";

static class Engine
{
 void cardetail()
 {
 System.out.println(eno);
 }
}

public static void main(String a[])
{
Car.Engine eng=new Car.Engine();
eng.cardetail();
}
}
