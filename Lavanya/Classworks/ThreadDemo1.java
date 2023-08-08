public class ThreadDemo1 extends Thread {
    public synchronized void run(){
        System.out.println("ThreadDemo1");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
