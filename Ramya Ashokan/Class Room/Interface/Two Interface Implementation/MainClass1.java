class MainClass1 implements DemoInterface,DemoInterface2
{
//@Override
public void display()
{
System.out.println("child class");
}
public static void main(String args[])
{
MainClass1 m=new MainClass1();
m.display();
}}