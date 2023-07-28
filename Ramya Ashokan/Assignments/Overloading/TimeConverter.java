import java.util.*;
class TimeConverter
{
public void convert(int hour)
{
int secs=hour*3600;
System.out.println(hour +" hour is equal to "+secs+" seconds");
}
public void convert( int hour,int min)
{
System.out.println(min);
 int secs=(hour*3600)+(min*60);
System.out.println(hour+" hours and "+min+" minutes "+ "is equal to "+secs+" seconds");
}
public void convert(int hour,int min,int sec)
{
int secs=(hour*3600)+(min*60)+sec;
System.out.println(hour+" hours "+min+" minutes and "+sec+ " seconds is equal to " +secs+ " seconds");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter hour:");
int hour=sc.nextInt();
System.out.println("Enter minutes:");
int min=sc.nextInt();
System.out.println("Enter seconds:");
int sec=sc.nextInt();
TimeConverter t=new TimeConverter();
t.convert(hour);
t.convert(hour,min);
t.convert(hour,min,sec);

}

}