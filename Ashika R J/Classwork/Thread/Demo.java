public class Demo extends Thread {
    public void run() {
       display();
   }
   synchronized public void display(){
        for(int i=0;i<=2;i++)
       {
           System.out.println("Hi");
           /*try {
               sleep(1000);
           } catch (InterruptedException e)
           {
               throw new RuntimeException(e);
           }*/
       }
    }

}
