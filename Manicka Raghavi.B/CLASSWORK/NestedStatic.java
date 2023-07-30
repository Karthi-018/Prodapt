class OuterClass 
{ 

String name="Outer Class var-Instance variable";

static String staticvar="Outer Class- Static Variable"; 

void outer_method() 
{ 
System.out.println("Im the outer method of Outer Class"); 

//TO ACCESS INNER CLASS METHODS
 
//(new StaticInner()).display();
//StaticInner.dis();

} 

static void static_outer_method() 
{ 
System.out.println("Im the outer method of Outer Class"); 

//TO ACCESS INNER CLASS METHODS

//(new StaticInner()).display();
//StaticInner.dis();

}

static class StaticInner
{ 
   //Inside static and instance method of static class we can directly access static methods and variables of outer class,to access instance var and method     we need to create object

   void display() 
   {
    System.out.println("PRINT stmt from instance method of static inner class: "+(new OuterClass()).name+" "+staticvar); 
    
    static_outer_method();
    (new OuterClass()).outer_method();     
 
    OuterClass.static_outer_method(); 
    (new OuterClass()).outer_method();
       
   }
   
   static void dis() 
   {
    System.out.println("PRINT stmt from static method of static inner class: "+(new OuterClass()).name+" "+staticvar); 

    static_outer_method();
    (new OuterClass()).outer_method(); 

   }
}

}

class NestedStatic 
{
 public static void main(String[]args) 
 { 
  OuterClass.StaticInner object=new OuterClass.StaticInner();
  object.display();
  OuterClass.StaticInner.dis();
 }
}