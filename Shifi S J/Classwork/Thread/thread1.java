class thread1 extends Thread{
public void run()
{
display();
}
public void display()
{

        for(int i=0;i<5;i++)
            System.out.println("Java");
try{
sleep(1000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}

}

}


