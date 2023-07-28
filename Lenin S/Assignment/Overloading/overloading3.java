class Classroom
{
 void bench(int board)
 {
  System.out.println(" is:board"+" "+board);
 }

 void bench(String chalk,int duster)
 {
  System.out.println("chalk for:"+" "+chalk+" , "+"duster reps:"+" "+duster);
 }
}


class Main
{
 public static void main(String a[])
 {
  Classroom c=new Classroom();
  c.bench(20);
  c.bench("staff",15);
 }
}