package org.example.teledir;

import java.util.*;

public class TelephoneMain {
    public static void main(String[] args)
    {

    ArrayList<TelephoneDirectory> td=new ArrayList<>();

    td.add(new TelephoneDirectory("abc",45678));
    td.add(new TelephoneDirectory("abc",23456));
    td.add(new TelephoneDirectory("ghi",987654));
    td.add(new TelephoneDirectory("jkl",97345));
    td.add(new TelephoneDirectory("mno",2349876));

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter search name");
    String searchval = sc.next();


        for(int i=0;i<td.size();i++)
        {
            if(td.get(i).getName().equals(searchval))
            {
                System.out.println(td.get(i));
            }
        }

//    Iterator<TelephoneDirectory> i = td.iterator();
//
//    while(i.hasNext())
//    {
//        TelephoneDirectory t = i.next();
//        if(t.getName().equals(searchval))
//        {
//            System.out.println(t);
//        }
//    }

    }
}
