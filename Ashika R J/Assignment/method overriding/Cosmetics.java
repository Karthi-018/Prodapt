class Lipstick extends Cosmetics
{
 void Shades()
 {
  System.out.println("Shade_S");
 }
}

class Lipliner extends Cosmetics
{
 void Shades()
 {
  System.out.println("Shade_A");
 } 
}
 
public class Cosmetics
{ 
 void Shades()
 {
  System.out.println("Shades Differs");
 } 

 public static void main(String a[])
 {
  Cosmetics c1=new Lipstick();
  c1.Shades();
  Cosmetics c2=new Lipliner();
  c2.Shades();
 }
}