package org.example;

public class FunThread {
    public static void main(String[] args) throws InterruptedException {

        String name = "Hi Shifi! Welcome back";
        for(String c:name.split(" "))
        {
            System.out.println(" "+c);
            Thread.sleep(200);
        }
        for(char c:name.toCharArray())
        {
            System.out.println(" \n"+c);
            Thread.sleep(50);
        }
        for(char c:name.toCharArray())
        {
            System.out.print(c);

            Thread.sleep(50);
        }
        }
}
