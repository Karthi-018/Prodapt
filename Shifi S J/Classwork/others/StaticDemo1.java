package org.example.staticdemo;
public class StaticDemo1{
static String strStatic="Static Variable";
String strInstance="Instance Variable";
static void display()
{
System.out.println(strStatic);
display();
}

public static void main(String[] args){
System.out.println(StaticDemo1.strStatic);
StaticDemo1.display();
StaticDemo1 sd = new StaticDemo1();
System.out.println(sd.strInstance);
sd.strStatic = "ABC";
System.out.println(sd.strStatic);
System.out.println(StaticDemo1.strStatic);
}static{
    strStatic = "Init in Static Block";
    StaticDemo1 staticDemo = new StaticDemo1();
    staticDemo.strInstance = "Init the instance variable in static block";
    System.out.println(StaticDemo.strStatic);
}
}