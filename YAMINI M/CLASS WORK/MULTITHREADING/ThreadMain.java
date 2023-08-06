class A extends Thread {
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
            try{
                sleep(1040);
            }
            catch (Exception e){}
        }
    }
}
class Test extends Thread {
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
            try{
                sleep(1000);
            }
            catch (Exception e){}    //InterruptedException
        }
    }
}
public class ThreadMain
{
    public static void main(String args[]) throws Exception
    {
        A d=new A();
        Test t=new Test();
        d.start();
        t.start();
        d.join();
        t.join();

        System.out.println(t.getId());
        System.out.println(d.getId());
        System.out.println(t.getName());
        System.out.println(d.getName());
        System.out.println(t.getPriority());
        System.out.println(d.getPriority());

    }
}