package org.example;

public class neww extends Thread {
    static int count = 0;


    public synchronized void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("world");
            count++;
        }


        try {
            sleep(1000);
            System.out.println("the count:" +count);

        } catch (Exception e) {
            System.out.println(e);
        }
    }


}


