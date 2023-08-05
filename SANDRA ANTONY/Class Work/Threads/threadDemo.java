import com.sun.jmx.snmp.tasks.ThreadService;
import java.util.*;

class threadDemo extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hi");
            try
            {
                sleep(50);                    //this delays the output of 'hi'
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }

    }
}
class Test extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hello");
            try
            {
                sleep(500);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }

    }
}
class MainClass                                            //total 3 threads running in parallel
{
    public static void main(String[] args) throws InterruptedException {
        threadDemo t1 = new threadDemo();
        Test t2 = new Test();
        //t1.start();
        //t2.start();

        String name="Hiiii Sandra Antony here";
        for( char c:name.toCharArray())
        {
            System.out.print(c);
            Thread.sleep(300);
        }

//        t1.join();     //to sync
//        t2.join();

        //t1.setPriority();

    }
}