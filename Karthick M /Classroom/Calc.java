class Calc
{
 public void add(int...n)
 {
  int sum = 0;
  for(int i : n)
  {
   sum=sum+i;
  }
  System.out.println(sum);
 }
}
 
   
class Main 
{
 public static void main(String a[])
 {
  Calc c = new Calc();
  c.add(10,20);
  c.add(10,20,30);
 }
}
