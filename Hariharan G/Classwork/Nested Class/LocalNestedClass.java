import java.util.*;
class Door
{
String door="Hello!";
public void closeDoor()
{
class Lock
{
String a="please close the door";
public void lock()
{
System.out.println(door+" "+a);
}
}
System.out.println("HI");
Lock l=new Lock();
l.lock();
}
}

class LocalNestedClass
{
public static void main(String args[])
{

Door d=new Door();
d.closeDoor();

}
}