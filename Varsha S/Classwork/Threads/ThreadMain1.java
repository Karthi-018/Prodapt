// ---- Normal multi thread ----
class Demo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Java");
            try{
                sleep(200); //speed of printing Java
            }
            catch(Exception e)
            {
                System.out.println(e);
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
            System.out.println("World");
        }
    }
}

class ThreadMain1
{
    public static void main(String[] args) throws Exception{
        Demo d = new Demo();
        Test t = new Test();
        d.start();
        t.start();
       }
}
