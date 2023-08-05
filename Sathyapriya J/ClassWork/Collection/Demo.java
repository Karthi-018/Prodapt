
import java.util.ArrayList;
import java.util.*;

public class Demo {
    public static void main(String a[])
    {
        Set<Integer> data = new TreeSet<>();
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(4);
        data.remove(1);
        System.out.println(data.size());

      /*for (int i : data)
       {
           //int n = (int)i;
           System.out.println(i);
        }*/
        //System.out.println(data);

        List<Integer> l = Arrays.asList(13,2,63,54,15,40);
        l.sortn {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<o2)
                {
                    return 1;
                }
                else if(o1>o2)
                {
                    return -1;
                }
                else {
                    return 0;
                }

            }
        });
        data.forEach(System.out::print);
        System.out.println();
        System.out.println("-------------");
        l.forEach(System.out::println);


    }
}
