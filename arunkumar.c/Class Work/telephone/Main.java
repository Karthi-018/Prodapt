package telephone;
import java.util.*;
public class Main {
    static ArrayList<Telephone>  telephones = new ArrayList<>();

    public static void main(String[] args) {

        Telephone t1 = new Telephone("arun",1111111);
        Telephone t2 = new Telephone("shanu",222222);
        Telephone t3 = new Telephone("padhu",333333);
        Telephone t4 = new Telephone("sneha",44444);
        Telephone t5 = new Telephone("shalini",5555);

        telephones.add(t1);
        telephones.add(t2);
        telephones.add(t3);
        telephones.add(t4);
        telephones.add(t5);

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(find(name));
    }
    public static long find(String name){
        for(Telephone t : telephones){
            if(t.getName().equals(name)){
                return t.getNumber();
            }
        }
        return -1;
    }
    public static long find2(String name){
        Iterator<Telephone> i = telephones.iterator();
        while(i.hasNext()){
            Telephone t = i.next();
            if(t.getName().equals(name)){
                return t.getNumber();
            }
        }
        return -1;
    }
}

