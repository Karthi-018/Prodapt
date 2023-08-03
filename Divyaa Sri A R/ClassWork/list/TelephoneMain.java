package org.example.list;

import org.example.list.Telephone;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class TelephoneMain {
    static ArrayList<Telephone> data = new ArrayList<>();
    public static void main(String a[]) {

        data.add(new Telephone("divya", "9845239854"));
        data.add(new Telephone("swe", "7934523433"));
        data.add(new Telephone("abi", "7543667899"));
        System.out.println(data);
        search();

    }

        public static void search()
        {
            System.out.println("Enter search name");
            Scanner sc = new Scanner(System.in);
            String searchName = sc.next();
            //for(Telephone t : data) {
              //  if (t.getName().equals(searchName)) {
                //    System.out.println(t.getNumber());
            Iterator<Telephone> i=data.iterator();
            while(i.hasNext()){
                Telephone t=i.next();
                if(t.getName().equals(searchName)){
                    System.out.println(t.getNumber());

                }
            }

        }




}
