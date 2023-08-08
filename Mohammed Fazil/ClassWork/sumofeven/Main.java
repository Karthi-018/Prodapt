package org.example;
import java.util.*;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        Random r = new Random();
        for(int i = 0;i<50;i++) {
            data.add(r.nextInt(100));
        }
        for(int i=0 ; i<data.size();i++) {
            if (data.get(i) % 2 == 0) {
                d.add(data.get(i) * 2);
            }
        
        }
        int sum=0;
        for(int i=0;i<d.size();i++){
            sum= d.get(i);
        }
        System.out.println( "The array list "+ data);
        System.out.println("The array is "+ d);
        System.out.println("the sum is "+sum);
    }
}