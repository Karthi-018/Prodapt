import java.util.Scanner;

public class Main{
    public static void attendance(String... att)
    {
        System.out.println(att.length+" Students are present in the class");
        for(String s: att )
        {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Staff[] workers = new Staff[2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++){
            int id = sc.nextInt();
            String name = sc.next();
            long salary = sc.nextLong();
            workers[i] = new Staff(id,name,salary);
        }
        for(Staff e : workers){
            System.out.println(e);
        }
        attendance();
        attendance("lokesh","arun");
    }
}