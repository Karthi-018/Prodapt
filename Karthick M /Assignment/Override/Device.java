public class Device 
{
 public static void main(String[] args) {
 Device obj1=new Phone();
 Device obj2=new Lap();
 obj1.charge();
 obj2.charge();
}

void charge()
{
 System.out.println("Charging");
}
}

class Phone extends Device 
{
 void charge()
 {
  super.charge();
  System.out.println("Phone Charging");
 }
}

class Lap extends Device
{
 void charge() 
 {
  System.out.println("Lap Charging");
 }
}