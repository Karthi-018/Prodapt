package check;
import java.util.*;
import java.util.stream.Stream;

public class StreamMain
{   
    static ArrayList<Integer> list=new ArrayList<>();

    public static void main(String[] args)
    {
        long sum=0;
        Random rand=new Random();
        //USING NORMAL METHOD
        for(int i=0;i<5;i++)
        {
            list.add(rand.nextInt(1000));
        }
        for(int i=0;i<5;i++) {
            if (list.get(i) % 2 == 0) {
                sum += (list.get(i) * 2);
            }
        }
        System.out.println("SUM: "+sum);

        //USING STREAM API
        for(int i=0;i<5;i++)
        {
            list.add(rand.nextInt(1000));
        }
        Stream<Integer>  s = list.stream();
        Stream <Integer>s1=s.filter(n->(n%2)==0);
        Stream<Integer> s2=s1.map(n->(n*2));
        int result=s2.reduce(0,(t,n)->t+n);
        System.out.println("SUM: "+result);

    }
}
