package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class evenDouble {
    public static void main(String[] args) {
        Random r =new Random();
        List<Integer> al=new ArrayList<>();
        for(int i=0; i<5; i++)
        {
            al.add(r.nextInt(99));
            }
            int count=0;
            for(int i : al)
            {
                if(i%2==0){
                    int a = i*2;
                    count = count +a;

                }
            }
            System.out.println(al);
            System.out.println(count);
        }


    }

