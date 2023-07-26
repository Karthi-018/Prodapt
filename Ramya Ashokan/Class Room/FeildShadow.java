class demo
{
     public  void m1(){
    System.out.println("Demo");
}
String s="demo";
}
class test extends demo{
     public  void m1(){
     System.out.println("test");
}
String s="test";}
public class FeildShadow
{
	public static void main(String[] args) {
	     demo d=new test();
	    d.m1();
System.out.println(d.s);
	
	}
}