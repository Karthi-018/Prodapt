// ---- another way to create a thread ----
class Demo extends Thread
{
    public void run()
    {
        display();
    }
    public void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print("Hii ");
            try
            {
                sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class ThreadMain3
{
    public static void main(String[] args) throws Exception
    {
        Demo d = new Demo();
        d.start();
    }
}
