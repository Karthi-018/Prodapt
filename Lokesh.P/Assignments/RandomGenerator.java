import java.util.*;
public class RandomGenerator {
    public static void main(String[] args) {
        Random r = new Random();
        
        List<Integer> l = new ArrayList<>();
        for(int i=0;i< 50;i++)
        {
            l.add(r.nextInt(100););
        }
        int sum=0;
        for(int i=0;i<l.size();i++)
        {


            if(l.get(i) %2==0)
            {
                sum=sum+l.get(i)*2;
            }

        }
        System.out.println(sum);

        System.out.println(l);
    }
}
