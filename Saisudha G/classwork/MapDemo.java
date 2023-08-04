import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> m=new LinkedHashMap<>();
       // Map<String,String> m=new HashMap<>();
        //Map<String,String> m=new
        m.put("AAA","9617844560");
        m.put("BBB", "7305638901");
        m.put("CCC","8607654681");
        m.putIfAbsent("BBB", "1234567890");
        System.out.println(m.get("BBB"));
        System.out.println(m.keySet());
        System.out.println(m.values());
        for(String key:m.keySet()){
            System.out.println(key+" "+m.get(key));
        }
    }
}
