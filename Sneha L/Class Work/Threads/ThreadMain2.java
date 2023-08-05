class Demo extends Thread  //Thread class
{
    public void run()     //in every thread you need a run method
    {
        for(int i=0;i<10;i++){
        System.out.println("hi");
        try{
        Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
}
class Test extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++){
        System.out.println("hello");
        try{
        Thread.sleep(105); //sometimes both the thread runs on same milliseconds so the same statement might print again
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
}
public class ThreadMain2{
    public static void main(String[] args) throws NumberFormatException {
        Demo obj1=new Demo();
        Test obj2=new Test();
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(2);
        System.out.println(obj1.getPriority());//by default the getPriority is 5 here it is 2
        obj1.start(); 
        try{
        Thread.sleep(10);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        } 
        obj2.start();
    
    }
}
