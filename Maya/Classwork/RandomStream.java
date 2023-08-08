package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RandomStream {
    public static void main(String[] args) {
        Random r=new Random();
//        int sum=0;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<=50;i++)
        {
            arr.add(r.nextInt(100));

        }
        System.out.println(arr);
//        for(int i:arr)
//        {
//            if(i%2==0)
//            {
//                i=i*2;
//                sum=sum+i;
//            }
//        }

        Stream<Integer> s=arr.stream();
        Stream<Integer> s1=s.filter(n-> n%2 ==0);
        Stream<Integer> s2=s1.map(n->n*2);
        int sum=s2.reduce(0,(t,n)->t+n);
        System.out.println("Sum is "+sum);
        }
    }
