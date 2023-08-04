public class Main {
    synchronized public static void main(String a[]) {
        Demo d = new Demo();
        Test t = new Test();
        d.start();
        t.start();
        try {
            d.join();
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}