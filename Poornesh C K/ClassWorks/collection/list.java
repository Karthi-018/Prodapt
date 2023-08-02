import java.util.*;

public class list {

        public static void main(String args[]){

            //Collection data = new ArrayList();
            List<Integer> data= new ArrayList<>(3);
            //System.out.println(data.size());
            data.add(1);
            //data.add("tff");
            data.add(45);
            data.add(1,45);
            data.add(8787);
            System.out.println(data.size());

            data.remove(new Integer(45));
            System.out.println(data.size());

            System.out.println("-----------------");
            List<Integer> l= Arrays.asList(1,31,6,78,7);
            l.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer integer, Integer t1) {
                    if(integer>t1){
                        return  -1;
                    } else if (t1>integer) {
                        return 1;

                    }
                    else{
                        return  0;

                    }
                }
            });
            //System.out.println(data);
            data.forEach(System.out::print);
            System.out.println();
            System.out.println("-----------------");
            l.forEach(System.out::println);



        }


}
