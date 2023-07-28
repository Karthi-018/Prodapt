package org.example.staticdemo;

public class StaticDemo {

    static String strStatic;
    String strInstance ="Instance Variable";

    static void display()
    {
        System.out.println(strStatic);
    }

    public static void main(String[] args) {

        System.out.println(strStatic);
        display();

        StaticDemo sd = new StaticDemo();
        System.out.println(sd.strInstance);
        sd.strStatic = "ABC";
        System.out.println(sd.strStatic);
        System.out.println(StaticDemo.strStatic);


    }

    static {
        strStatic = "Init in Static Block";
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.strInstance = "Init the Instance Variable in Static block";
        System.out.println(staticDemo.strInstance);
    }
}
