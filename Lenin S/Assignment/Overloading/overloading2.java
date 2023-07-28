class Minstrument
{
 void guitar(int freds)
 {
  System.out.println(" is:freds"+" "+freds);
 }

 void guitar(String tuner,int strummer)
 {
  System.out.println("tuner for:"+" "+tuner+" , "+"strummer reps:"+" "+strummer);
 }
}


class Main
{
 public static void main(String a[])
 {
  Minstrument c=new Minstrument();
  c.guitar(20);
  c.guitar("guitarbag",15);
 }
}