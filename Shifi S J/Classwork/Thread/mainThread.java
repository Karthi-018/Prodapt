
public class mainThread {
    public static void main(String[] args) {
        thread1 d=new thread1();
        thread2 d1=new thread2();
        d.start();
        d1.start();
	d.setPriority(7); //sets priority value
	//d1.setDaemon(true); //gives exception notification
	//d.setDaemon(true);
System.out.println(d.getId());
System.out.println(d1.getId());
System.out.println(d.getName());
System.out.println(d1.getName());
System.out.println(d.getPriority());
System.out.println(d1.getPriority());

try
{
d.join();
d1.join();
}
catch(InterruptedException e)
{
e.printStackTrace();
}
  
}
}


//gives output in random order because of scheduler
