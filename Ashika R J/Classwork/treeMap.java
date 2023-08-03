import java.util.*;
import java.util.TreeMap;

public class treeMap {
    public static void main(String a[]) {

        Map<String, String> Tel = new TreeMap<String,String>();
        Tel.put("Ashik","6379221332");
        Tel.put("Ashi", "9597845131");
        Tel.put("Karthi","9165354781");
        Tel.put("Bala","9264371831");
        System.out.println(Tel.keySet());
        System.out.println(Tel.get("Ashik"));
        System.out.println(Tel.entrySet());

    }
}