import java.util.ArrayList;
import java.util.*;

public class Tel_Dir {
    static ArrayList<Direc> al = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Direc t1 = new Direc("AAA", 961784456);
        Direc t2 = new Direc("BBB", 730563890);
        Direc t3 = new Direc("CCC", 860765468);
        al.add(t1);
        al.add(t2);
        al.add(t3);
        //find(sc);
        search(sc);

    }

    public static void find(Scanner sc) {
        System.out.println("Enter Name");
        String Name = sc.next();
        for (Direc  t : al) {
            if (Name.equals(t.getName())) {
                System.out.println(t);

            }

        }
    }
    public static void search(Scanner sc){

        System.out.println("Enter Name");
        String Name = sc.next();
        Iterator<Direc> i= al.iterator() ;
        while (i.hasNext()) {//it will search for nxt obj existence (t1,t2,t3)
            Direc d=i.next();// objects in t1,t2,t3
            if(d.getName().equals(Name)){
                System.out.println(d);
        }

    }
}}
