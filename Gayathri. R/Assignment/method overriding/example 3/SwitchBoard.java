import java.util.*;
class SwitchBoard
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter Status of electric devices");
String status=s.next();
System.out.println("enter fan mode");
int m=s.nextInt();
fan o=new fan();
o.Switch(status);
o.mode(m);
}
}