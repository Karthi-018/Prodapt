class Demo extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Java World");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Test extends  Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello Programmer Vs Coder");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadEx1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        Test t = new Test();
        d.start();
        t.start();

    }
}
