package org.example;

import java.util.*;

public class Main_TelephoneDirectory

{
    Set <TelephoneDirectory> td = new HashSet<>();
    List<TelephoneDirectory> l=new ArrayList<>();
    public void createDirectory()
    {
        TelephoneDirectory t1=new TelephoneDirectory("AAA",1111111111);
        TelephoneDirectory t2=new TelephoneDirectory("BBB",22222222);
        TelephoneDirectory t3=new TelephoneDirectory("CCC",33333333);
        TelephoneDirectory t4=new TelephoneDirectory("DDD",444444444);
        TelephoneDirectory t5=new TelephoneDirectory("EEE",555555555);

        td.add(t1);
        td.add(t2);
        td.add(t3);
        td.add(t4);
        td.add(t5);
        td.add(t1);
        td.add(t2);

        l.addAll(td);


        td.forEach(System.out::println);

    }

    TelephoneDirectory t = new TelephoneDirectory();

    public void search(String name)
    {
        //l array list
        int flag=0;
        for(TelephoneDirectory i:l)
        {
            if(i.getName().equals(name)){
                System.out.println(i);
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println("Name not found!!!!!");
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Main_TelephoneDirectory m=new Main_TelephoneDirectory();
        m.createDirectory();

        System.out.println("*****TELEPHONE DIRECTORY*****");
        System.out.println("Enter name to display respective phone number: ");
        String searchName=sc.next();
        m.search(searchName);




    }
}
