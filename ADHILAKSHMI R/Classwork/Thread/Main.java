package org.example;

public class Main{
    public static void main(String args[]){
        neww  n=new neww();
        cla c=new cla();
        n.start();
        c.start();
        System.out.println(n.getId());
        System.out.println(c.getId());
        c.setPriority(Thread.MAX_PRIORITY);
        n.setPriority(10);
    }
}