package org.example;

import java.util.concurrent.SynchronousQueue;

public class demo extends Thread {
    public   void run() {
        display();
    }

     public void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println("world");
            try {

                sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);

            }
        }
    }
}