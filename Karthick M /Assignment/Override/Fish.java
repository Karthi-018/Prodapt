public class Fish 
{
 public static void main(String[] args) {
 Fish obj1=new Shark();
 Fish obj2=new Nemo();
 obj1.swim();
 obj2.swim();
}

void swim()
{
 System.out.println("water");
}
}

class Nemo extends Fish 
{
 void swim()
 {
  super.swim();
  System.out.println("sea water");
 }
}

class Shark extends Fish
{
 void swim() 
 {
  System.out.println("Fresh water");
 }
}