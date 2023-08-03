package org.example;
import java.util.*;

 class phonebook {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new TreeMap<>();

        phonebook.put("LENIN", "999999991");
        phonebook.put("FASIL", "8888888882");
        phonebook.put("KARTHICK", "7777777773");
        phonebook.put("LAVANYA", "6666666664");
        phonebook.put("MAAYA", "8989898989");
        System.out.println("Enter ur Choice");


        String s = scanner.next();
        System.out.println(phonebook.get(s));
        System.out.println(phonebook.keySet());
        System.out.println(phonebook.entrySet());
        for (String key : phonebook.keySet())
        {
            System.out.println(key + " " + phonebook.get(key));

        }

    }
}








