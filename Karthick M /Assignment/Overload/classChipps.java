class Chipps
{
 void lays(int quantity,String flavour)
 {
  System.out.println("Quantity is:"+" "+quantity+","+"flavour is:"+" "+flavour);
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
  Chipps c=new Chipps();
  c.lays(50,"Spicy");
  c.lays("cheese",100);
 }
}