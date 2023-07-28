package hello;
import java.util.*;
class Demo
{
final void display()
{
System.out.println("final method");
}
}

class Test extends Demo
{
void display(String name)                                        //method declared final cannot be over ridden.
{                                                
System.out.println("test method");
}
}

class FinalMetod_Main
{
public static void main(String args[])
{
Test t=new Test();
t.display("hari");
}
}
                                                                   //output: test method