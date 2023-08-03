package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Telephone> data =  new ArrayList<>();

        Telephone t1= new Telephone ("AAA",90239023);
        Telephone t2=new Telephone("BBB",9232342);
        Telephone t3 =new Telephone("CCC",7325987);
        Telephone t4 = new Telephone("DDD",32969823);
        Telephone t5 =new Telephone("EEE",923752);

        data.add(t1);
        data.add(t2);
        data.add(t3);
        data.add(t4);
        data.add(t5);

        data.forEach(System.out::println);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name to search : ");
        String sname=sc.next();

        Iterator<Telephone> i = data.iterator();
        while(i.hasNext()){
            Telephone tname=i.next();
            if (tname.getName().equals(sname)){
                System.out.println(tname);
            }

        }

    }
}