import java.util.ArrayList;
import java.util.*;
public class Demo2{
    public static void main(String args[]){

        //Collection data = new ArrayList();
        Collection<Integer> data= new ArrayList<>();
        data.add(1);
        //data.add("tff");
        data.add(45);
        data.add(56);
        data.add(8787);
        data.remove(new Integer(2));
        List<Integer> l= Arrays.asList(1,3,6,7,7);
         //System.out.println(data);
        data.forEach(System.out::println);
        l.forEach(System.out::println);



    }
}
