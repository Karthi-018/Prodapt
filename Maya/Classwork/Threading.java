 class Threading 
{
    public static void main(String[] args)
    {
        Demo d= new Demo();
        Test t=new Test();
        d.start();
        t.start();

    }
}


 class Demo extends Thread

    {
        public void run()
        {
            for(int i=0;i<100;i++)
            {
                System.out.println("Java");
            }
            try
            {
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

        }

    }

 class Test extends Thread

    {
        public void run()
        {
            for (int i = 0; i < 100; i++)
            {
                System.out.println("World");
            }
            try 
	    {
                sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }

    }




