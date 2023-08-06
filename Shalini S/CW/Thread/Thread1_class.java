public class Thread1_class extends Thread {
     public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Java");
            try {
                sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
