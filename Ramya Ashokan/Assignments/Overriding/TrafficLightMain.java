import java.util.*;
class TrafficLightMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String color=sc.next();
int sec=sc.nextInt();
TrafficLight tl1=new RedLight();
tl1.lightGlow();
TrafficLight tl2=new YellowLight();
tl2.lightGlow();
TrafficLight tl3=new GreenLight();
tl3.lightGlow();;

}
}