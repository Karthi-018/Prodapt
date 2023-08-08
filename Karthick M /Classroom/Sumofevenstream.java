import java.util.*;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Sumofevenstream{
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> l=new ArrayList();
        for (int i = 0; i < 10; i++) {
            l.add(r.nextInt(100));
        }
        Stream<Integer> s=l.stream();
        Stream<Integer> s1=s.filter(n -> n%2==0);
        Stream<Integer> s2=s1.map(n -> (n*2));
        int res=s2.reduce(0,(total,i)->total+i);
        System.out.println(res);
    }
}