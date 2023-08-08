public class ThreadDemo extends Thread{
    public void run(){
        for(int i=0;i<4;i++)
        System.out.println("lavanya");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ThreadDemo obj=new ThreadDemo();
        obj.start();
        ThreadDemo1 obj1=new ThreadDemo1();
        obj1.start();
        System.out.println(obj1.getPriority());
        obj1.setPriority(8);
    }
}
