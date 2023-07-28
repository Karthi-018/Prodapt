public class Vechile 
{
 public static void main(String[] args) {
 Vechile obj1=new Bike();
 Vechile obj2=new Car();
 obj1.run();
 obj2.run();
}

void run()
{
 System.out.println("fuel");
}
}

class Bike extends Vechile 
{
 void run()
 {
  super.run();
  System.out.println("petrol");
 }
}

class Car extends Vechile
{
 void run() 
 {
  System.out.println("diesel");
 }
}