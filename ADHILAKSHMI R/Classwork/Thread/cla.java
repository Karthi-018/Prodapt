package org.example;
    public class cla extends Thread{
        public synchronized void run(){
            int count=0;
            for(int i=0;i<10;i++){
                System.out.println("java");
                count++;
                try {
                    sleep(1000);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

