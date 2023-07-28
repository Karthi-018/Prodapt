class Chip
{
 void lays(int quantity)
 {
  System.out.println("Quantity is:"+" "+quantity);
 }

 void lays(float price)
 {
  System.out.println("price is:"+" "+price);
 }
}


class Main
{
 public static void main(String a[])
 {
  Chip c=new Chip();
  c.lays(50);
  c.lays(20.59f);
 }
}