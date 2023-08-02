import java.util.*;
public class Collection_class {
    public static void main(String args[]) {
        //heterogeneous collection
        Collection data = new ArrayList();
        data.add(1);
        data.add("Hai");
        data.add(3);
        data.add("hello");
        data.add(10);
        System.out.println(data);
        System.out.println("-----------------------------------------------");

        //making the collection homogeneous
        Collection <Integer> ele = new ArrayList<Integer>();
        ele.add(1);
        ele.add(3);
        ele.add(10);
        System.out.println(ele);
        System.out.println("----------------------------------------------");

        //use the below method if u already know the elements--(converting array to list)
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        System.out.println(list);
        System.out.println("----------------------------------------------");

        //converting list to array
        Object[] arr= list.toArray();
        for(Object o:arr){
            int i=(int)o;
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------");

        //using list
        List x = new ArrayList();
        //System.out.println(x.capacity());-array list does not have capacity method
        x.add(1);
        x.add("Hai");
        x.add(3);
        x.add("hello");
        System.out.println(x);
        System.out.println("Using size method:" +x.size());
        System.out.println("------------------------------------------------");

        //using vector
        Vector d = new Vector();
        System.out.println(d.capacity());
        d.add(1);
        d.add("Hai");
        d.add(3);
        d.add("hello");
        d.add(10);
        System.out.println(d);
        System.out.println("Using size method:" +d.size());


    }
}
