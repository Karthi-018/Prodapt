package Collections;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,Long> m=new java.util.HashMap<String, Long>();
        m.put("lavanya",68274389L);
        m.putIfAbsent("lavanya",682789L);
        m.put("aac",68274389L);
        System.out.println(m);
        for(String key:m.keySet()){
            System.out.println(key);
        }
        for(long value:m.values()){
            System.out.println(value);
        }
        m.forEach((key,value)->{
            System.out.println(key+" "+value);
        });

    }
}
