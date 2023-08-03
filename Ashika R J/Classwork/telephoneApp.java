import java.util.*;
import java.util.HashMap;

public class telephoneApp {
    public static void main(String a[]) {

        Map<String, String> Tel = new HashMap<String,String>();
        Tel.put("Ashik","6379221332");
        Tel.put("Ashi", "9597845131");
        System.out.println(Tel.keySet());
        System.out.println(Tel.get("Ashik"));
        System.out.println(Tel.entrySet());

    }
}