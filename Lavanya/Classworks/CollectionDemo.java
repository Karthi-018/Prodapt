import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    String name;
    int i;

    public String getName() {
        return name;
    }

    public int getI() {
        return i;
    }

    public int getMark() {
        return mark;
    }

    public CollectionDemo(String name, int i, int mark) {
        this.name = name;
        this.i = i;
        this.mark = mark;
    }

    int mark;
    public static void main(String[] args) {
        Collection<Integer> data= Arrays.asList(12,23,45,67);
        Object a[]=data.toArray();
        for(Object i: a){
            System.out.println(i);
        }
//        data.add(122);
//        data.add(45);
//        data.add(12);
//        data.add(23);
        System.out.println(data);


//        ArrayList<CollectionDemo> data=new ArrayList<>();
//        data.add(new CollectionDemo("diya",1,12));
//        data.add(new CollectionDemo("dev",3,92));
//        data.add(new CollectionDemo("ram",5,82));
//       // data.add(2,23);
//        data.add(new CollectionDemo("sita",8,62));
//        //data.remove(3);
//       // data.remove(2);
//        for(CollectionDemo i:data){
//        System.out.println(i.getI()+" "+i.getName()+" "+i.getMark());}

    }
}
