
class Demo implements Runnable //to overcome the ambiguity of accessing thread class and a class, we want to implement the Runnable Interface which as the run() method as in Thread class
{
    public void run()   
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
class Test  implements Runnable
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
public class ThreadMain3{
    public static void main(String[] args) throws NumberFormatException {
        Demo obj1=new Demo();
        Test obj2=new Test();
        Thread t1=new Thread(obj1); 
        Thread t2=new Thread(obj2);//While accessing Runnable Interface since there is no Thread method we have to create a object with it
        t1.start();
        t2.start();
    
    }
}
