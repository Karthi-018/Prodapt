package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList l=new ArrayList();
        for(int i=0;i<5;i++)
        {
            l.add(r.nextInt(99));

        }

            Stream <Integer> s=l.stream();
            Stream s1=s.filter(n->n % 2==0);
            Stream s2=s.map(n->(n*2));
            int result = s2.reduce(0,(total,i)->total+i);

    }
}

