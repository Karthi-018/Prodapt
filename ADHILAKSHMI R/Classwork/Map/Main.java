package org.example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<telephone> phonebook = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        for(int j=0;j<size;j++) {
            String n = sc.next();
            int b = sc.nextInt();
            phonebook.add(new telephone(n,b));
            System.out.println(n+" "+b);
        }

        String searchName = "DDD";

        int x = 0;
        for (telephone t : phonebook) {

            if (t.getName().equals(searchName)) {
               // System.out.println("The number is " + t.getNumber());
                x = 1;
                System.out.println("The number is " + t.getNumber());
            }
        }
            if(x==0){
                System.out.println("The number is not found");
            }



        }
}









