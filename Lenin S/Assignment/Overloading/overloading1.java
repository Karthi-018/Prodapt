class Gym
{
 void biceps(int pushups)
 {
  System.out.println(" is:pushups"+" "+pushups);
 }

 void biceps(String bentrod,int hammercurls)
 {
  System.out.println("bentrod for:"+" "+bentrod+" , "+"hammercurls reps:"+" "+hammercurls);
 }
}


class Main
{
 public static void main(String a[])
 {
  Gym c=new Gym();
  c.biceps(20);
  c.biceps("frontraise",15);
 }
}