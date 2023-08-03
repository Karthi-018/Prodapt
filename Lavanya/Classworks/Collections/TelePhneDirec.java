package Collections;
import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class TelePhneDirec {
    public static void main(String[] args) {
//        Collection<Collections.TelePhneDirecClass> data= Arrays.asList(new Collections.TelePhneDirecClass(123456789,"lavanya"),
//                (new Collections.TelePhneDirecClass(123456789,"ram")),
//                (new Collections.TelePhneDirecClass(123456789,"riya")));
        List<TelePhneDirecClass> data=new ArrayList<>();
        data.add(new TelePhneDirecClass("lavan", 726134746));
        data.add(new TelePhneDirecClass("yamini", 726134746));
        data.add(new TelePhneDirecClass("diya", 726134746));
        Iterator<TelePhneDirecClass> i=data.iterator();
        while(i.hasNext()){
            TelePhneDirecClass data1=i.next();
            if(data1.getName().equals("lavanya")) {
                System.out.println(data1);
            }

        }


    }
}
