class Car

{

String ownername="JohnWick";

private String rcno="a12";

 
class Engine

{

void cardetails()

{

System.out.println(ownername);
System.out.println(rcno);

}
}

 
public static void main(String a[])

{

Car c=  new Car();
Car.Engine eng = c.new Engine();
eng.cardetails();

}
}