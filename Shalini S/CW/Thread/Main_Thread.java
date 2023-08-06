public class Main_Thread {
     public static void main(String args[]) throws InterruptedException{
        Thread1_class t1=new Thread1_class();
        Thread2_class t2=new Thread2_class();
        Thread t = new Thread(t2);
        t2.setPriority(9);
        t1.start();
        t2.start();
        //t1.join();
    }
}
