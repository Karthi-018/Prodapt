class Chips
{
 void lays(int quantity)
 {
  System.out.println("Quantity is:"+" "+quantity);
 }

 void lays(String flavour,int quantity)
 {
  System.out.println("flavour is:"+" "+flavour+" , "+"Quantity is:"+" "+quantity);
 }
}


class Main
{
 public static void main(String a[])
 {
  Chips c=new Chips();
  c.lays(50);
  c.lays("cheese",100);
 }
}