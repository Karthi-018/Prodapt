public class Static_Demo 
{ 

static String str="Static Variable";
String instanceVar="Instance Variable";

public static void main(String[]args) 
{
 
System.out.println("static variable directly accessed by main method: "+str+"\n");
display(); //static methods can directly call static method as well as static attributes

Static_Demo obj=new Static_Demo();
System.out.print("Object creation for accessing the non static attribute in static method"+" "+obj.instanceVar+"\n");

obj.str="ABC";  
System.out.println("reiniltalized the static var through object of the class "+ obj.str);
System.out.println("after initalizing the"+str);

} 

void dis() 
{ 
System.out.println("THE Instance Method can directly access static and instance varible without obj creation "+str+" "+instanceVar+"\n");

}

static void display()
{

System.out.println("static variable directly displayed by user-defined static method "+ str+"\n");  
System.out.println("instance variable displayed by user-defined static method by object creation"+ new Static_Demo().instanceVar+"\n"); 

} 

static 
{ 

System.out.println("IM THE STATIC BLOCK"); 
str="IM STATIC VARIABLE created by static block";
System.out.println(str); 

Static_Demo sd=new Static_Demo();
sd.instanceVar="IM INSTANCE VARIABLE created by the static block";
System.out.println(sd.instanceVar);

}


}