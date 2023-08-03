import java.util.*;
import java.util.LinkedHashMap;

public class demoMap {
    public static void main(String a[]) {

        Map<String, String> Tel = new LinkedHashMap<String, String>();
        Tel.put("Ashik","6379421332");
        Tel.put("Ashi", "9597845131");
        Tel.put("Sathi", "6379225132");
        Tel.put("Karthi","9165354781");
        Tel.put("Bala","9264371831");
        Tel.putIfAbsent("Karthi","9165354782");
        Tel.remove("Ashi");
        //Tel.replace();
        //System.out.println(Tel.keySet());
        //System.out.println(Tel.get("Ashi"));
        //System.out.println(Tel.entrySet());
        for(String t:Tel.keySet()){
            System.out.println(t+" "+Tel.get(t));
        }
        if (Tel.containsKey("Ashik"))
        {
            System.out.println("present");
        }
        System.out.println(Tel.hashCode());
    }
}