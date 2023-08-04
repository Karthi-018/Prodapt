package org.example;

public class test extends Thread{
    public void run() {
        display();
    }

    public void display() {
        {
            for (int i = 0; i < 5; i++)
                System.out.println("hello");
        }
        try{
            sleep(100);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}