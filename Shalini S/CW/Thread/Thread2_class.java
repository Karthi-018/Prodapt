public class Thread2_class extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                sleep(2000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
