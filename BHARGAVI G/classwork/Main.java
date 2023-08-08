package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ab = new ArrayList<>();
        //creating object for random
        Random ran=new Random();
        for (int i = 0; i < 10; i++) {
            ab.add(ran.nextInt(50));
        }
//        System.out.println(ab);
//        int sum = 0;
//        for (int i :ab) {
//            if (i % 2 == 0) {
//                i = i * 2;
//                sum = sum + i;
//            }
//        }
        System.out.println(ab);
        Stream<Integer> s=ab.stream();
        System.out.println(s);
        Stream<Integer> s1=s.filter(n-> n%2 == 0);
        Stream<Integer> s3=s1.map(n-> n*2 );
       int result = s3.reduce(0,(t,n)-> t+n);

        System.out.println("sum is:" + result);
    }
}
