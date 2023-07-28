package assignment;
import java.util.*;  //over riding
class Computer
{
public void components()
{
System.out.println("Monitor CPU Mice Keyboard - All separate components");
}
}

class Laptop extends Computer
{
public void components()
{
System.out.println("Monitor CPU Mice Keyboard all components integerated");
}
}

class SuperComputers extends Computer
{
public void components()
{
System.out.println("Very advanced processing capabilities");
}
public static void main(String args[])
{
Computer c;
c=new Computer();
c.components();
c=new Laptop();
c.components();
c=new SuperComputers();
c.components();
}
}
