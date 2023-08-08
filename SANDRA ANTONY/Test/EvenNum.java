import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class EvenNum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        List<Integer> l = new ArrayList<>();

        for(int i=0; i<20; i++)
        {

            l.add(r.nextInt(100));

        }

        int sum = 0;
        for(int i:l)
        {
            if(i%2==0)
            {
             sum  = sum+(i*2);


            }
        }
        System.out.println("The sum of even integers are: "+sum);

    }
}