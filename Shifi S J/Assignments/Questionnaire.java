import java.util.*;
public class Questionnaire
{
public static void main (String args[])
{

System.out.println("1.The default value of a static integer variable of a class in Java is \n a)0 \n b)null \n c)garbage value \n d)1");

Scanner sc=new Scanner(System.in);
System.out.println("Please enter your answer: ");
int ans=sc.nextInt();

if(ans==0){
System.out.println("Correct Answer");
}
else{
System.out.println("Sorry, incorrect Answer");
}


System.out.println("2. To prevent any method from overriding, we declare the method as \n a)static \n b)final \n c)abstract \n d)none");

System.out.println("Please enter your answer: ");
String obj=sc.next();

if(obj.equals("final")){
System.out.println("Correct Answer");
}
else{
System.out.println("Sorry,Incorrect Answer");
}


System.out.println("3.Which of the following variable declaration would NOT compile in a java program \n a)int var \n b)int VAR \n c)int var_1 \n d)int 1_var");

System.out.println("Enter your answer: ");
String s2=sc.next();

if(s2.equals("int 1_var")){
System.out.println("Correct Answer");
}
else{
System.out.println("Oops,Try again");
}


System.out.println("4.Which of the following is a member of the java.lang package \n a)Math \n b)List \n c)Queue \n d)Stack");

System.out.println("Enter your answer: ");
String s8=sc.next();

if(s8.equals("Math")){
System.out.println("Wohooo, Correct Answer");
}
else{
System.out.println("Incorrect Answer");
}


System.out.println("5.What is the initial quantity of the ArrayList list? \n a)5 \n b)10 \n c)0 \n d)100");

System.out.println("Enter your answer: ");
int a=sc.nextInt();

if(a==10){
System.out.println("Yesss, correct Answer");
}
else{
System.out.println("Sorry, Incorrect Answer");
}


System.out.println("6.What type of Java Programs can be run inside a Java supported Web Browser? \n a)Stand alone \n b)Struts \n c)Applets \n d)AWT");

System.out.println("Enter your answer: ");
String s4=sc.next();

if(s4.equals("Applets")){
System.out.println("Correct Answer");
}
else{
System.out.println("Incorrect Answer");
}


System.out.println("7.In object-oriented programming, new classes can be defined by extending existing classes. This is an example of: \n a)Encapsulation \n b)Abstraction \n c)Inheritance \n d)Interface");

System.out.println("Enter your answer: ");
String S9=sc.next();

if(S9.equals("OAK")){
System.out.println("Correct Answer");
}
else{
System.out.println("Incorrect Answer");
}


System.out.println("8.The wrapping up of data and functions into a single unit is called \n a)Abstraction\n b)Encapsulation \n c)Polymorphism \n d)Inheritance");

System.out.println("Enter your answer: ");
String S7=sc.next();

if(S7.equals("Encapsulation")){
System.out.println("Correct Answer");
}
else{
System.out.println("Incorrect Answer");
}


System.out.println("9.In java, objects are passed as \n a)Copy of that object \n b)Method called call by value \n c)Constructor \n d)Memory address");

System.out.println("Enter your answer: ");
String S5=sc.next();

if(S5.equals("Memory address")){
System.out.println("Correct Answer");
}
else{
System.out.println("Incorrect Answer");
}


System.out.println("10.All exception types are subclasses of the built-in class \n a)Exception \n b)RuntimeException \n c)Throwable \n d)Error");

System.out.println("Enter your answer: ");
String s6=sc.next();

if(s6.equals("Throwable")){
System.out.println("Correct Answer");
}
else{
System.out.println("Incorrect Answer");
}
}
}







