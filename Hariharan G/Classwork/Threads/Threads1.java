package assignment;

public class Threads1 extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("WORLD");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
