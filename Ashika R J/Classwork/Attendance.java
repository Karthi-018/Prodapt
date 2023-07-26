class Attendance
{ 
 void markAttend() 
 {
  System.out.println("mass Bunk");
 }
 void markAttend(String...S)
 {
  System.out.println(S.length +"Student Present");
   for(String Name : S)
   {
    System.out.println(Name);
   }
 }
public static void main(String a[])
{
  Attendance at= new Attendance();
  at.markAttend();
  at.markAttend("Ash", "Lav", "May");
 }
}
