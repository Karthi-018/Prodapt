import java.util.*;
class main_shape
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
float l=s.nextFloat();
float b=s.nextFloat();
shapes r=new rectangle();
r.area(l,b);
shapes t=new triangle();
t.area(l,b);
shapes sq=new square();
sq.area(l,b);
}
}
