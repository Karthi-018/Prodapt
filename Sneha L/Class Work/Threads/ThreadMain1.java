class Demo extends Thread  //Thread class
{
    public void run()     //in every thread you need a run method
    {
        for(int i=0;i<10;i++){
        System.out.println("hi");
    }
}
}
class Test extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++){
        System.out.println("hello");
    }
}
}
public class ThreadMain1{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Test obj2=new Test();
        obj1.start();  //to start the thread and run() method is implicitly calls
        obj2.start();
    
    }
}
