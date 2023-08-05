package assignment;

public class Threads2 extends Thread implements Runnable{
    static int hc=0;
    public synchronized void  run(){
        for(int i=0;i<1000;i++){
            System.out.println(hc);
            hc++;
            sleep(1000);
        }


    }

    private void sleep(int i) {

    }

    public static void main(String[] args) {
//        Threads2 threads2=new Threads2();//child
//        Thread t=new Thread(threads2); //parent
//        t=(Thread) threads2;
        Thread t,t1;
        t=new Threads2();
        t1=new Threads2();
        t.start();
        t1.start();
        System.out.println(hc);
    }
}
