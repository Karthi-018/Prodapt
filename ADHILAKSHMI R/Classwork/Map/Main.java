

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Long> phoneBook = new LinkedHashMap<String, Long>();

        phoneBook.put("AAA", 9087654321l);
        phoneBook.put("EEE", 9807654321l);
        phoneBook.put("BBB", 9780765432l);
        phoneBook.put("DDD", 9678054321l);
        phoneBook.put("CCC", 1023456781l);
        phoneBook.putIfAbsent("CCC", 12346789l);
        phoneBook.remove("CCC");

        System.out.println(phoneBook.entrySet());
        System.out.println(phoneBook.get("AAA"));
        System.out.println(phoneBook.keySet());
        System.out.println(phoneBook.values());

        for (String key : phoneBook.keySet()) {

            System.out.println(key + " " + phoneBook.get(key));
        }

        phoneBook.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}