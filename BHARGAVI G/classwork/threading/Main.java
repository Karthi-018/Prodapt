package org.example;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 public class Main {
     public static void main(String[] args) {
        demo d = new demo();
        test t = new test();
        t.start();
        d.start();
        d.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(1);
        try{
            t.join();
            d.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(d.getId());
        System.out.println(d.getName());
        System.out.println(t.getName());
        System.out.println(t.getId());
         System.out.println(d.isDaemon());


    }
}