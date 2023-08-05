package Thread;

public class Main {
    public static void main(String[] args) {
//        Demo d1 = new Demo();
//        Demo d2 = new Demo();
//        Thread t1 = new Thread(d1);
//        Thread t2 = new Thread(d2);
//        t1.start();
//        t2.start();
        String name = "hi this is arun";
        for(char c : name.toCharArray()){
            System.out.print(c);
            try{Thread.sleep(200);}catch (Exception e){}
        }
    }
}
class Demo extends Thread{
    synchronized public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}
