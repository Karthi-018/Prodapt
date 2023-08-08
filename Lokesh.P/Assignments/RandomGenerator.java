import java.util.*;
public class RandomGenerator {
    public static void main(String[] args) {
        //Random r = new Random();
        //r.nextInt(100);
        List<Integer> l = new ArrayList<>();
        int arr[] = new int[50];
        for(int i=0;i< arr.length;i++)
        {
            l.add(i);
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
