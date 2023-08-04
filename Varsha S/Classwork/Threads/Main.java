// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters

/* ---- Normal multi thread ----
class Demo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Java");
            try{
                sleep(200); //speed of printing Java
            }
            catch(Exception e)
            {
                System.out.println(e);
        }
        }
    }
}
class Test extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("World");
        }
    }
}*/

class Main
{
    public static void main(String[] args) throws Exception{
//        Demo d = new Demo();
//        Test t = new Test();
//        d.start();
//        t.start();
        String s1 = new String("Arun");
        String s2 = "Arun";
        System.out.println(s1.equals(s2));
}
}


/* ---- to print character one by one ----
public class Main
{
    public static void main(String[] args) throws Exception{
        String str = "Hiiii I am Varrrrr!!";
        for(char c : str.toCharArray())
        {
            System.out.print(c);
            try
            {
                Thread.sleep(300);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}*/


/* ---- another way to create a thread ----
class Demo extends Thread
{
    public void run()
    {
        display();
    }
    public void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print("Hii ");
            try
            {
                sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Main
{
    public static void main(String[] args) throws Exception
    {
        Demo d = new Demo();
        d.start();
    }
}
*/

