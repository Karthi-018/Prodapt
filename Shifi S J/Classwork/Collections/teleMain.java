package org.example;
import java.util.*;
import java.util.ArrayList;


public class teleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<telePojo>  telephone= new ArrayList<>();
        telephone.add(new telePojo("Shifi",9222343455));
        telephone.add(new telePojo("Sandra",9812347668));
        telephone.add(new telePojo("Lenin",9373763366));
        System.out.println("Enter Name ;");
        String a = scanner.next();

        Iterator<telePojo> i = telephone.iterator();
        while(i.hasNext()){
            Details d =i.next();
            if((d.getName()).equals(a)){
                System.out.println((d.getPh_NO()));
            }


        }

    }
}