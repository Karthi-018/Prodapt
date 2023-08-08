import java.util.*;
import java.util.stream.Stream;
public class StreamMain{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        // int count=0;
        Random rand=new Random();
        for(int i=0;i<50;i++)
        {
            al.add(rand.nextInt(100));
        }
        //int result = al.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
        Stream<Integer> s=al.stream();
        Stream<Integer> s1=s.filter(n-> n%2==0);
        Stream<Integer> s2=s1.map(n-> n*2);
        int result = s2.reduce(0,(t,i)-> t+i);
        System.out.println(result);
       
    //     for(int i=0;i<50;i++)
    //     {
    //         al.add(rand.nextInt(100));
    //     }
    //     for(int i=0;i<50;i++)
    //     {
    //         if(al.get(i)%2==0)
    //         {
                
    //             int a=al.get(i)*2;
    //          count=count+a;

    //         }
    //     }
    //     System.out.println(al);
    // System.out.println(count);
   
    }
}
