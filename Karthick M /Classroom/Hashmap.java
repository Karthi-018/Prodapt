package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Hashmap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Map<Integer,String> map=new HashMap();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        map.put(6,"f");
        int n=s.nextInt();
        System.out.println(map.get(n));
    }
}