public class Test extends Thread{
    public void run() {
        display();
    }
    synchronized public void display(){
        for(int i=0;i<=2;i++)
        {
            System.out.println("RJ");
        }
    }

}
