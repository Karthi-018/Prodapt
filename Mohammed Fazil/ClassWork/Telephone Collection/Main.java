package org.example;
import java.util.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Details>  telephone= new ArrayList<>();
        telephone.add(new Details("Fazil",12345678));
        telephone.add(new Details("Karthi",12345678));
        telephone.add(new Details("Dinesh",12345678));
        System.out.println("Enter Name ;");
        String a = scanner.next();

        Iterator<Details> i = telephone.iterator();
        while(i.hasNext()){
            Details d =i.next();
            if((d.getName()).equals(a)){
                System.out.println((d.getPh_NO()));
            }


        }

    }
}