package org.example;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
    public static void main(String[] args) {
        Map<String, String> phonebook= new HashMap<String, String>();

        phonebook.put("AAA","jerish");
        phonebook.put("BBB","John");
        phonebook.put("CCC","prodapt");
        phonebook.put("DDD","pooru");

        System.out.println(phonebook.get("CCC"));
        System.out.println(phonebook.keySet());
        System.out.println(phonebook.values());
        System.out.println(phonebook.entrySet());
    }
}
