public class mainthread {
    public static void main(String[] args) throws InterruptedException {
        threadsample o = new threadsample();
       Runnable r1 = new Runnable() {
           @Override
           public void run() {
                o.getCount();
           }
       };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                o.getCount();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);


        t1.start();
        t2.start();
       t1.join();
       t2.join();
        System.out.println(o.count);


//
        //t2.setDaemon(true);//to work in background it will throw exception when threads gets interuptted
//        System.out.println(t2.getPriority());
//        System.out.println(t1.getId());
//        System.out.println(t1.getState());
//        System.out.println(t1.getName());

    }
}
