import java.util.HashMap;
import java.util.Map;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(11,"aba");
        map.put(22,"sas");
        map.put(13,"bcb");
        map.put(43,"aaa");
        map.put(56,"bbb");
        map.put(64,"ara");
        map.put(72,"sha");
        map.put(85,"rrr");
        map.put(96,"aaa");
        map.put(17,"bbb");
        System.out.println(map);
        System.out.println(map.get(56));
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(int i : map.keySet()){
            System.out.println(i+" "+map.get(i));
        }

    }
}
