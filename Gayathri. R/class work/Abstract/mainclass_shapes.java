import java.util.*;
class mainclass_shapes
{
public static void main(String a[])
{
 Scanner s=new Scanner(System.in);
 float l=s.nextFloat();
 float b=s.nextFloat();
 
String name=s.next();
 if(name.equals("triangle"))
{
 Shapes o=new triangle();
o.area(l,b);
}
else if(name.equals("square"))
{
Shapes o=new square();
o.area(l,b);
}
else
{
Shapes o=new rectangle();
o.area(l,b);
}

}
}