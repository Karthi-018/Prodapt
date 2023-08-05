package assignment;

public class Threads extends Thread
{

//    int method()
//    {
//        return 6;
//    }
    public void run()
    {   String s="VANAKKAM DA MAAPLA!";
        char arr[]=s.toCharArray();
        for(int i=0;i< arr.length;i++){
            //System.out.print(method());
            System.out.print(arr[i]);



            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Threads t =new Threads();
        Threads t2=new Threads();
        Threads1 t1=new Threads1();
        t.setPriority(1);
        t2.setPriority(7);
        t1.setPriority(9);
        t.setName("HARI");
        System.out.println(t.getName());

        t.start();

        //t2.start();
        //t1.start();
    }

}
