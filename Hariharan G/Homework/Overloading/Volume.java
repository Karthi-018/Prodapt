package assignment;
import java.util.*;
//volume programmmm
class Volume
{
final double pi=3.14;
public void vol()
{
System.out.println("Volume program");
}
public void vol(int radius,int height)
{
System.out.println("Cylinder volume "+(pi*radius*radius*height));
}
public void vol(int radius)
{
System.out.println("Sphere volume "+(pi*radius*radius*radius));
}
public void vol(int length,int breadth,int height)
{
System.out.println("Cuboid volume "+(length*breadth*height));
}
public static void main(String args[])
{
Volume v=new Volume();
v.vol();
v.vol(5,10);
v.vol(8);
v.vol(5,8,10);
}
}
