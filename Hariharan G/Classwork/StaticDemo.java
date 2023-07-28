public class StaticDemo
{
static String staticStr="static varible";
String str="Instance variable";
static void display()
{
System.out.println("static method "+staticStr);
}




public static void main(String args[])
{
StaticDemo sd=new StaticDemo();                             //main block
sd.staticStr="ABC";
sd.display();
System.out.println(sd.staticStr);
System.out.println(StaticDemo.staticStr);
}



static
{
StaticDemo sd=new StaticDemo();
staticStr="Initialisation in static block";
System.out.println(staticStr+sd.str);                        //static block

sd.staticStr="abc";
System.out.println(sd.staticStr);
}


}