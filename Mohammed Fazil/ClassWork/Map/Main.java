package org.example;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<String,String> telephone = new HashMap<>();
        telephone.put("fazil","9789081761");
        telephone.put("kaith","9789081761");
        telephone.put("JAI","9789081762");
        System.out.println(telephone.get("fazil"));
        System.out.println(telephone.keySet());
        telephone.forEach ((k,v)->{System.out.println(k+" "+v);});
        //Map.Entry<String, String> key : telephone.entrySet())
        //{
          //  System.out.println(key);
        //}




    }

}