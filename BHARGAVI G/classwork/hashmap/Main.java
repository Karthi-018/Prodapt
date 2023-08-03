package org.example;
import java.util.HashMap;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> phonenum =new HashMap<String,Integer>();
        phonenum.put("abc",123456789);
        phonenum.put("a",3456789);
        System.out.println(phonenum);
        System.out.println(phonenum.keySet());
        for(String i :phonenum.keySet())
        {
            System.out.println(i);
        }
        System.out.println(phonenum.values());
        for(int i :phonenum.values())
        {
            System.out.println(i);
        }
    }
}