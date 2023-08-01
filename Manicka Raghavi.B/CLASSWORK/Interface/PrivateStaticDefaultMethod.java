interface Java 
{
 
public void method1(); 

default void method2() 
{
System.out.println("Method 2"); 
method5();
}

static void method3()
{
System.out.println("Method 3"); 
method4(); 

} 

private static void method4() 
{
System.out.println("Method 4");
} 

private void method5() 
{ 
System.out.print("Method 5");
}

} 

class PrivateStaticDefaultMethod implements Java 
{ 

public void method1() 
{ 
System.out.println("Method 1");
} 

public static void main(String args[]) 
{
  PrivateStaticDefaultMethod object=new PrivateStaticDefaultMethod();
  object.method1(); 

  object.method2();
  Java.method3();
 
  
}
}